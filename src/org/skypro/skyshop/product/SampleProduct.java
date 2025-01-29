package org.skypro.skyshop.product;

public class SampleProduct extends Product {
    private final int price;
    public SampleProduct(String n ,int p)throws Exception{
        super(n);
        price = p;
        try {
            checkPrice(p);
        } catch (IllegalAccessException e) {
            throw e;
        }
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
        output+=this.getType()+" ";
        output+=this.getName()+": ";
        output+=this.getPrice();
        return output;
    }
    private void checkPrice(int u) throws IllegalAccessException{
        if(u<=0){
            throw new IllegalAccessException("The price cannot be like this " + u + " that should be more 0");
        }
    }
    @Override
    public String name() {
        return this.getName();
    }
}
