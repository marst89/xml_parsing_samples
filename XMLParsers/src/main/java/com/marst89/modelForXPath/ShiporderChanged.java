package com.marst89.modelForXPath;

import org.eclipse.persistence.oxm.annotations.XmlPath;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 * Created by marst89 on 7/13/2017.
 */
@XmlRootElement(name="shiporder")
@XmlAccessorType(XmlAccessType.FIELD)
public class ShiporderChanged {
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
        @XmlPath("shipto/item/note/text()")
        protected String itemNote;
        @XmlTransient
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

        public String getItemNote() {
            return itemNote;
        }

        public void setItemNote(String itemNote) {
            this.itemNote = itemNote;
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
