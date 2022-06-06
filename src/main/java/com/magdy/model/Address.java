package com.magdy.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Address {

    @JsonProperty("AddressItem")
    private String addressItem;

    public Address(String addressItem) {
        this.addressItem = addressItem;
    }

    public Address() {
    }


    public String getAddressItem() {
        return addressItem;
    }

    public void setAddressItem(String addressItem) {
        this.addressItem = addressItem;
    }

    @Override
    public String toString() {
        return "Address{" +
                "addressItem='" + addressItem + '\'' +
                '}';
    }
}
