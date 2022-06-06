package com.magdy.model;

import com.fasterxml.jackson.annotation.JsonProperty;


public class Name {

    @JsonProperty("NameItem")
    private String nameItem;

    public Name() {
    }

    public Name(String nameItem) {
        this.nameItem = nameItem;
    }

    public String getNameItem() {
        return nameItem;
    }

    public void setNameItem(String nameItem) {
        this.nameItem = nameItem;
    }

    @Override
    public String toString() {
        return "Name{" +
                "nameItem='" + nameItem + '\'' +
                '}';
    }
}
