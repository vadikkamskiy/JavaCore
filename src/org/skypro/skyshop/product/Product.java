package org.skypro.skyshop.product;



public abstract class Product implements Searchable{
    private final String name;
    public Product(String n) throws IllegalAccessException{
        name = n;
        checkNPE(n);
    }

    public String getName(){
        return name;
    }
    public abstract int getPrice();
    public abstract boolean isSpesial();
    @Override
    public String getSearchTerm() {
        return name + ": " + getPrice();
    }
    @Override
    public String getType(){
        return "PRODUCT";
    }

    private void checkNPE(String n) throws IllegalAccessException{
        if(n==null || n.isBlank()){
            throw new IllegalAccessException("empty name variable");
        }
    }
}
