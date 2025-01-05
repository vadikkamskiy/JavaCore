package org.skypro.skyshop.product;

public abstract class Product implements Searchable{
    private final String name;
    Article art;
    public Product(String n ,Article a){
        name = n;
        art = a;
    }

    public String getName(){
        return name;
    }
    public abstract int getPrice();
    public abstract boolean isSpesial();
    @Override
    public String getSearchTerm() {
        return name +' '+ art.getInfo();
    }

}
