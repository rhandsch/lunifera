package org.lunifera.metamodel.dsl.lunentity.testmodel;

import java.util.List;
import org.lunifera.metamodel.dsl.lunentity.testmodel.Country;
import org.lunifera.metamodel.dsl.lunentity.testmodel.PostBox;

public class Address {
  private boolean disposed;
  
  private String street;
  
  private int number;
  
  private String postalcode;
  
  private Country country;
  
  private List<PostBox> postBoxes;
  
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
   * Returns the street property or <code>null</code> if not present.
   * 
   * @return street
   */
  public String getStreet() {
    checkDisposed();
    
    return this.street;
  }
  
  /**
   * Sets the _street property to this instance.
   * 
   * @param _street
   */
  public void setStreet(final String _street) {
    checkDisposed();
    
    this.street = _street;
  }
  
  /**
   * Returns the number property or <code>null</code> if not present.
   * 
   * @return number
   */
  public int getNumber() {
    checkDisposed();
    
    return this.number;
  }
  
  /**
   * Sets the _number property to this instance.
   * 
   * @param _number
   */
  public void setNumber(final int _number) {
    checkDisposed();
    
    this.number = _number;
  }
  
  /**
   * Returns the postalcode property or <code>null</code> if not present.
   * 
   * @return postalcode
   */
  public String getPostalcode() {
    checkDisposed();
    
    return this.postalcode;
  }
  
  /**
   * Sets the _postalcode property to this instance.
   * 
   * @param _postalcode
   */
  public void setPostalcode(final String _postalcode) {
    checkDisposed();
    
    this.postalcode = _postalcode;
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
   * Sets the _country reference to this instance.
   * 
   * @param _country
   */
  public void setCountry(final Country _country) {
    checkDisposed();
    
    this.country = _country;
  }
  
  /**
   * Returns an unmodifiable list of postBoxes.
   * 
   * @return postBoxes
   */
  public List<PostBox> getPostBoxes() {
    checkDisposed();
    
    ensurePostBoxes();
    return java.util.Collections.unmodifiableList(this.postBoxes);
  }
  
  /**
   * Adds the given _postBoxes to this object. <p>
   * 
   * @param _postBoxes
   */
  public void addPostBoxes(final PostBox _postBoxes) {
    checkDisposed();
    
    // If _postBoxes is null, we do not add it
    if(_postBoxes==null){
    	return;
    }
    
    ensurePostBoxes();
    
    // Adds the parameter to the list
    if(!this.postBoxes.contains(_postBoxes)){
    	this.postBoxes.add(_postBoxes);
    }
  }
  
  /**
   * Removes the given _postBoxes from this object.
   * 
   * @param _postBoxes
   */
  public void removePostBoxes(final PostBox _postBoxes) {
    checkDisposed();
    
    // If _postBoxes or the postBoxes are null, we can leave
    if(_postBoxes==null || postBoxes==null){
    	return;
    }
    
    this.postBoxes.remove(_postBoxes);
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
