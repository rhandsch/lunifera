/**
 * Copyright (c) 2011 - 2012, Florian Pirchner - lunifera.org
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * 		Florian Pirchner - Initial implementation
 */
package org.lunifera.metamodel.dsl.lunentity.testmodel;

import org.lunifera.metamodel.dsl.lunentity.testmodel.Country;

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
   * of the country will be handled automatically and no further coding is required to keep them in sync. 
   * See {@link Country#setProvinces(Country)}.
   * 
   * @param country
   */
  public void setCountry(final Country country) {
    checkDisposed();
    
    if (settingCountry) {
    	// avoid loops
    	return;
    }
    
    Country oldCountry = this.country;
    
    // if the parent does not change, we can leave
    if (oldCountry == country) {
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
    	this.country = country;
    	
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
   * Sets the info_shortText property to this instance.
   * 
   * @param info_shortText
   */
  public void setInfo_shortText(final String info_shortText) {
    checkDisposed();
    
    this.info_shortText = info_shortText;
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
   * Sets the info_longText property to this instance.
   * 
   * @param info_longText
   */
  public void setInfo_longText(final String info_longText) {
    checkDisposed();
    
    this.info_longText = info_longText;
  }
}
