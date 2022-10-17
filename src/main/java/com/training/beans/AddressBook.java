package com.training.beans;

import java.util.Map;
import java.util.Objects;

public class AddressBook {
    private Integer addressId;
    private Map<String,String> details;

    public AddressBook() {
    }

    public AddressBook(Integer addressId, Map<String, String> details) {
        this.addressId = addressId;
        this.details = details;
    }

    @Override
    public String toString() {
        return "AddressBook{" +
                "addressId=" + addressId +
                ", details=" + details +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AddressBook that = (AddressBook) o;
        return Objects.equals(addressId, that.addressId) &&
                Objects.equals(details, that.details);
    }

    @Override
    public int hashCode() {
        return Objects.hash(addressId, details);
    }

    public Integer getAddressId() {
        return addressId;
    }

    public void setAddressId(Integer addressId) {
        this.addressId = addressId;
    }

    public Map<String, String> getDetails() {
        return details;
    }

    public void setDetails(Map<String, String> details) {
        this.details = details;
    }
}
