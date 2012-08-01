package org.lunifera.metamodel.dsl.lunentity.testmodel;

public class Info {
  private boolean disposed;
  
  private String shortText;
  
  private String longText;
  
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
    
    disposed = true;
    
  }
  
  /**
   * Returns the shortText property or <code>null</code> if not present.
   * 
   * @return shortText
   */
  public String getShortText() {
    checkDisposed();
    
    return this.shortText;
  }
  
  /**
   * Sets the _shortText property to this instance.
   * 
   * @param _shortText
   */
  public void setShortText(final String _shortText) {
    checkDisposed();
    
    this.shortText = _shortText;
  }
  
  /**
   * Returns the longText property or <code>null</code> if not present.
   * 
   * @return longText
   */
  public String getLongText() {
    checkDisposed();
    
    return this.longText;
  }
  
  /**
   * Sets the _longText property to this instance.
   * 
   * @param _longText
   */
  public void setLongText(final String _longText) {
    checkDisposed();
    
    this.longText = _longText;
  }
}
