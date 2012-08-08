package org.lunifera.metamodel.dsl.lunentity.testmodel;

import java.util.List;

public class ExtendedLibrary extends Library {
  private String address_street;
  
  private int address_number;
  
  private String address_postalcode;
  
  private Country address_country;
  
  private List<PostBox> address_postBoxes;
  
  private String address_info_shortText;
  
  private String address_info_longText;
  
  private Book lastLendedBook;
  
  private List<Book> allLendedBooks;
  
  private SomeEnum anEnum;
  
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
    
    super.dispose();
    
  }
  
  /**
   * Returns the address_street property or <code>null</code> if not present.
   * 
   * @return address_street
   */
  public String getAddress_street() {
    checkDisposed();
    
    return this.address_street;
  }
  
  /**
   * Sets the _street property to this instance.
   * 
   * @param _street
   */
  public void setAddress_street(final String _street) {
    checkDisposed();
    
    this.address_street = _street;
  }
  
  /**
   * Returns the address_number property or <code>null</code> if not present.
   * 
   * @return address_number
   */
  public int getAddress_number() {
    checkDisposed();
    
    return this.address_number;
  }
  
  /**
   * Sets the _number property to this instance.
   * 
   * @param _number
   */
  public void setAddress_number(final int _number) {
    checkDisposed();
    
    this.address_number = _number;
  }
  
  /**
   * Returns the address_postalcode property or <code>null</code> if not present.
   * 
   * @return address_postalcode
   */
  public String getAddress_postalcode() {
    checkDisposed();
    
    return this.address_postalcode;
  }
  
  /**
   * Sets the _postalcode property to this instance.
   * 
   * @param _postalcode
   */
  public void setAddress_postalcode(final String _postalcode) {
    checkDisposed();
    
    this.address_postalcode = _postalcode;
  }
  
  /**
   * Returns the address_country reference or <code>null</code> if not present.
   * 
   * @return address_country
   */
  public Country getAddress_country() {
    checkDisposed();
    
    return this.address_country;
  }
  
  /**
   * Sets the _country reference to this instance.
   * 
   * @param _country
   */
  public void setAddress_country(final Country _country) {
    checkDisposed();
    
    this.address_country = _country;
  }
  
  /**
   * Returns an unmodifiable list of address_postBoxes.
   * 
   * @return address_postBoxes
   */
  public List<PostBox> getAddress_postBoxes() {
    checkDisposed();
    
    ensureAddress_postBoxes();
    return java.util.Collections.unmodifiableList(this.address_postBoxes);
  }
  
  /**
   * Adds the given _postBoxes to this object. <p>
   * 
   * @param _postBoxes
   */
  public void addAddress_postBoxes(final PostBox _postBoxes) {
    checkDisposed();
    
    // If _postBoxes is null, we do not add it
    if(_postBoxes==null){
    	return;
    }
    
    ensureAddress_postBoxes();
    
    // Adds the parameter to the list
    if(!this.address_postBoxes.contains(_postBoxes)){
    	this.address_postBoxes.add(_postBoxes);
    }
  }
  
  /**
   * Removes the given _postBoxes from this object.
   * 
   * @param _postBoxes
   */
  public void removeAddress_postBoxes(final PostBox _postBoxes) {
    checkDisposed();
    
    // If _postBoxes or the address_postBoxes are null, we can leave
    if(_postBoxes==null || address_postBoxes==null){
    	return;
    }
    
    this.address_postBoxes.remove(_postBoxes);
  }
  
  /**
   * Ensures that the list of postBoxes is created. It will be instantiated 
   * lazy.
   */
  private void ensureAddress_postBoxes() {
    if (this.address_postBoxes == null) {
    	this.address_postBoxes = new java.util.ArrayList<PostBox>();
    }
  }
  
  /**
   * Returns the address_info_shortText property or <code>null</code> if not present.
   * 
   * @return address_info_shortText
   */
  public String getAddress_info_shortText() {
    checkDisposed();
    
    return this.address_info_shortText;
  }
  
  /**
   * Sets the _shortText property to this instance.
   * 
   * @param _shortText
   */
  public void setAddress_info_shortText(final String _shortText) {
    checkDisposed();
    
    this.address_info_shortText = _shortText;
  }
  
  /**
   * Returns the address_info_longText property or <code>null</code> if not present.
   * 
   * @return address_info_longText
   */
  public String getAddress_info_longText() {
    checkDisposed();
    
    return this.address_info_longText;
  }
  
  /**
   * Sets the _longText property to this instance.
   * 
   * @param _longText
   */
  public void setAddress_info_longText(final String _longText) {
    checkDisposed();
    
    this.address_info_longText = _longText;
  }
  
  /**
   * Returns the lastLendedBook reference or <code>null</code> if not present.
   * 
   * @return lastLendedBook
   */
  public Book getLastLendedBook() {
    checkDisposed();
    
    return this.lastLendedBook;
  }
  
  /**
   * Sets the _lastLendedBook reference to this instance.
   * 
   * @param _lastLendedBook
   */
  public void setLastLendedBook(final Book _lastLendedBook) {
    checkDisposed();
    
    this.lastLendedBook = _lastLendedBook;
  }
  
  /**
   * Returns an unmodifiable list of allLendedBooks.
   * 
   * @return allLendedBooks
   */
  public List<Book> getAllLendedBooks() {
    checkDisposed();
    
    ensureAllLendedBooks();
    return java.util.Collections.unmodifiableList(this.allLendedBooks);
  }
  
  /**
   * Adds the given _allLendedBooks to this object. <p>
   * 
   * @param _allLendedBooks
   */
  public void addAllLendedBooks(final Book _allLendedBooks) {
    checkDisposed();
    
    // If _allLendedBooks is null, we do not add it
    if(_allLendedBooks==null){
    	return;
    }
    
    ensureAllLendedBooks();
    
    // Adds the parameter to the list
    if(!this.allLendedBooks.contains(_allLendedBooks)){
    	this.allLendedBooks.add(_allLendedBooks);
    }
  }
  
  /**
   * Removes the given _allLendedBooks from this object.
   * 
   * @param _allLendedBooks
   */
  public void removeAllLendedBooks(final Book _allLendedBooks) {
    checkDisposed();
    
    // If _allLendedBooks or the allLendedBooks are null, we can leave
    if(_allLendedBooks==null || allLendedBooks==null){
    	return;
    }
    
    this.allLendedBooks.remove(_allLendedBooks);
  }
  
  /**
   * Ensures that the list of allLendedBooks is created. It will be instantiated 
   * lazy.
   */
  private void ensureAllLendedBooks() {
    if (this.allLendedBooks == null) {
    	this.allLendedBooks = new java.util.ArrayList<Book>();
    }
  }
  
  /**
   * Returns the anEnum property or <code>null</code> if not present.
   * 
   * @return anEnum
   */
  public SomeEnum getAnEnum() {
    checkDisposed();
    
    return this.anEnum;
  }
  
  /**
   * Sets the _anEnum property to this instance.
   * 
   * @param _anEnum
   */
  public void setAnEnum(final SomeEnum _anEnum) {
    checkDisposed();
    
    this.anEnum = _anEnum;
  }
  
  /**
   * Calculates the count of lended books
   */
  public Integer determineLendedBooksCount() {
    List<Book> _allLendedBooks = this.getAllLendedBooks();
    return Integer.valueOf(_allLendedBooks.size());
  }
}
