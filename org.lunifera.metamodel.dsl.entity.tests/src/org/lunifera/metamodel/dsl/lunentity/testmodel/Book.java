package org.lunifera.metamodel.dsl.lunentity.testmodel;

import org.lunifera.metamodel.dsl.lunentity.testmodel.Library;

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
