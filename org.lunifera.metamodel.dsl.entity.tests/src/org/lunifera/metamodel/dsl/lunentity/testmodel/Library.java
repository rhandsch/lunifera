package org.lunifera.metamodel.dsl.lunentity.testmodel;

import java.util.List;
import org.lunifera.metamodel.dsl.lunentity.testmodel.Book;
import org.lunifera.metamodel.dsl.lunentity.testmodel.BookIndex;

/**
 * Test 112233
 */
public class Library {
  private boolean disposed;
  
  private String name;
  
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
   * Sets the name property to this instance.
   * 
   * @param name
   */
  public void setName(final String name) {
    checkDisposed();
    
    this.name = name;
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
   * of the index will be handled automatically and no further coding is required to keep them in sync. 
   * See {@link BookIndex#setLibrary(BookIndex)}.
   * 
   * @param index
   */
  public void setIndex(final BookIndex index) {
    checkDisposed();
    
    if (settingIndex) {
    	// avoid loops
    	return;
    }
    
    BookIndex oldIndex = this.index;
    
    // if the parent does not change, we can leave
    if (oldIndex == index) {
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
    	this.index = index;
    	
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
   * Adds the given book to this object. <p>
   * Since the reference is a containment reference, the opposite reference (Book.library) 
   * of the book will be handled automatically and no further coding is required to keep them in sync. 
   * See {@link Book#setLibrary(Book)}.
   * 
   * @param book
   */
  public void addBooks(final Book book) {
    checkDisposed();
    
    if (settingBooks) {
    	// avoid loops
    	return;
    }
    
    // If book is null, we do not add it
    if(book==null){
        return;
    }
    
    try{
    	settingBooks = true;
    
    	ensureBooks();
    
    	// Adds the parameter to the list
    	if(!this.books.contains(book)){
        	this.books.add(book);
    
    		// Set 'this' as the parent of the containment reference to the book
    		book.setLibrary(this);
    	}
    } finally {
    	settingBooks = false;
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
  public void removeBooks(final Book book) {
    checkDisposed();
    
    // If the parameter or the field are null, we can leave
    if (book == null || books == null) {
    	return;
    }
    
    // if the book is not contained, then we can leave
    if (!this.books.contains(book)) {
    	return;
    }
    
    // Removes the parameter from the field
    this.books.remove(book);
    // Unset the parent of the containment reference from the book
    book.setLibrary(null);
    
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
