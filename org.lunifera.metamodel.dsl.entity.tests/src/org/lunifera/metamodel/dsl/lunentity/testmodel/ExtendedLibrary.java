package org.lunifera.metamodel.dsl.lunentity.testmodel;

import java.util.List;
import org.lunifera.metamodel.dsl.lunentity.testmodel.Book;
import org.lunifera.metamodel.dsl.lunentity.testmodel.Country;
import org.lunifera.metamodel.dsl.lunentity.testmodel.Library;
import org.lunifera.metamodel.dsl.lunentity.testmodel.PostBox;
import org.lunifera.metamodel.dsl.lunentity.testmodel.SomeEnum;

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
   * Sets the address_street property to this instance.
   * 
   * @param address_street
   */
  public void setAddress_street(final String address_street) {
    checkDisposed();
    
    this.address_street = address_street;
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
   * Sets the address_number property to this instance.
   * 
   * @param address_number
   */
  public void setAddress_number(final int address_number) {
    checkDisposed();
    
    this.address_number = address_number;
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
   * Sets the address_postalcode property to this instance.
   * 
   * @param address_postalcode
   */
  public void setAddress_postalcode(final String address_postalcode) {
    checkDisposed();
    
    this.address_postalcode = address_postalcode;
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
   * checkDisposed();
   * 
   * Sets the address_country reference to this instance.
   * 
   * @param address_country
   */
  public void setAddress_country(final Country address_country) {
    checkDisposed();
    
    this.address_country = address_country;
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
   * Adds the given postBox to this object. <p>
   * 
   * @param postBox
   */
  public void addAddress_postBoxes(final PostBox postBox) {
    checkDisposed();
    
    // If postBox is null, we do not add it
    if(postBox==null){
    	return;
    }
    
    ensureAddress_postBoxes();
    
    // Adds the parameter to the list
    if(!this.address_postBoxes.contains(postBox)){
    	this.address_postBoxes.add(postBox);
    }
  }
  
  /**
   * Removes the given postBox from this object.
   * 
   * @param postBox
   */
  public void removeAddress_postBoxes(final PostBox postBox) {
    checkDisposed();
    
    // If postBox or the address_postBoxes are null, we can leave
    if(postBox==null || address_postBoxes==null){
    	return;
    }
    
    this.address_postBoxes.remove(postBox);
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
   * Sets the address_info_shortText property to this instance.
   * 
   * @param address_info_shortText
   */
  public void setAddress_info_shortText(final String address_info_shortText) {
    checkDisposed();
    
    this.address_info_shortText = address_info_shortText;
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
   * Sets the address_info_longText property to this instance.
   * 
   * @param address_info_longText
   */
  public void setAddress_info_longText(final String address_info_longText) {
    checkDisposed();
    
    this.address_info_longText = address_info_longText;
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
   * checkDisposed();
   * 
   * Sets the lastLendedBook reference to this instance.
   * 
   * @param lastLendedBook
   */
  public void setLastLendedBook(final Book lastLendedBook) {
    checkDisposed();
    
    this.lastLendedBook = lastLendedBook;
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
   * Adds the given book to this object. <p>
   * 
   * @param book
   */
  public void addAllLendedBooks(final Book book) {
    checkDisposed();
    
    // If book is null, we do not add it
    if(book==null){
    	return;
    }
    
    ensureAllLendedBooks();
    
    // Adds the parameter to the list
    if(!this.allLendedBooks.contains(book)){
    	this.allLendedBooks.add(book);
    }
  }
  
  /**
   * Removes the given book from this object.
   * 
   * @param book
   */
  public void removeAllLendedBooks(final Book book) {
    checkDisposed();
    
    // If book or the allLendedBooks are null, we can leave
    if(book==null || allLendedBooks==null){
    	return;
    }
    
    this.allLendedBooks.remove(book);
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
   * Sets the anEnum property to this instance.
   * 
   * @param anEnum
   */
  public void setAnEnum(final SomeEnum anEnum) {
    checkDisposed();
    
    this.anEnum = anEnum;
  }
  
  /**
   * Calculates the count of lended books
   */
  public Integer determineLendedBooksCount() {
    List<Book> _allLendedBooks = this.getAllLendedBooks();
    return Integer.valueOf(_allLendedBooks.size());
  }
}
