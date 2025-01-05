package org.skypro.skyshop.product;

public abstract class Product implements Searchable{
    private final String name;
    public Product(String n ){
        name = n;
    }

    public String getName(){
        return name;
    }
    public abstract int getPrice();
    public abstract boolean isSpesial();
    @Override
    public String getSearchTerm() {
        return name ;
    }
    @Override
    public String getType(){
        return "PRODUCT";
    }

}
