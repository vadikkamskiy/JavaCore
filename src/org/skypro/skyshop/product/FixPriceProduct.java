package org.skypro.skyshop.product;

public class FixPriceProduct extends Product {
    static int FIXED_PRICE = 109;
    public FixPriceProduct(String n){
        super(n);
    }

    @Override
    public int getPrice() {
        return FIXED_PRICE;
    }

    @Override
    public boolean isSpesial() {
        return true;
    }

    public String toString() {
        String output = "";
        output+=this.getName()+": Fixed price - ";
        output+=this.getPrice();
        return output;
    }

}