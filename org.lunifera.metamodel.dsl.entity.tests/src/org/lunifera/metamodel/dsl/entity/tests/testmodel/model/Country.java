package org.lunifera.metamodel.dsl.entity.tests.testmodel.model;

import java.util.List;
import org.lunifera.metamodel.dsl.entity.tests.testmodel.model.Province;

public class Country {
  private boolean disposed;
  
  private String value;
  
  private boolean settingProvinces;
  
  private List<Province> provinces;
  
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
    
    try{
    	// dispose all the containment references
    	if(this.provinces != null){
    		for(Province province : this.provinces){
    			province.dispose();
    		}
    		this.provinces = null;
    	}
    } finally {
    	disposed = true;
    }
    
  }
  
  /**
   * Returns the value property or <code>null</code> if not present.
   * 
   * @return value
   */
  public String getValue() {
    checkDisposed();
    
    return this.value;
  }
  
  /**
   * Sets the value property to this instance.
   * 
   * @param value
   */
  public void setValue(final String value) {
    checkDisposed();
    
    this.value = value;
  }
  
  /**
   * Returns an unmodifiable list of provinces.
   * 
   * @return provinces
   */
  public List<Province> getProvinces() {
    checkDisposed();
    
    ensureProvinces();
    return java.util.Collections.unmodifiableList(this.provinces);
  }
  
  /**
   * Adds the given provinces to this object. <p>
   * Since the reference is a containment reference, the opposite reference (Province.country) 
   * of the provinces will be handled automatically and no further coding is required to keep them in sync. 
   * See {@link Province#setCountry(Province)}.
   * 
   * @param provinces
   */
  public void addProvinces(final Province provinces) {
    checkDisposed();
    
    if (settingProvinces) {
    	// avoid loops
    	return;
    }
    
    // If provinces is null, we do not add it
    if(provinces==null){
        return;
    }
    
    try{
    	settingProvinces = true;
    
    	ensureProvinces();
    
    	// Adds the parameter to the list
    	if(!this.provinces.contains(provinces)){
        	this.provinces.add(provinces);
    
    		// Set 'this' as the parent of the containment reference to the provinces
    		provinces.setCountry(this);
    	}
    } finally {
    	settingProvinces = false;
    }
    
  }
  
  /**
   * Removes the given provinces from this object. <p>
   * Since the reference is a containment reference, the opposite reference (Province.country) 
   * of the provinces will be handled automatically and no further coding is required to keep them in sync. 
   * See {@link Province#setCountry(Province)}.
   * 
   * @param provinces
   */
  public void removeProvinces(final Province provinces) {
    checkDisposed();
    
    // If the parameter or the field are null, we can leave
    if (provinces == null || provinces == null) {
    	return;
    }
    
    // if the provinces is not contained, then we can leave
    if (!this.provinces.contains(provinces)) {
    	return;
    }
    
    // Removes the parameter from the field
    this.provinces.remove(provinces);
    // Unset the parent of the containment reference from the provinces
    provinces.setCountry(null);
    
  }
  
  /**
   * Ensures that the list of provinces is created. It will be instantiated 
   * lazy.
   */
  private void ensureProvinces() {
    if (this.provinces == null) {
    	this.provinces = new java.util.ArrayList<Province>();
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
   * Sets the shortText property to this instance.
   * 
   * @param shortText
   */
  public void setInfo_shortText(final String shortText) {
    checkDisposed();
    
    this.info_shortText = shortText;
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
   * Sets the longText property to this instance.
   * 
   * @param longText
   */
  public void setInfo_longText(final String longText) {
    checkDisposed();
    
    this.info_longText = longText;
  }
}
