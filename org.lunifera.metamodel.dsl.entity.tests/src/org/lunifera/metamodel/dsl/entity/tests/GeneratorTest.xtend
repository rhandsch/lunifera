/**
 * Copyright (c) 2011 - 2012, Florian Pirchner - lunifera.org
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Sources based on {@link org.eclipse.xtext.xbase.compiler.CompilationTestHelper}
 * 
 * Contributors:
 * 		Florian Pirchner - Initial implementation
 */
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
class GeneratorTest {

	@Inject extension MultiFilesCompilationTestHelper
	
	@Test
	def void compareEntity() {
		'''
			package my.test {
				entity Library {
				}
			}
		'''.assertCompilesTo('''
			package my.test;

			public class Library {
			}
		''')
	}
	
	@Test
	def void compare_Single_Property() {
		'''
			package my.test {
				entity Library {
					var String name
				}
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
	def void compare_Multiple_Property() {
		'''
			package my.test {
				entity Library {
					var String[*] names
				}
			}
		'''.assertCompilesTo('''
			package my.test;

			import java.util.List;
			
			public class Library {
			  private List<String> names;
			  
			  /**
			   * Returns an unmodifiable list of names.
			   * 
			   * @return names
			   */
			  public List<String> getNames() {
			    ensureNames();
			    return java.util.Collections.unmodifiableList(this.names);
			  }
			  
			  /**
			   * Adds the given names to this object. <p>
			   * 
			   * @param names
			   */
			  public void addNames(final String names) {
			    // If names is null, we do not add it
			    if(names==null){
			    	return;
			    }
			    
			    ensureNames();
			    
			    // Adds the parameter to the list
			    if(!this.names.contains(names)){
			    	this.names.add(names);
			    }
			  }
			  
			  /**
			   * Removes the given names from this object.
			   * 
			   * @param names
			   */
			  public void removeNames(final String names) {
			    // If names or the names are null, we can leave
			    if(names==null || this.names==null){
			    	return;
			    }
			    
			    this.names.remove(names);
			  }
			  
			  /**
			   * Ensures that the list of names is created. It will be instantiated 
			   * lazy.
			   */
			  private void ensureNames() {
			    if (this.names == null) {
			    	this.names = new java.util.ArrayList<String>();
			    }
			  }
			}
		''')
	}
	
	
	
		@Test
	def void compare_Multiple_List_Property() {
		'''
			package my.test {
				entity Library {
					var List<String>[*] values
				}
			}
		'''.assertCompilesTo('''
			package my.test;

			import java.util.List;
			
			public class Library {
			  private List<List<String>> values;
			  
			  /**
			   * Returns an unmodifiable list of values.
			   * 
			   * @return values
			   */
			  public List<List<String>> getValues() {
			    ensureValues();
			    return java.util.Collections.unmodifiableList(this.values);
			  }
			  
			  /**
			   * Adds the given values to this object. <p>
			   * 
			   * @param values
			   */
			  public void addValues(final List<String> values) {
			    // If values is null, we do not add it
			    if(values==null){
			    	return;
			    }
			    
			    ensureValues();
			    
			    // Adds the parameter to the list
			    if(!this.values.contains(values)){
			    	this.values.add(values);
			    }
			  }
			  
			  /**
			   * Removes the given values from this object.
			   * 
			   * @param values
			   */
			  public void removeValues(final List<String> values) {
			    // If values or the values are null, we can leave
			    if(values==null || this.values==null){
			    	return;
			    }
			    
			    this.values.remove(values);
			  }
			  
			  /**
			   * Ensures that the list of values is created. It will be instantiated 
			   * lazy.
			   */
			  private void ensureValues() {
			    if (this.values == null) {
			    	this.values = new java.util.ArrayList<List<String>>();
			    }
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
			   * Sets the book reference to this instance.
			   * 
			   * @param book
			   */
			  public void setLastBorrowedBook(final Book book) {
			    this.lastBorrowedBook = book;
			  }
			}
			''');
		
		expected.put("my/test/Book.java", '''
			package my.test;
			
			public class Book {
			}
			''');
		
			'''
			package my.test {
				entity Library {
					refers Book lastBorrowedBook
				}
				
				entity Book {
				}
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
			    if(book==null || this.allBorrowedBooks==null){
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
			package my.test {
				entity Library {
					refers Book[*] allBorrowedBooks
				}
				
				entity Book {
				}
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
			   * The reference is a containment reference, but no opposite is available.
			   * So the opposite will NOT be handled. Therefore you have to ensure that the parent of the reference
			   * is set properly.
			   * 
			   * @param book
			   */
			  public void setContainedBook(final Book book) {
			    
			    Book oldContainedBook = this.containedBook;
			    
			    // if the parent does not change, we can leave
			    if (oldContainedBook == book) {
			    	return;
			    }
			    
			    // Assign the new value
			    this.containedBook = book;
			    
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
			   * The reference is a container reference, but no opposite is available.
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
			package my.test {
				entity Library {
					contains Book containedBook
				}
				
				entity Book {
					container Library library
				}
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
			   * of the book will be handled automatically and no further coding is required to keep them in sync. 
			   * See {@link Book#setLibrary(Book)}.
			   * 
			   * @param book
			   */
			  public void setContainedBook(final Book book) {
			    if (settingContainedBook) {
			    	// avoid loops
			    	return;
			    }
			    
			    Book oldContainedBook = this.containedBook;
			    
			    // if the parent does not change, we can leave
			    if (oldContainedBook == book) {
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
			    	this.containedBook = book;
			    	
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
			package my.test {
				entity Library {
					contains Book containedBook opposite library
				}
				
				entity Book {
					container Library library opposite containedBook
				}
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
			   * The reference is a containment reference, but no opposite is available.
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
			    
			    ensureContainedBooks();
			    
			    // Adds the parameter to the list
			    if(!this.containedBooks.contains(book)){
			    	this.containedBooks.add(book);
			    }
			    
			  }
			  
			  /**
			   * Removes the given book from this object. <p>
			   * ATTENTION:<br>
			   * The reference is a containment reference, but no opposite is available.
			   * So the opposite will NOT be handled. Therefore you have to ensure that the parent of the reference
			   * is set properly.
			   * 
			   * @param book
			   */
			  public void removeContainedBooks(final Book book) {
			    // If the parameter or the field are null, we can leave
			    if (book == null || this.containedBooks == null) {
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
			   * The reference is a container reference, but no opposite is available.
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
			package my.test {
				entity Library {
					contains Book[*] containedBooks
				}
				
				entity Book {
					container Library library
				}
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
			    if (book == null || this.containedBooks == null) {
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
			package my.test {
				entity Library {
					contains Book[*] containedBooks opposite library
				}
				
				entity Book {
					container Library library opposite containedBooks
				}
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
			   * Sets the street property to this instance.
			   * 
			   * @param street
			   */
			  public void setAddress_street(final String street) {
			    this.address_street = street;
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
			   * Sets the address reference to this instance.
			   * 
			   * @param address
			   */
			  public void setAddress_otherAddress(final Address address) {
			    this.address_otherAddress = address;
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
			    if(address==null || this.address_moreAddresses==null){
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
			   * Sets the address reference to this instance.
			   * 
			   * @param address
			   */
			  public void setOtherAddress(final Address address) {
			    this.otherAddress = address;
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
			    if(address==null || this.moreAddresses==null){
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
			package my.test {
				entity Library {
					embedds Address address
				}
				
				entity Address {
					var String street
					refers Address otherAddress
					refers Address[*] moreAddresses
				}
			}
		'''.assertCompilesToMultiple(expected)
	}
	
	@Test
	def void compareSingluarName() {
		val Map<String, CharSequence> expected = new HashMap<String, CharSequence>();
		expected.put("org/lunifera/demo/Library.java", 
		'''
			package org.lunifera.demo;

			import java.util.List;
			import org.lunifera.demo.Book;
			
			/**
			 * Test 112233
			 */
			public class Library {
			  private String name;
			  
			  private List<String> manyNames;
			  
			  private List<List<String>> manymanyNames;
			  
			  private boolean settingSimpleContains;
			  
			  private Book simpleContains;
			  
			  private boolean settingBooks;
			  
			  private List<Book> books;
			  
			  private Book lastLendedBook;
			  
			  private List<Book> allLendedBooks;
			  
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
			  
			  /**
			   * Returns an unmodifiable list of manyNames.
			   * 
			   * @return manyNames
			   */
			  public List<String> getManyNames() {
			    ensureManyNames();
			    return java.util.Collections.unmodifiableList(this.manyNames);
			  }
			  
			  /**
			   * Adds the given name to this object. <p>
			   * 
			   * @param name
			   */
			  public void addManyNames(final String name) {
			    // If name is null, we do not add it
			    if(name==null){
			    	return;
			    }
			    
			    ensureManyNames();
			    
			    // Adds the parameter to the list
			    if(!this.manyNames.contains(name)){
			    	this.manyNames.add(name);
			    }
			  }
			  
			  /**
			   * Removes the given name from this object.
			   * 
			   * @param name
			   */
			  public void removeManyNames(final String name) {
			    // If name or the manyNames are null, we can leave
			    if(name==null || this.manyNames==null){
			    	return;
			    }
			    
			    this.manyNames.remove(name);
			  }
			  
			  /**
			   * Ensures that the list of manyNames is created. It will be instantiated 
			   * lazy.
			   */
			  private void ensureManyNames() {
			    if (this.manyNames == null) {
			    	this.manyNames = new java.util.ArrayList<String>();
			    }
			  }
			  
			  /**
			   * Returns an unmodifiable list of manymanyNames.
			   * 
			   * @return manymanyNames
			   */
			  public List<List<String>> getManymanyNames() {
			    ensureManymanyNames();
			    return java.util.Collections.unmodifiableList(this.manymanyNames);
			  }
			  
			  /**
			   * Adds the given name to this object. <p>
			   * 
			   * @param name
			   */
			  public void addManymanyNames(final List<String> name) {
			    // If name is null, we do not add it
			    if(name==null){
			    	return;
			    }
			    
			    ensureManymanyNames();
			    
			    // Adds the parameter to the list
			    if(!this.manymanyNames.contains(name)){
			    	this.manymanyNames.add(name);
			    }
			  }
			  
			  /**
			   * Removes the given name from this object.
			   * 
			   * @param name
			   */
			  public void removeManymanyNames(final List<String> name) {
			    // If name or the manymanyNames are null, we can leave
			    if(name==null || this.manymanyNames==null){
			    	return;
			    }
			    
			    this.manymanyNames.remove(name);
			  }
			  
			  /**
			   * Ensures that the list of manymanyNames is created. It will be instantiated 
			   * lazy.
			   */
			  private void ensureManymanyNames() {
			    if (this.manymanyNames == null) {
			    	this.manymanyNames = new java.util.ArrayList<List<String>>();
			    }
			  }
			  
			  /**
			   * Returns the simpleContains reference or <code>null</code> if not present.
			   * 
			   * @return simpleContains
			   */
			  public Book getSimpleContains() {
			    return this.simpleContains;
			  }
			  
			  /**
			   * Sets the simpleContains reference to this instance.
			   * 
			   * Since the reference is a containment reference, the opposite reference (Book.library) 
			   * of the book will be handled automatically and no further coding is required to keep them in sync. 
			   * See {@link Book#setLibrary(Book)}.
			   * 
			   * @param book
			   */
			  public void setSimpleContains(final Book book) {
			    if (settingSimpleContains) {
			    	// avoid loops
			    	return;
			    }
			    
			    Book oldSimpleContains = this.simpleContains;
			    
			    // if the parent does not change, we can leave
			    if (oldSimpleContains == book) {
			    	return;
			    }
			    
			    try {
			    	// avoid loops
			    	settingSimpleContains = true;
			    
			    	// First remove the element
			    	if (oldSimpleContains != null) {
			    		oldSimpleContains.setLibrary(null);
			    	}
			    	
			    	// Then assign the new value
			    	this.simpleContains = book;
			    	
			    	// Then add 'this' to the new value
			    	if (this.simpleContains != null) {
			    		this.simpleContains.setLibrary(this);
			    	}
			    } finally {
			    	settingSimpleContains = false;
			    }
			    
			  }
			  
			  /**
			   * Returns an unmodifiable list of books.
			   * 
			   * @return books
			   */
			  public List<Book> getBooks() {
			    ensureBooks();
			    return java.util.Collections.unmodifiableList(this.books);
			  }
			  
			  /**
			   * Adds the given aBookOfLibrary to this object. <p>
			   * Since the reference is a containment reference, the opposite reference (Book.library) 
			   * of the aBookOfLibrary will be handled automatically and no further coding is required to keep them in sync. 
			   * See {@link Book#setLibrary(Book)}.
			   * 
			   * @param aBookOfLibrary
			   */
			  public void addBooks(final Book aBookOfLibrary) {
			    if (settingBooks) {
			    	// avoid loops
			    	return;
			    }
			    
			    // If aBookOfLibrary is null, we do not add it
			    if(aBookOfLibrary==null){
			        return;
			    }
			    
			    try{
			    	settingBooks = true;
			    
			    	ensureBooks();
			    
			    	// Adds the parameter to the list
			    	if(!this.books.contains(aBookOfLibrary)){
			        	this.books.add(aBookOfLibrary);
			    
			    		// Set 'this' as the parent of the containment reference to the aBookOfLibrary
			    		aBookOfLibrary.setLibrary(this);
			    	}
			    } finally {
			    	settingBooks = false;
			    }
			    
			  }
			  
			  /**
			   * Removes the given aBookOfLibrary from this object. <p>
			   * Since the reference is a containment reference, the opposite reference (Book.library) 
			   * of the aBookOfLibrary will be handled automatically and no further coding is required to keep them in sync. 
			   * See {@link Book#setLibrary(Book)}.
			   * 
			   * @param aBookOfLibrary
			   */
			  public void removeBooks(final Book aBookOfLibrary) {
			    // If the parameter or the field are null, we can leave
			    if (aBookOfLibrary == null || this.books == null) {
			    	return;
			    }
			    
			    // if the aBookOfLibrary is not contained, then we can leave
			    if (!this.books.contains(aBookOfLibrary)) {
			    	return;
			    }
			    
			    // Removes the parameter from the field
			    this.books.remove(aBookOfLibrary);
			    // Unset the parent of the containment reference from the aBookOfLibrary
			    aBookOfLibrary.setLibrary(null);
			    
			  }
			  
			  /**
			   * Ensures that the list of books is created. It will be instantiated 
			   * lazy.
			   */
			  private void ensureBooks() {
			    if (this.books == null) {
			    	this.books = new java.util.ArrayList<Book>();
			    }
			  }
			  
			  /**
			   * Returns the lastLendedBook reference or <code>null</code> if not present.
			   * 
			   * @return lastLendedBook
			   */
			  public Book getLastLendedBook() {
			    return this.lastLendedBook;
			  }
			  
			  /**
			   * Sets the book reference to this instance.
			   * 
			   * @param book
			   */
			  public void setLastLendedBook(final Book book) {
			    this.lastLendedBook = book;
			  }
			  
			  /**
			   * Returns an unmodifiable list of allLendedBooks.
			   * 
			   * @return allLendedBooks
			   */
			  public List<Book> getAllLendedBooks() {
			    ensureAllLendedBooks();
			    return java.util.Collections.unmodifiableList(this.allLendedBooks);
			  }
			  
			  /**
			   * Adds the given aLendedBook to this object. <p>
			   * 
			   * @param aLendedBook
			   */
			  public void addAllLendedBooks(final Book aLendedBook) {
			    // If aLendedBook is null, we do not add it
			    if(aLendedBook==null){
			    	return;
			    }
			    
			    ensureAllLendedBooks();
			    
			    // Adds the parameter to the list
			    if(!this.allLendedBooks.contains(aLendedBook)){
			    	this.allLendedBooks.add(aLendedBook);
			    }
			  }
			  
			  /**
			   * Removes the given aLendedBook from this object.
			   * 
			   * @param aLendedBook
			   */
			  public void removeAllLendedBooks(final Book aLendedBook) {
			    // If aLendedBook or the allLendedBooks are null, we can leave
			    if(aLendedBook==null || this.allLendedBooks==null){
			    	return;
			    }
			    
			    this.allLendedBooks.remove(aLendedBook);
			  }
			  
			  /**
			   * Ensures that the list of allLendedBooks is created. It will be instantiated 
			   * lazy.
			   */
			  private void ensureAllLendedBooks() {
			    if (this.allLendedBooks == null) {
			    	this.allLendedBooks = new java.util.ArrayList<Book>();
			    }
			  }
			}
			''');
		
		expected.put("org/lunifera/demo/Book.java", '''
			package org.lunifera.demo;

			import org.lunifera.demo.Library;
			
			public class Book {
			  private String name;
			  
			  private boolean settingLibrary;
			  
			  private Library library;
			  
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
			   * Since the reference is a container reference, the opposite reference (Library.books) 
			   * of the library will be handled automatically and no further coding is required to keep them in sync. 
			   * See {@link Library#setBooks(Library)}.
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
			    		oldLibrary.removeBooks(this);
			    	}
			    	
			    	// Then assign the new value
			    	this.library = library;
			    	
			    	// Then add 'this' to the new value
			    	if (this.library != null) {
			    		this.library.addBooks(this);
			    	}
			    } finally {
			    	settingLibrary = false;
			    }
			    
			  }
			}
			''');
		
			'''
			package org.lunifera.demo {
				/**
				 * Test 112233
				 */
				entity Library {
					// properties       
					var String name
					var String[*] manyNames(name)
					var List<String>[*] manymanyNames(name)
				
					// contains 0:1 and 0:n
					contains Book simpleContains opposite library
					contains Book[*] books(aBookOfLibrary) opposite library
					// simple references
					refers Book lastLendedBook
					refers Book[*] allLendedBooks(aLendedBook)
				}
				
				entity Book {
					var String name
					container Library library opposite books
				}
			}
		'''.assertCompilesToMultiple(expected)
	}
}