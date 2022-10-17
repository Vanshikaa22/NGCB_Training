package com.training.beans;

import java.util.Objects;
import java.util.Set;

public class Shop {

    private Integer shopId;
    private String type;
    private Set<String> products;

    public Shop() {
    }

    public Shop(Integer shopId, String type, Set<String> products) {
        this.shopId = shopId;
        this.type = type;
        this.products = products;
    }

    @Override
    public String toString() {
        return "Shop{" +
                "shopId=" + shopId +
                ", type='" + type + '\'' +
                ", products=" + products +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Shop shop = (Shop) o;
        return Objects.equals(shopId, shop.shopId) &&
                Objects.equals(type, shop.type) &&
                Objects.equals(products, shop.products);
    }

    @Override
    public int hashCode() {
        return Objects.hash(shopId, type, products);
    }

    public Integer getShopId() {
        return shopId;
    }

    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Set<String> getProducts() {
        return products;
    }

    public void setProducts(Set<String> products) {
        this.products = products;
    }
}