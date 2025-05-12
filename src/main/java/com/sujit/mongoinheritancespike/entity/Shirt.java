package com.sujit.mongoinheritancespike.entity;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "products")
@TypeAlias("shirts")
@JsonTypeName("Shirt")
public class Shirt extends Product {
    private String size;
    private String color;

    public Shirt(int productId, String productName, String productDescription, double price, String size, String color) {
        super(productId, productName, productDescription, price);
        this.size = size;
        this.color = color;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
