package org.skypro.skyshop.product;

public abstract class Product {
    private String name;
    public Product(String n){
        name = n;
    }

    public String getName(){
        return name;
    }
    public abstract int getPrice();
    public abstract boolean isSpesial();
}
