package org.lunifera.metamodel.dsl.lunentity.testmodel;

import java.util.List;

/**
 * Test 112233
 */
public class Library {
  private boolean disposed;
  
  private String name;
  
  private List<String> manyNames;
  
  private List<List<String>> manymanyNames;
  
  private boolean settingIndex;
  
  private BookIndex index;
  
  private boolean settingBooks;
  
  private List<Book> books;
  
  /**
   * Returns true, if the object is disposed. Disposed means, that it is
   * prepared for garbage collection and may not be used anymore. Accessing
   * objects that are already disposed will cause runtime exceptions.
   * 
   * @return true if the object is disposed and false otherwise
   */
  public boolean isDisposed() {
    return this.disposed;
  }
  
  /**
   * Checks whether the object is disposed.
   * 
   * @throws RuntimeException if the object is disposed.
   * 
   */
  private void checkDisposed() {
    if (isDisposed()) {
    	throw new RuntimeException(String.format(
    			"Object already disposed: {}", this.toString()));
    }
    
  }
  
  /**
   * Calling dispose will destroy that instance. The internal state will be 
   * set to 'disposed' and methods of that object must not be used anymore. 
   * Each call will result in runtime exceptions.<br>
   * If this object keeps containment references, these will be disposed too. 
   * So the whole containment tree will be disposed on calling this method.
   * 
   */
  public void dispose() {
    if(isDisposed()){
    	return;
    }
    
    try{
    	// dispose all the containment references
    	if(this.index != null){
    		this.index.dispose();
    		this.index = null;
    	}
    	if(this.books != null){
    		for(Book book : this.books){
    			book.dispose();
    		}
    		this.books = null;
    	}
    } finally {
    	disposed = true;
    }
    
  }
  
  /**
   * Returns the name property or <code>null</code> if not present.
   * 
   * @return name
   */
  public String getName() {
    checkDisposed();
    
    return this.name;
  }
  
  /**
   * Sets the _name property to this instance.
   * 
   * @param _name
   */
  public void setName(final String _name) {
    checkDisposed();
    
    this.name = _name;
  }
  
  /**
   * Returns an unmodifiable list of manyNames.
   * 
   * @return manyNames
   */
  public List<String> getManyNames() {
    checkDisposed();
    
    ensureManyNames();
    return java.util.Collections.unmodifiableList(this.manyNames);
  }
  
  /**
   * Adds the given _manyNames to this object. <p>
   * 
   * @param _manyNames
   */
  public void addManyNames(final String _manyNames) {
    checkDisposed();
    
    // If _manyNames is null, we do not add it
    if(_manyNames==null){
    	return;
    }
    
    ensureManyNames();
    
    // Adds the parameter to the list
    if(!this.manyNames.contains(_manyNames)){
    	this.manyNames.add(_manyNames);
    }
  }
  
  /**
   * Removes the given _manyNames from this object.
   * 
   * @param _manyNames
   */
  public void removeManyNames(final String _manyNames) {
    checkDisposed();
    
    // If _manyNames or the manyNames are null, we can leave
    if(_manyNames==null || manyNames==null){
    	return;
    }
    
    this.manyNames.remove(_manyNames);
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
    checkDisposed();
    
    ensureManymanyNames();
    return java.util.Collections.unmodifiableList(this.manymanyNames);
  }
  
  /**
   * Adds the given _manymanyNames to this object. <p>
   * 
   * @param _manymanyNames
   */
  public void addManymanyNames(final List<String> _manymanyNames) {
    checkDisposed();
    
    // If _manymanyNames is null, we do not add it
    if(_manymanyNames==null){
    	return;
    }
    
    ensureManymanyNames();
    
    // Adds the parameter to the list
    if(!this.manymanyNames.contains(_manymanyNames)){
    	this.manymanyNames.add(_manymanyNames);
    }
  }
  
  /**
   * Removes the given _manymanyNames from this object.
   * 
   * @param _manymanyNames
   */
  public void removeManymanyNames(final List<String> _manymanyNames) {
    checkDisposed();
    
    // If _manymanyNames or the manymanyNames are null, we can leave
    if(_manymanyNames==null || manymanyNames==null){
    	return;
    }
    
    this.manymanyNames.remove(_manymanyNames);
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
   * Returns the index reference or <code>null</code> if not present.
   * 
   * @return index
   */
  public BookIndex getIndex() {
    checkDisposed();
    
    return this.index;
  }
  
  /**
   * Sets the index reference to this instance.
   * 
   * Since the reference is a containment reference, the opposite reference (BookIndex.library) 
   * of the _index will be handled automatically and no further coding is required to keep them in sync. 
   * See {@link BookIndex#setLibrary(BookIndex)}.
   * 
   * @param _index
   */
  public void setIndex(final BookIndex _index) {
    checkDisposed();
    
    if (settingIndex) {
    	// avoid loops
    	return;
    }
    
    BookIndex oldIndex = this.index;
    
    // if the parent does not change, we can leave
    if (oldIndex == _index) {
    	return;
    }
    
    try {
    	// avoid loops
    	settingIndex = true;
    
    	// First remove the element
    	if (oldIndex != null) {
    		oldIndex.setLibrary(null);
    	}
    	
    	// Then assign the new value
    	this.index = _index;
    	
    	// Then add 'this' to the new value
    	if (this.index != null) {
    		this.index.setLibrary(this);
    	}
    } finally {
    	settingIndex = false;
    }
    
  }
  
  /**
   * Returns an unmodifiable list of books.
   * 
   * @return books
   */
  public List<Book> getBooks() {
    checkDisposed();
    
    ensureBooks();
    return java.util.Collections.unmodifiableList(this.books);
  }
  
  /**
   * Adds the given _books to this object. <p>
   * Since the reference is a containment reference, the opposite reference (Book.library) 
   * of the _books will be handled automatically and no further coding is required to keep them in sync. 
   * See {@link Book#setLibrary(Book)}.
   * 
   * @param _books
   */
  public void addBooks(final Book _books) {
    checkDisposed();
    
    if (settingBooks) {
    	// avoid loops
    	return;
    }
    
    // If _books is null, we do not add it
    if(_books==null){
        return;
    }
    
    try{
    	settingBooks = true;
    
    	ensureBooks();
    
    	// Adds the parameter to the list
    	if(!this.books.contains(_books)){
        	this.books.add(_books);
    
    		// Set 'this' as the parent of the containment reference to the _books
    		_books.setLibrary(this);
    	}
    } finally {
    	settingBooks = false;
    }
    
  }
  
  /**
   * Removes the given _books from this object. <p>
   * Since the reference is a containment reference, the opposite reference (Book.library) 
   * of the _books will be handled automatically and no further coding is required to keep them in sync. 
   * See {@link Book#setLibrary(Book)}.
   * 
   * @param _books
   */
  public void removeBooks(final Book _books) {
    checkDisposed();
    
    // If the parameter or the field are null, we can leave
    if (_books == null || books == null) {
    	return;
    }
    
    // if the _books is not contained, then we can leave
    if (!this.books.contains(_books)) {
    	return;
    }
    
    // Removes the parameter from the field
    this.books.remove(_books);
    // Unset the parent of the containment reference from the _books
    _books.setLibrary(null);
    
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
}
