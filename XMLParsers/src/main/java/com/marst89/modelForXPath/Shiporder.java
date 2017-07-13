package com.marst89.modelForXPath;

import org.eclipse.persistence.oxm.annotations.XmlPath;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Shiporder {
    @XmlPath("orderperson/text()")
    protected String orderperson;
    @XmlPath("shipto/name/text()")
    protected String destinationName;
    @XmlPath("shipto/address/text()")
    protected String destinationAddress;
    @XmlPath("shipto/city/text()")
    protected String destinationCity;
    @XmlPath("shipto/country/text()")
    protected String destinationCountry;
    @XmlPath("item/title/text()")
    protected String itemTitle;
    @XmlPath("item/note/text()")
    protected String itemNote;
    @XmlPath("item/quantity/text()")
    protected String itemQuantity;
    @XmlPath("item/price/text()")
    protected String itemQuantityPrice;
    @XmlPath("@orderid/text()")
    protected String orderid;

    public String getOrderperson() {
        return orderperson;
    }

    public void setOrderperson(String orderperson) {
        this.orderperson = orderperson;
    }

    public String getDestinationName() {
        return destinationName;
    }

    public void setDestinationName(String destinationName) {
        this.destinationName = destinationName;
    }

    public String getDestinationAddress() {
        return destinationAddress;
    }

    public void setDestinationAddress(String destinationAddress) {
        this.destinationAddress = destinationAddress;
    }

    public String getDestinationCity() {
        return destinationCity;
    }

    public void setDestinationCity(String destinationCity) {
        this.destinationCity = destinationCity;
    }

    public String getDestinationCountry() {
        return destinationCountry;
    }

    public void setDestinationCountry(String destinationCountry) {
        this.destinationCountry = destinationCountry;
    }

    public String getItemTitle() {
        return itemTitle;
    }

    public void setItemTitle(String itemTitle) {
        this.itemTitle = itemTitle;
    }

    public String getItemNote() {
        return itemNote;
    }

    public void setItemNote(String itemNote) {
        this.itemNote = itemNote;
    }

    public String getItemQuantity() {
        return itemQuantity;
    }

    public void setItemQuantity(String itemQuantity) {
        this.itemQuantity = itemQuantity;
    }

    public String getItemQuantityPrice() {
        return itemQuantityPrice;
    }

    public void setItemQuantityPrice(String itemQuantityPrice) {
        this.itemQuantityPrice = itemQuantityPrice;
    }

    public String getOrderid() {
        return orderid;
    }

    public void setOrderid(String orderid) {
        this.orderid = orderid;
    }
}
