package com.amiyasahu.spm.model;

public class ProductLineWithBLOBs extends ProductLine {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column productlines.htmlDescription
     *
     * @mbg.generated Sun Sep 18 20:00:15 IST 2016
     */
    private String htmldescription;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column productlines.image
     *
     * @mbg.generated Sun Sep 18 20:00:15 IST 2016
     */
    private byte[] image;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column productlines.htmlDescription
     *
     * @return the value of productlines.htmlDescription
     *
     * @mbg.generated Sun Sep 18 20:00:15 IST 2016
     */
    public String getHtmldescription() {
        return htmldescription;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column productlines.htmlDescription
     *
     * @param htmldescription the value for productlines.htmlDescription
     *
     * @mbg.generated Sun Sep 18 20:00:15 IST 2016
     */
    public void setHtmldescription(String htmldescription) {
        this.htmldescription = htmldescription;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column productlines.image
     *
     * @return the value of productlines.image
     *
     * @mbg.generated Sun Sep 18 20:00:15 IST 2016
     */
    public byte[] getImage() {
        return image;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column productlines.image
     *
     * @param image the value for productlines.image
     *
     * @mbg.generated Sun Sep 18 20:00:15 IST 2016
     */
    public void setImage(byte[] image) {
        this.image = image;
    }
}