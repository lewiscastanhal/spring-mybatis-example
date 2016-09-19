package com.amiyasahu.spm.model;

import java.math.BigDecimal;

public class OrderDetail extends OrderDetailKey {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orderdetails.quantityOrdered
     *
     * @mbg.generated Sun Sep 18 20:00:15 IST 2016
     */
    private Integer quantityordered;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orderdetails.priceEach
     *
     * @mbg.generated Sun Sep 18 20:00:15 IST 2016
     */
    private BigDecimal priceeach;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orderdetails.orderLineNumber
     *
     * @mbg.generated Sun Sep 18 20:00:15 IST 2016
     */
    private Short orderlinenumber;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orderdetails.quantityOrdered
     *
     * @return the value of orderdetails.quantityOrdered
     *
     * @mbg.generated Sun Sep 18 20:00:15 IST 2016
     */
    public Integer getQuantityordered() {
        return quantityordered;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orderdetails.quantityOrdered
     *
     * @param quantityordered the value for orderdetails.quantityOrdered
     *
     * @mbg.generated Sun Sep 18 20:00:15 IST 2016
     */
    public void setQuantityordered(Integer quantityordered) {
        this.quantityordered = quantityordered;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orderdetails.priceEach
     *
     * @return the value of orderdetails.priceEach
     *
     * @mbg.generated Sun Sep 18 20:00:15 IST 2016
     */
    public BigDecimal getPriceeach() {
        return priceeach;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orderdetails.priceEach
     *
     * @param priceeach the value for orderdetails.priceEach
     *
     * @mbg.generated Sun Sep 18 20:00:15 IST 2016
     */
    public void setPriceeach(BigDecimal priceeach) {
        this.priceeach = priceeach;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orderdetails.orderLineNumber
     *
     * @return the value of orderdetails.orderLineNumber
     *
     * @mbg.generated Sun Sep 18 20:00:15 IST 2016
     */
    public Short getOrderlinenumber() {
        return orderlinenumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orderdetails.orderLineNumber
     *
     * @param orderlinenumber the value for orderdetails.orderLineNumber
     *
     * @mbg.generated Sun Sep 18 20:00:15 IST 2016
     */
    public void setOrderlinenumber(Short orderlinenumber) {
        this.orderlinenumber = orderlinenumber;
    }
}