package com.magdy.model;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;

import java.util.List;

public class Guests {
    @JacksonXmlElementWrapper(useWrapping = false)
    private List<Name> names;
    @JacksonXmlElementWrapper(useWrapping = false)
    private List<Address> addresses;

    public Guests() {
    }

    public Guests(List<Name> names, List<Address> addresses) {
        this.names = names;
        this.addresses = addresses;
    }

    public List<Name> getNames() {
        return names;
    }

    public void setNames(List<Name> names) {
        this.names = names;
    }

    public List<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }

    @Override
    public String toString() {
        return "Guests{" +
                "names=" + names +
                ", addresses=" + addresses +
                '}';
    }
}
