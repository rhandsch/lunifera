package org.lunifera.metamodel.dsl.entity.tests

import com.google.inject.Inject
import java.util.HashMap
import java.util.Map
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.junit.Test
import org.junit.runner.RunWith
import org.lunifera.metamodel.dsl.entity.EntityInjectorProvider

@RunWith(typeof(XtextRunner))
@InjectWith(typeof(EntityInjectorProvider))
class CompilerTest {
	
	@Inject extension MultiFilesCompilationTestHelper
	
	@Test
	def void compareEntity() {
		'''
			package my.test
			
			entity Library {
			}
		'''.assertCompilesTo('''
			package my.test;

			public class Library {
			}
		''')
	}
	
	@Test
	def void compareProperty() {
		'''
			package my.test
			
			entity Library {
				var String name
			}
		'''.assertCompilesTo('''
			package my.test;

			public class Library {
			  private String name;
			  
			  /**
			   * Returns the name property or <code>null</code> if not present.
			   * 
			   * @return name
			   */
			  public String getName() {
			    return this.name;
			  }
			  
			  /**
			   * Sets the name property to this instance.
			   * 
			   * @param name
			   */
			  public void setName(final String name) {
			    this.name = name;
			  }
			}
		''')
	}
	
	@Test
	def void compareReference_Single() {
		val Map<String, CharSequence> expected = new HashMap<String, CharSequence>();
		expected.put("my/test/Library.java", 
		'''
			package my.test;

			import my.test.Book;
			
			public class Library {
			  private Book lastBorrowedBook;
			  
			  /**
			   * Returns the lastBorrowedBook reference or <code>null</code> if not present.
			   * 
			   * @return lastBorrowedBook
			   */
			  public Book getLastBorrowedBook() {
			    return this.lastBorrowedBook;
			  }
			  
			  /**
			   * Sets the lastBorrowedBook reference to this instance.
			   * 
			   * @param lastBorrowedBook
			   */
			  public void setLastBorrowedBook(final Book lastBorrowedBook) {
			    this.lastBorrowedBook = lastBorrowedBook;
			  }
			}
			''');
		
		expected.put("my/test/Book.java", '''
			package my.test;
			
			public class Book {
			}
			''');
		
			'''
			package my.test

			entity Library {
				refers Book lastBorrowedBook
			}
			
			entity Book {
			}
		'''.assertCompilesToMultiple(expected)
	}
	
	
	@Test
	def void compareReference_Multi() {
		val Map<String, CharSequence> expected = new HashMap<String, CharSequence>();
		expected.put("my/test/Library.java", 
		'''
			package my.test;

			import java.util.List;
			import my.test.Book;
			
			public class Library {
			  private List<Book> allBorrowedBooks;
			  
			  /**
			   * Returns an unmodifiable list of allBorrowedBooks.
			   * 
			   * @return allBorrowedBooks
			   */
			  public List<Book> getAllBorrowedBooks() {
			    ensureAllBorrowedBooks();
			    return java.util.Collections.unmodifiableList(this.allBorrowedBooks);
			  }
			  
			  /**
			   * Adds the given book to this object. <p>
			   * 
			   * @param book
			   */
			  public void addAllBorrowedBooks(final Book book) {
			    // If book is null, we do not add it
			    if(book==null){
			    	return;
			    }
			    
			    ensureAllBorrowedBooks();
			    
			    // Adds the parameter to the list
			    if(!this.allBorrowedBooks.contains(book)){
			    	this.allBorrowedBooks.add(book);
			    }
			  }
			  
			  /**
			   * Removes the given book from this object.
			   * 
			   * @param book
			   */
			  public void removeAllBorrowedBooks(final Book book) {
			    // If book or the allBorrowedBooks are null, we can leave
			    if(book==null || allBorrowedBooks==null){
			    	return;
			    }
			    
			    this.allBorrowedBooks.remove(book);
			  }
			  
			  /**
			   * Ensures that the list of allBorrowedBooks is created. It will be instantiated 
			   * lazy.
			   */
			  private void ensureAllBorrowedBooks() {
			    if (this.allBorrowedBooks == null) {
			    	this.allBorrowedBooks = new java.util.ArrayList<Book>();
			    }
			  }
			}
			''');
		
		expected.put("my/test/Book.java", '''
			package my.test;
			
			public class Book {
			}
			''');
		
			'''
			package my.test

			entity Library {
				refers Book[] allBorrowedBooks
			}
			
			entity Book {
			}
		'''.assertCompilesToMultiple(expected)
	}
	
	
	@Test
	def void compareContains_Single_withContainer() {
		val Map<String, CharSequence> expected = new HashMap<String, CharSequence>();
		expected.put("my/test/Library.java", 
		'''
			package my.test;
			
			import my.test.Book;
			
			public class Library {
			  private Book containedBook;
			  
			  /**
			   * Returns the containedBook reference or <code>null</code> if not present.
			   * 
			   * @return containedBook
			   */
			  public Book getContainedBook() {
			    return this.containedBook;
			  }
			  
			  /**
			   * Sets the containedBook reference to this instance.
			   * 
			   * ATTENTION:<br>
			   * The reference is defined as a containment reference, but no opposite is available.
			   * So the opposite will NOT be handled. Therefore you have to ensure that the parent of the reference
			   * is set properly.
			   * 
			   * @param containedBook
			   */
			  public void setContainedBook(final Book containedBook) {
			    
			    Book oldContainedBook = this.containedBook;
			    
			    // if the parent does not change, we can leave
			    if (oldContainedBook == containedBook) {
			    	return;
			    }
			    
			    // Assign the new value
			    this.containedBook = containedBook;
			    
			  }
			}
			''');
		
		expected.put("my/test/Book.java", '''
			package my.test;
			
			import my.test.Library;
			
			public class Book {
			  private Library library;
			  
			  /**
			   * Returns the library reference or <code>null</code> if not present.
			   * 
			   * @return library
			   */
			  public Library getLibrary() {
			    return this.library;
			  }
			  
			  /**
			   * Sets the library reference to this instance.
			   * 
			   * ATTENTION:<br>
			   * The reference is defined as a container reference, but no opposite is available.
			   * So the opposite will NOT be handled. Therefore you have to ensure that the parent of the reference
			   * is set properly.
			   * 
			   * @param library
			   */
			  public void setLibrary(final Library library) {
			    
			    Library oldLibrary = this.library;
			    
			    // if the parent does not change, we can leave
			    if (oldLibrary == library) {
			    	return;
			    }
			    
			    // Assign the new value
			    this.library = library;
			    
			  }
			}
			''');
		
			'''
			package my.test

			entity Library {
				contains Book containedBook
			}
			
			entity Book {
				container Library library
			}
		'''.assertCompilesToMultiple(expected)
	}
	
	
	@Test
	def void compareContains_Single_withContainerAndOpposite() {
		val Map<String, CharSequence> expected = new HashMap<String, CharSequence>();
		expected.put("my/test/Library.java", 
		'''
			package my.test;

			import my.test.Book;
			
			public class Library {
			  private boolean settingContainedBook;
			  
			  private Book containedBook;
			  
			  /**
			   * Returns the containedBook reference or <code>null</code> if not present.
			   * 
			   * @return containedBook
			   */
			  public Book getContainedBook() {
			    return this.containedBook;
			  }
			  
			  /**
			   * Sets the containedBook reference to this instance.
			   * 
			   * Since the reference is a containment reference, the opposite reference (Book.library) 
			   * of the containedBook will be handled automatically and no further coding is required to keep them in sync. 
			   * See {@link Book#setLibrary(Book)}.
			   * 
			   * @param containedBook
			   */
			  public void setContainedBook(final Book containedBook) {
			    if (settingContainedBook) {
			    	// avoid loops
			    	return;
			    }
			    
			    Book oldContainedBook = this.containedBook;
			    
			    // if the parent does not change, we can leave
			    if (oldContainedBook == containedBook) {
			    	return;
			    }
			    
			    try {
			    	// avoid loops
			    	settingContainedBook = true;
			    
			    	// First remove the element
			    	if (oldContainedBook != null) {
			    		oldContainedBook.setLibrary(null);
			    	}
			    	
			    	// Then assign the new value
			    	this.containedBook = containedBook;
			    	
			    	// Then add 'this' to the new value
			    	if (this.containedBook != null) {
			    		this.containedBook.setLibrary(this);
			    	}
			    } finally {
			    	settingContainedBook = false;
			    }
			    
			  }
			}
			''');
		
		expected.put("my/test/Book.java", '''
			package my.test;
			
			import my.test.Library;
			
			public class Book {
			  private boolean settingLibrary;
			  
			  private Library library;
			  
			  /**
			   * Returns the library reference or <code>null</code> if not present.
			   * 
			   * @return library
			   */
			  public Library getLibrary() {
			    return this.library;
			  }
			  
			  /**
			   * Sets the library reference to this instance.
			   * 
			   * Since the reference is a container reference, the opposite reference (Library.containedBook) 
			   * of the library will be handled automatically and no further coding is required to keep them in sync. 
			   * See {@link Library#setContainedBook(Library)}.
			   * 
			   * @param library
			   */
			  public void setLibrary(final Library library) {
			    if (settingLibrary) {
			    	// avoid loops
			    	return;
			    }
			    
			    Library oldLibrary = this.library;
			    
			    // if the parent does not change, we can leave
			    if (oldLibrary == library) {
			    	return;
			    }
			    
			    try {
			    // avoid loops
			    settingLibrary = true;
			    	// First remove the element
			    	if (oldLibrary != null) {
			    		oldLibrary.setContainedBook(null);
			    	}
			    	
			    	// Then assign the new value
			    	this.library = library;
			    	
			    	// Then add 'this' to the new value
			    	if (this.library != null) {
			    		this.library.setContainedBook(this);
			    	}
			    } finally {
			    	settingLibrary = false;
			    }
			    
			  }
			}
			''');
		
			'''
			package my.test
			
			entity Library {
				contains Book containedBook opposite library
			}
			
			entity Book {
				container Library library opposite containedBook
			}
		'''.assertCompilesToMultiple(expected)
	}
	
	@Test
	def void compareContains_Multiple_withContainer() {
		val Map<String, CharSequence> expected = new HashMap<String, CharSequence>();
		expected.put("my/test/Library.java", 
		'''
			package my.test;
			
			import java.util.List;
			import my.test.Book;
			
			public class Library {
			  private List<Book> containedBooks;
			  
			  /**
			   * Returns an unmodifiable list of containedBooks.
			   * 
			   * @return containedBooks
			   */
			  public List<Book> getContainedBooks() {
			    ensureContainedBooks();
			    return java.util.Collections.unmodifiableList(this.containedBooks);
			  }
			  
			  /**
			   * Adds the given book to this object. <p>
			   * ATTENTION:<br>
			   * The reference is defined as a containment reference, but no opposite is available.
			   * So the opposite will NOT be handled. Therefore you have to ensure that the parent of the reference
			   * is set properly.
			   * 
			   * @param book
			   */
			  public void addContainedBooks(final Book book) {
			    
			    // If book is null, we do not add it
			    if(book==null){
			        return;
			    }
			    
			    // Adds the parameter to the list
			    if(!this.containedBooks.contains(book)){
			    	this.containedBooks.add(book);
			    }
			    
			  }
			  
			  /**
			   * Removes the given book from this object. <p>
			   * ATTENTION:<br>
			   * The reference is defined as a containment reference, but no opposite is available.
			   * So the opposite will NOT be handled. Therefore you have to ensure that the parent of the reference
			   * is set properly.
			   * 
			   * @param book
			   */
			  public void removeContainedBooks(final Book book) {
			    // If the parameter or the field are null, we can leave
			    if (book == null || containedBooks == null) {
			    	return;
			    }
			    
			    // if the book is not contained, then we can leave
			    if (!this.containedBooks.contains(book)) {
			    	return;
			    }
			    
			    // Removes the parameter from the field
			    this.containedBooks.remove(book);
			    
			  }
			  
			  /**
			   * Ensures that the list of containedBooks is created. It will be instantiated 
			   * lazy.
			   */
			  private void ensureContainedBooks() {
			    if (this.containedBooks == null) {
			    	this.containedBooks = new java.util.ArrayList<Book>();
			    }
			  }
			}
			''');
		
		expected.put("my/test/Book.java", '''
			package my.test;

			import my.test.Library;
			
			public class Book {
			  private Library library;
			  
			  /**
			   * Returns the library reference or <code>null</code> if not present.
			   * 
			   * @return library
			   */
			  public Library getLibrary() {
			    return this.library;
			  }
			  
			  /**
			   * Sets the library reference to this instance.
			   * 
			   * ATTENTION:<br>
			   * The reference is defined as a container reference, but no opposite is available.
			   * So the opposite will NOT be handled. Therefore you have to ensure that the parent of the reference
			   * is set properly.
			   * 
			   * @param library
			   */
			  public void setLibrary(final Library library) {
			    
			    Library oldLibrary = this.library;
			    
			    // if the parent does not change, we can leave
			    if (oldLibrary == library) {
			    	return;
			    }
			    
			    // Assign the new value
			    this.library = library;
			    
			  }
			}
			''');
		
			'''
			package my.test

			entity Library {
				contains Book[] containedBooks
			}
			
			entity Book {
				container Library library
			}
		'''.assertCompilesToMultiple(expected)
	}
	
	@Test
	def void compareContains_Multiple_withContainerAndOpposite() {
		val Map<String, CharSequence> expected = new HashMap<String, CharSequence>();
		expected.put("my/test/Library.java", 
		'''
			package my.test;
			
			import java.util.List;
			import my.test.Book;
			
			public class Library {
			  private boolean settingContainedBooks;
			  
			  private List<Book> containedBooks;
			  
			  /**
			   * Returns an unmodifiable list of containedBooks.
			   * 
			   * @return containedBooks
			   */
			  public List<Book> getContainedBooks() {
			    ensureContainedBooks();
			    return java.util.Collections.unmodifiableList(this.containedBooks);
			  }
			  
			  /**
			   * Adds the given book to this object. <p>
			   * Since the reference is a containment reference, the opposite reference (Book.library) 
			   * of the book will be handled automatically and no further coding is required to keep them in sync. 
			   * See {@link Book#setLibrary(Book)}.
			   * 
			   * @param book
			   */
			  public void addContainedBooks(final Book book) {
			    if (settingContainedBooks) {
			    	// avoid loops
			    	return;
			    }
			    
			    // If book is null, we do not add it
			    if(book==null){
			        return;
			    }
			    
			    try{
			    	settingContainedBooks = true;
			    
			    	ensureContainedBooks();
			    
			    	// Adds the parameter to the list
			    	if(!this.containedBooks.contains(book)){
			        	this.containedBooks.add(book);
			    
			    		// Set 'this' as the parent of the containment reference to the book
			    		book.setLibrary(this);
			    	}
			    } finally {
			    	settingContainedBooks = false;
			    }
			    
			  }
			  
			  /**
			   * Removes the given book from this object. <p>
			   * Since the reference is a containment reference, the opposite reference (Book.library) 
			   * of the book will be handled automatically and no further coding is required to keep them in sync. 
			   * See {@link Book#setLibrary(Book)}.
			   * 
			   * @param book
			   */
			  public void removeContainedBooks(final Book book) {
			    // If the parameter or the field are null, we can leave
			    if (book == null || containedBooks == null) {
			    	return;
			    }
			    
			    // if the book is not contained, then we can leave
			    if (!this.containedBooks.contains(book)) {
			    	return;
			    }
			    
			    // Removes the parameter from the field
			    this.containedBooks.remove(book);
			    // Unset the parent of the containment reference from the book
			    book.setLibrary(null);
			    
			  }
			  
			  /**
			   * Ensures that the list of containedBooks is created. It will be instantiated 
			   * lazy.
			   */
			  private void ensureContainedBooks() {
			    if (this.containedBooks == null) {
			    	this.containedBooks = new java.util.ArrayList<Book>();
			    }
			  }
			}
			''');
		
		expected.put("my/test/Book.java", '''
			package my.test;

			import my.test.Library;
			
			public class Book {
			  private boolean settingLibrary;
			  
			  private Library library;
			  
			  /**
			   * Returns the library reference or <code>null</code> if not present.
			   * 
			   * @return library
			   */
			  public Library getLibrary() {
			    return this.library;
			  }
			  
			  /**
			   * Sets the library reference to this instance.
			   * 
			   * Since the reference is a container reference, the opposite reference (Library.containedBooks) 
			   * of the library will be handled automatically and no further coding is required to keep them in sync. 
			   * See {@link Library#setContainedBooks(Library)}.
			   * 
			   * @param library
			   */
			  public void setLibrary(final Library library) {
			    if (settingLibrary) {
			    	// avoid loops
			    	return;
			    }
			    
			    Library oldLibrary = this.library;
			    
			    // if the parent does not change, we can leave
			    if (oldLibrary == library) {
			    	return;
			    }
			    
			    try {
			    // avoid loops
			    settingLibrary = true;
			    	// First remove the element
			    	if (oldLibrary != null) {
			    		oldLibrary.removeContainedBooks(this);
			    	}
			    	
			    	// Then assign the new value
			    	this.library = library;
			    	
			    	// Then add 'this' to the new value
			    	if (this.library != null) {
			    		this.library.addContainedBooks(this);
			    	}
			    } finally {
			    	settingLibrary = false;
			    }
			    
			  }
			}
			''');
		
			'''
			package my.test
			
			entity Library {
				contains Book[] containedBooks opposite library
			}
			
			entity Book {
				container Library library opposite containedBooks
			}
		'''.assertCompilesToMultiple(expected)
	}
	
	
		@Test
	def void compareEmbedds() {
		val Map<String, CharSequence> expected = new HashMap<String, CharSequence>();
		expected.put("my/test/Library.java", 
		'''
			package my.test;
			
			import java.util.List;
			import my.test.Address;
			
			public class Library {
			  private String address_street;
			  
			  private Address address_otherAddress;
			  
			  private List<Address> address_moreAddresses;
			  
			  /**
			   * Returns the address_street property or <code>null</code> if not present.
			   * 
			   * @return address_street
			   */
			  public String getAddress_street() {
			    return this.address_street;
			  }
			  
			  /**
			   * Sets the address_street property to this instance.
			   * 
			   * @param address_street
			   */
			  public void setAddress_street(final String address_street) {
			    this.address_street = address_street;
			  }
			  
			  /**
			   * Returns the address_otherAddress reference or <code>null</code> if not present.
			   * 
			   * @return address_otherAddress
			   */
			  public Address getAddress_otherAddress() {
			    return this.address_otherAddress;
			  }
			  
			  /**
			   * Sets the address_otherAddress reference to this instance.
			   * 
			   * @param address_otherAddress
			   */
			  public void setAddress_otherAddress(final Address address_otherAddress) {
			    this.address_otherAddress = address_otherAddress;
			  }
			  
			  /**
			   * Returns an unmodifiable list of address_moreAddresses.
			   * 
			   * @return address_moreAddresses
			   */
			  public List<Address> getAddress_moreAddresses() {
			    ensureAddress_moreAddresses();
			    return java.util.Collections.unmodifiableList(this.address_moreAddresses);
			  }
			  
			  /**
			   * Adds the given address to this object. <p>
			   * 
			   * @param address
			   */
			  public void addAddress_moreAddresses(final Address address) {
			    // If address is null, we do not add it
			    if(address==null){
			    	return;
			    }
			    
			    ensureAddress_moreAddresses();
			    
			    // Adds the parameter to the list
			    if(!this.address_moreAddresses.contains(address)){
			    	this.address_moreAddresses.add(address);
			    }
			  }
			  
			  /**
			   * Removes the given address from this object.
			   * 
			   * @param address
			   */
			  public void removeAddress_moreAddresses(final Address address) {
			    // If address or the address_moreAddresses are null, we can leave
			    if(address==null || address_moreAddresses==null){
			    	return;
			    }
			    
			    this.address_moreAddresses.remove(address);
			  }
			  
			  /**
			   * Ensures that the list of moreAddresses is created. It will be instantiated 
			   * lazy.
			   */
			  private void ensureAddress_moreAddresses() {
			    if (this.address_moreAddresses == null) {
			    	this.address_moreAddresses = new java.util.ArrayList<Address>();
			    }
			  }
			}
			''');
		
		expected.put("my/test/Address.java", '''
			package my.test;

			import java.util.List;
			
			public class Address {
			  private String street;
			  
			  private Address otherAddress;
			  
			  private List<Address> moreAddresses;
			  
			  /**
			   * Returns the street property or <code>null</code> if not present.
			   * 
			   * @return street
			   */
			  public String getStreet() {
			    return this.street;
			  }
			  
			  /**
			   * Sets the street property to this instance.
			   * 
			   * @param street
			   */
			  public void setStreet(final String street) {
			    this.street = street;
			  }
			  
			  /**
			   * Returns the otherAddress reference or <code>null</code> if not present.
			   * 
			   * @return otherAddress
			   */
			  public Address getOtherAddress() {
			    return this.otherAddress;
			  }
			  
			  /**
			   * Sets the otherAddress reference to this instance.
			   * 
			   * @param otherAddress
			   */
			  public void setOtherAddress(final Address otherAddress) {
			    this.otherAddress = otherAddress;
			  }
			  
			  /**
			   * Returns an unmodifiable list of moreAddresses.
			   * 
			   * @return moreAddresses
			   */
			  public List<Address> getMoreAddresses() {
			    ensureMoreAddresses();
			    return java.util.Collections.unmodifiableList(this.moreAddresses);
			  }
			  
			  /**
			   * Adds the given address to this object. <p>
			   * 
			   * @param address
			   */
			  public void addMoreAddresses(final Address address) {
			    // If address is null, we do not add it
			    if(address==null){
			    	return;
			    }
			    
			    ensureMoreAddresses();
			    
			    // Adds the parameter to the list
			    if(!this.moreAddresses.contains(address)){
			    	this.moreAddresses.add(address);
			    }
			  }
			  
			  /**
			   * Removes the given address from this object.
			   * 
			   * @param address
			   */
			  public void removeMoreAddresses(final Address address) {
			    // If address or the moreAddresses are null, we can leave
			    if(address==null || moreAddresses==null){
			    	return;
			    }
			    
			    this.moreAddresses.remove(address);
			  }
			  
			  /**
			   * Ensures that the list of moreAddresses is created. It will be instantiated 
			   * lazy.
			   */
			  private void ensureMoreAddresses() {
			    if (this.moreAddresses == null) {
			    	this.moreAddresses = new java.util.ArrayList<Address>();
			    }
			  }
			}
			''');
		
			'''
			package my.test

			entity Library {
				embedds Address address
			}
			
			entity Address {
				var String street
				refers Address otherAddress
				refers Address[] moreAddresses
			}

		'''.assertCompilesToMultiple(expected)
	}
}