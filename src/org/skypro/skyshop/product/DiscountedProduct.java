package org.skypro.skyshop.product;

public class DiscountedProduct extends Product {
    private int price;
    public int discount;
    public DiscountedProduct(String n, int p, int d){
        super(n);
        price = p;
        discount = d;
    }
    @Override
    public int getPrice(){
        return (price/100)*(100-discount);
    }

    @Override
    public boolean isSpesial() {
        return true;
    }

    public String toString() {
        String output = "";
        output+=this.getName()+": ";
        output+=this.getPrice();
        output+="(discount " + this.discount+"%)";
        return output;
    }
}
