package org.skypro.skyshop.product;

public class SampleProduct extends Product {
    private final int price;
    public SampleProduct(String n ,int p){
        super(n);
        price = p;
    }
    @Override
    public int getPrice(){
        return price;
    }

    public boolean isSpesial() {
        return false;
    }

    public String toString() {
        String output = "";
        output+=this.getName()+": ";
        output+=this.getPrice();
        return output;
    }
}
