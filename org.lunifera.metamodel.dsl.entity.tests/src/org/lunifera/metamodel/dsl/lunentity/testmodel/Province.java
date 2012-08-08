package org.lunifera.metamodel.dsl.lunentity.testmodel;


public class Province {
  private boolean disposed;
  
  private boolean settingCountry;
  
  private Country country;
  
  private String info_shortText;
  
  private String info_longText;
  
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
   * Returns the country reference or <code>null</code> if not present.
   * 
   * @return country
   */
  public Country getCountry() {
    checkDisposed();
    
    return this.country;
  }
  
  /**
   * Sets the country reference to this instance.
   * 
   * Since the reference is a container reference, the opposite reference (Country.provinces) 
   * of the _country will be handled automatically and no further coding is required to keep them in sync. 
   * See {@link Country#setProvinces(Country)}.
   * 
   * @param _country
   */
  public void setCountry(final Country _country) {
    checkDisposed();
    
    if (settingCountry) {
    	// avoid loops
    	return;
    }
    
    Country oldCountry = this.country;
    
    // if the parent does not change, we can leave
    if (oldCountry == _country) {
    	return;
    }
    
    try {
    // avoid loops
    settingCountry = true;
    	// First remove the element
    	if (oldCountry != null) {
    		oldCountry.removeProvinces(this);
    	}
    	
    	// Then assign the new value
    	this.country = _country;
    	
    	// Then add 'this' to the new value
    	if (this.country != null) {
    		this.country.addProvinces(this);
    	}
    } finally {
    	settingCountry = false;
    }
    
  }
  
  /**
   * Returns the info_shortText property or <code>null</code> if not present.
   * 
   * @return info_shortText
   */
  public String getInfo_shortText() {
    checkDisposed();
    
    return this.info_shortText;
  }
  
  /**
   * Sets the _shortText property to this instance.
   * 
   * @param _shortText
   */
  public void setInfo_shortText(final String _shortText) {
    checkDisposed();
    
    this.info_shortText = _shortText;
  }
  
  /**
   * Returns the info_longText property or <code>null</code> if not present.
   * 
   * @return info_longText
   */
  public String getInfo_longText() {
    checkDisposed();
    
    return this.info_longText;
  }
  
  /**
   * Sets the _longText property to this instance.
   * 
   * @param _longText
   */
  public void setInfo_longText(final String _longText) {
    checkDisposed();
    
    this.info_longText = _longText;
  }
}
