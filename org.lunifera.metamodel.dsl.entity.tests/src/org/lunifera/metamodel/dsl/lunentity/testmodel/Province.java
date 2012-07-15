package org.lunifera.metamodel.dsl.lunentity.testmodel;

import org.lunifera.metamodel.dsl.lunentity.testmodel.Country;

public class Province {
  private boolean settingCountry;
  
  private Country country;
  
  private String info_shortText;
  
  private String info_longText;
  
  /**
   * Returns the country reference or <code>null</code> if not present.
   * 
   * @return country
   */
  public Country getCountry() {
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
    return this.info_shortText;
  }
  
  /**
   * Sets the info_shortText property to this instance.
   * 
   * @param info_shortText
   */
  public void setInfo_shortText(final String info_shortText) {
    this.info_shortText = info_shortText;
  }
  
  /**
   * Returns the info_longText property or <code>null</code> if not present.
   * 
   * @return info_longText
   */
  public String getInfo_longText() {
    return this.info_longText;
  }
  
  /**
   * Sets the info_longText property to this instance.
   * 
   * @param info_longText
   */
  public void setInfo_longText(final String info_longText) {
    this.info_longText = info_longText;
  }
}
