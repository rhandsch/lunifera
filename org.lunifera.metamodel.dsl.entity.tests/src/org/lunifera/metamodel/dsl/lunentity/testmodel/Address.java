package org.lunifera.metamodel.dsl.lunentity.testmodel;

import java.util.List;
import org.lunifera.metamodel.dsl.lunentity.testmodel.Country;
import org.lunifera.metamodel.dsl.lunentity.testmodel.PostBox;

public class Address {
  private String street;
  
  private int number;
  
  private String postalcode;
  
  private Country country;
  
  private List<PostBox> postBoxes;
  
  private String info_shortText;
  
  private String info_longText;
  
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
   * Returns the number property or <code>null</code> if not present.
   * 
   * @return number
   */
  public int getNumber() {
    return this.number;
  }
  
  /**
   * Sets the number property to this instance.
   * 
   * @param number
   */
  public void setNumber(final int number) {
    this.number = number;
  }
  
  /**
   * Returns the postalcode property or <code>null</code> if not present.
   * 
   * @return postalcode
   */
  public String getPostalcode() {
    return this.postalcode;
  }
  
  /**
   * Sets the postalcode property to this instance.
   * 
   * @param postalcode
   */
  public void setPostalcode(final String postalcode) {
    this.postalcode = postalcode;
  }
  
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
   * @param country
   */
  public void setCountry(final Country country) {
    this.country = country;
  }
  
  /**
   * Returns an unmodifiable list of postBoxes.
   * 
   * @return postBoxes
   */
  public List<PostBox> getPostBoxes() {
    ensurePostBoxes();
    return java.util.Collections.unmodifiableList(this.postBoxes);
  }
  
  /**
   * Adds the given postBox to this object. <p>
   * 
   * @param postBox
   */
  public void addPostBoxes(final PostBox postBox) {
    // If postBox is null, we do not add it
    if(postBox==null){
        return;
    }
    
    ensurePostBoxes();
    
    // Adds the parameter to the list
    if(!this.postBoxes.contains(postBox)){
        this.postBoxes.add(postBox);
    }
  }
  
  /**
   * Removes the given postBox from this object.
   * 
   * @param postBox
   */
  public void removePostBoxes(final PostBox postBox) {
    // If postBox or the postBoxes are null, we can leave
    if(postBox==null || postBoxes==null){
        return;
    }
    
    this.postBoxes.remove(postBox);
  }
  
  /**
   * Ensures that the list of postBoxes is created. It will be instantiated 
   * lazy.
   */
  private void ensurePostBoxes() {
    if (this.postBoxes == null) {
    	this.postBoxes = new java.util.ArrayList<PostBox>();
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
