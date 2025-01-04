package org.skypro.skyshop.basket;
import org.skypro.skyshop.product.Product;

public class Basket {
    private static int count = 0;
    Product[] myBasket = new Product[5];

    public void addProduct(Product p){
        if(count < 5){
            myBasket[count] = p;
            count++;
        }else if (count == 0) {
            System.out.println("Basket is empty");
        } else {
            System.out.println("Basket is full");
        }
    }
    public int getSum(){
        int sum = 0;
        for(Product product : myBasket){
            sum += product.getPrice();
        }
        return sum;
    }

    public void getList(){
        if(count == 0){
            System.out.println("Basket is empty");
        }else{
            System.out.println("My basket");
            for(Product prod : myBasket){
                System.out.println(prod.getName() +": " + prod.getPrice());
            }
            System.out.println("Total: " + getSum());
        }
    }
    public boolean inBasketEnabled(String name){
        boolean enabled = false;
        for(Product product : myBasket){
            if(product.getName() == name){
                enabled = true;
            }
        }
        return enabled;
    }
    public void clear(){
        myBasket = new Product[5];
        count = 0;
    }
}
