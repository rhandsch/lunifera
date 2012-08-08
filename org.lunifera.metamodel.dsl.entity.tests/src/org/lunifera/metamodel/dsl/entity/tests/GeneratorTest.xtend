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
	def void compare_Single_Property() {
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
			   * Sets the _name property to this instance.
			   * 
			   * @param _name
			   */
			  public void setName(final String _name) {
			    this.name = _name;
			  }
			}
		''')
	}
	
	@Test
	def void compare_Multiple_Property() {
		'''
			package my.test
			
			entity Library {
				var String[*] names
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
			   * Adds the given _names to this object. <p>
			   * 
			   * @param _names
			   */
			  public void addNames(final String _names) {
			    // If _names is null, we do not add it
			    if(_names==null){
			    	return;
			    }
			    
			    ensureNames();
			    
			    // Adds the parameter to the list
			    if(!this.names.contains(_names)){
			    	this.names.add(_names);
			    }
			  }
			  
			  /**
			   * Removes the given _names from this object.
			   * 
			   * @param _names
			   */
			  public void removeNames(final String _names) {
			    // If _names or the names are null, we can leave
			    if(_names==null || names==null){
			    	return;
			    }
			    
			    this.names.remove(_names);
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
			package my.test

			entity Library {
				var List<String>[*] values
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
			   * Adds the given _values to this object. <p>
			   * 
			   * @param _values
			   */
			  public void addValues(final List<String> _values) {
			    // If _values is null, we do not add it
			    if(_values==null){
			    	return;
			    }
			    
			    ensureValues();
			    
			    // Adds the parameter to the list
			    if(!this.values.contains(_values)){
			    	this.values.add(_values);
			    }
			  }
			  
			  /**
			   * Removes the given _values from this object.
			   * 
			   * @param _values
			   */
			  public void removeValues(final List<String> _values) {
			    // If _values or the values are null, we can leave
			    if(_values==null || values==null){
			    	return;
			    }
			    
			    this.values.remove(_values);
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
			   * Sets the _lastBorrowedBook reference to this instance.
			   * 
			   * @param _lastBorrowedBook
			   */
			  public void setLastBorrowedBook(final Book _lastBorrowedBook) {
			    this.lastBorrowedBook = _lastBorrowedBook;
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
			   * Adds the given _allBorrowedBooks to this object. <p>
			   * 
			   * @param _allBorrowedBooks
			   */
			  public void addAllBorrowedBooks(final Book _allBorrowedBooks) {
			    // If _allBorrowedBooks is null, we do not add it
			    if(_allBorrowedBooks==null){
			    	return;
			    }
			    
			    ensureAllBorrowedBooks();
			    
			    // Adds the parameter to the list
			    if(!this.allBorrowedBooks.contains(_allBorrowedBooks)){
			    	this.allBorrowedBooks.add(_allBorrowedBooks);
			    }
			  }
			  
			  /**
			   * Removes the given _allBorrowedBooks from this object.
			   * 
			   * @param _allBorrowedBooks
			   */
			  public void removeAllBorrowedBooks(final Book _allBorrowedBooks) {
			    // If _allBorrowedBooks or the allBorrowedBooks are null, we can leave
			    if(_allBorrowedBooks==null || allBorrowedBooks==null){
			    	return;
			    }
			    
			    this.allBorrowedBooks.remove(_allBorrowedBooks);
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
				refers Book[*] allBorrowedBooks
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
			   * The reference is a containment reference, but no opposite is available.
			   * So the opposite will NOT be handled. Therefore you have to ensure that the parent of the reference
			   * is set properly.
			   * 
			   * @param _containedBook
			   */
			  public void setContainedBook(final Book _containedBook) {
			    
			    Book oldContainedBook = this.containedBook;
			    
			    // if the parent does not change, we can leave
			    if (oldContainedBook == _containedBook) {
			    	return;
			    }
			    
			    // Assign the new value
			    this.containedBook = _containedBook;
			    
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
			   * @param _library
			   */
			  public void setLibrary(final Library _library) {
			    
			    Library oldLibrary = this.library;
			    
			    // if the parent does not change, we can leave
			    if (oldLibrary == _library) {
			    	return;
			    }
			    
			    // Assign the new value
			    this.library = _library;
			    
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
			   * of the _containedBook will be handled automatically and no further coding is required to keep them in sync. 
			   * See {@link Book#setLibrary(Book)}.
			   * 
			   * @param _containedBook
			   */
			  public void setContainedBook(final Book _containedBook) {
			    if (settingContainedBook) {
			    	// avoid loops
			    	return;
			    }
			    
			    Book oldContainedBook = this.containedBook;
			    
			    // if the parent does not change, we can leave
			    if (oldContainedBook == _containedBook) {
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
			    	this.containedBook = _containedBook;
			    	
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
			   * of the _library will be handled automatically and no further coding is required to keep them in sync. 
			   * See {@link Library#setContainedBook(Library)}.
			   * 
			   * @param _library
			   */
			  public void setLibrary(final Library _library) {
			    if (settingLibrary) {
			    	// avoid loops
			    	return;
			    }
			    
			    Library oldLibrary = this.library;
			    
			    // if the parent does not change, we can leave
			    if (oldLibrary == _library) {
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
			    	this.library = _library;
			    	
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
			   * Adds the given _containedBooks to this object. <p>
			   * ATTENTION:<br>
			   * The reference is a containment reference, but no opposite is available.
			   * So the opposite will NOT be handled. Therefore you have to ensure that the parent of the reference
			   * is set properly.
			   * 
			   * @param _containedBooks
			   */
			  public void addContainedBooks(final Book _containedBooks) {
			    
			    // If _containedBooks is null, we do not add it
			    if(_containedBooks==null){
			        return;
			    }
			    
			    // Adds the parameter to the list
			    if(!this.containedBooks.contains(_containedBooks)){
			    	this.containedBooks.add(_containedBooks);
			    }
			    
			  }
			  
			  /**
			   * Removes the given _containedBooks from this object. <p>
			   * ATTENTION:<br>
			   * The reference is a containment reference, but no opposite is available.
			   * So the opposite will NOT be handled. Therefore you have to ensure that the parent of the reference
			   * is set properly.
			   * 
			   * @param _containedBooks
			   */
			  public void removeContainedBooks(final Book _containedBooks) {
			    // If the parameter or the field are null, we can leave
			    if (_containedBooks == null || containedBooks == null) {
			    	return;
			    }
			    
			    // if the _containedBooks is not contained, then we can leave
			    if (!this.containedBooks.contains(_containedBooks)) {
			    	return;
			    }
			    
			    // Removes the parameter from the field
			    this.containedBooks.remove(_containedBooks);
			    
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
			   * @param _library
			   */
			  public void setLibrary(final Library _library) {
			    
			    Library oldLibrary = this.library;
			    
			    // if the parent does not change, we can leave
			    if (oldLibrary == _library) {
			    	return;
			    }
			    
			    // Assign the new value
			    this.library = _library;
			    
			  }
			}
			''');
		
			'''
			package my.test

			entity Library {
				contains Book[*] containedBooks
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
			   * Adds the given _containedBooks to this object. <p>
			   * Since the reference is a containment reference, the opposite reference (Book.library) 
			   * of the _containedBooks will be handled automatically and no further coding is required to keep them in sync. 
			   * See {@link Book#setLibrary(Book)}.
			   * 
			   * @param _containedBooks
			   */
			  public void addContainedBooks(final Book _containedBooks) {
			    if (settingContainedBooks) {
			    	// avoid loops
			    	return;
			    }
			    
			    // If _containedBooks is null, we do not add it
			    if(_containedBooks==null){
			        return;
			    }
			    
			    try{
			    	settingContainedBooks = true;
			    
			    	ensureContainedBooks();
			    
			    	// Adds the parameter to the list
			    	if(!this.containedBooks.contains(_containedBooks)){
			        	this.containedBooks.add(_containedBooks);
			    
			    		// Set 'this' as the parent of the containment reference to the _containedBooks
			    		_containedBooks.setLibrary(this);
			    	}
			    } finally {
			    	settingContainedBooks = false;
			    }
			    
			  }
			  
			  /**
			   * Removes the given _containedBooks from this object. <p>
			   * Since the reference is a containment reference, the opposite reference (Book.library) 
			   * of the _containedBooks will be handled automatically and no further coding is required to keep them in sync. 
			   * See {@link Book#setLibrary(Book)}.
			   * 
			   * @param _containedBooks
			   */
			  public void removeContainedBooks(final Book _containedBooks) {
			    // If the parameter or the field are null, we can leave
			    if (_containedBooks == null || containedBooks == null) {
			    	return;
			    }
			    
			    // if the _containedBooks is not contained, then we can leave
			    if (!this.containedBooks.contains(_containedBooks)) {
			    	return;
			    }
			    
			    // Removes the parameter from the field
			    this.containedBooks.remove(_containedBooks);
			    // Unset the parent of the containment reference from the _containedBooks
			    _containedBooks.setLibrary(null);
			    
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
			   * of the _library will be handled automatically and no further coding is required to keep them in sync. 
			   * See {@link Library#setContainedBooks(Library)}.
			   * 
			   * @param _library
			   */
			  public void setLibrary(final Library _library) {
			    if (settingLibrary) {
			    	// avoid loops
			    	return;
			    }
			    
			    Library oldLibrary = this.library;
			    
			    // if the parent does not change, we can leave
			    if (oldLibrary == _library) {
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
			    	this.library = _library;
			    	
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
				contains Book[*] containedBooks opposite library
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
			   * Sets the _street property to this instance.
			   * 
			   * @param _street
			   */
			  public void setAddress_street(final String _street) {
			    this.address_street = _street;
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
			   * Sets the _otherAddress reference to this instance.
			   * 
			   * @param _otherAddress
			   */
			  public void setAddress_otherAddress(final Address _otherAddress) {
			    this.address_otherAddress = _otherAddress;
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
			   * Adds the given _moreAddresses to this object. <p>
			   * 
			   * @param _moreAddresses
			   */
			  public void addAddress_moreAddresses(final Address _moreAddresses) {
			    // If _moreAddresses is null, we do not add it
			    if(_moreAddresses==null){
			    	return;
			    }
			    
			    ensureAddress_moreAddresses();
			    
			    // Adds the parameter to the list
			    if(!this.address_moreAddresses.contains(_moreAddresses)){
			    	this.address_moreAddresses.add(_moreAddresses);
			    }
			  }
			  
			  /**
			   * Removes the given _moreAddresses from this object.
			   * 
			   * @param _moreAddresses
			   */
			  public void removeAddress_moreAddresses(final Address _moreAddresses) {
			    // If _moreAddresses or the address_moreAddresses are null, we can leave
			    if(_moreAddresses==null || address_moreAddresses==null){
			    	return;
			    }
			    
			    this.address_moreAddresses.remove(_moreAddresses);
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
			   * Sets the _street property to this instance.
			   * 
			   * @param _street
			   */
			  public void setStreet(final String _street) {
			    this.street = _street;
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
			   * Sets the _otherAddress reference to this instance.
			   * 
			   * @param _otherAddress
			   */
			  public void setOtherAddress(final Address _otherAddress) {
			    this.otherAddress = _otherAddress;
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
			   * Adds the given _moreAddresses to this object. <p>
			   * 
			   * @param _moreAddresses
			   */
			  public void addMoreAddresses(final Address _moreAddresses) {
			    // If _moreAddresses is null, we do not add it
			    if(_moreAddresses==null){
			    	return;
			    }
			    
			    ensureMoreAddresses();
			    
			    // Adds the parameter to the list
			    if(!this.moreAddresses.contains(_moreAddresses)){
			    	this.moreAddresses.add(_moreAddresses);
			    }
			  }
			  
			  /**
			   * Removes the given _moreAddresses from this object.
			   * 
			   * @param _moreAddresses
			   */
			  public void removeMoreAddresses(final Address _moreAddresses) {
			    // If _moreAddresses or the moreAddresses are null, we can leave
			    if(_moreAddresses==null || moreAddresses==null){
			    	return;
			    }
			    
			    this.moreAddresses.remove(_moreAddresses);
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
				refers Address[*] moreAddresses
			}

		'''.assertCompilesToMultiple(expected)
	}
}