package org.skypro.skyshop.product;

public class FixPriceProduct extends Product {
    static int FIXED_PRICE = 109;
    private static Article art;

    public FixPriceProduct(String n,Article a){
        super(n,a);
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

    @Override
    public String getType(){
        return "is special";
    }
}
