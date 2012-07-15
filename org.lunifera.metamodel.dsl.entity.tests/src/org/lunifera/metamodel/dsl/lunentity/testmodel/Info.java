package org.lunifera.metamodel.dsl.lunentity.testmodel;

public class Info {
  private String shortText;
  
  private String longText;
  
  /**
   * Returns the shortText property or <code>null</code> if not present.
   * 
   * @return shortText
   */
  public String getShortText() {
    return this.shortText;
  }
  
  /**
   * Sets the shortText property to this instance.
   * 
   * @param shortText
   */
  public void setShortText(final String shortText) {
    this.shortText = shortText;
  }
  
  /**
   * Returns the longText property or <code>null</code> if not present.
   * 
   * @return longText
   */
  public String getLongText() {
    return this.longText;
  }
  
  /**
   * Sets the longText property to this instance.
   * 
   * @param longText
   */
  public void setLongText(final String longText) {
    this.longText = longText;
  }
}
