package org.skypro.skyshop.product;

public class FixPriceProduct extends Product {
    static int FIXED_PRICE = 109;

    public FixPriceProduct(String n) throws Exception{
        super(n);
    }
    @Override
    public int getPrice() {
        return FIXED_PRICE;
    }

    public boolean isSpesial() {
        return true;
    }


    public String toString() {
        String output = "";
        output+=this.getType()+" ";
        output+=this.getName()+": Fixed price - ";
        output+=this.getPrice();
        return output;
    }
    @Override
    public String name() {
        return this.getName();
    }
}
