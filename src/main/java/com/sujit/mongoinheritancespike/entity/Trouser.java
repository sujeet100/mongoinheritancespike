package com.sujit.mongoinheritancespike.entity;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "products")
@TypeAlias("trousers")
@JsonTypeName("Trouser")
public class Trouser extends Product {
    private String waistSize;

    public Trouser(int productId, String productName, String productDescription, double price, String waistSize) {
        super(productId, productName, productDescription, price);
        this.waistSize = waistSize;
    }

    public String getWaistSize() {
        return waistSize;
    }

    public void setWaistSize(String waistSize) {
        this.waistSize = waistSize;
    }
}
