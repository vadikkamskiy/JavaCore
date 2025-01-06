package org.skypro.skyshop.basket;
import org.skypro.skyshop.product.Product;
import org.skypro.skyshop.product.Searchable;

public class Basket {
    private static int count = 0;
    private static int specialCount = 0;
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
        for(Searchable product : myBasket){
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
                System.out.println(prod);
                if(prod.isSpesial()) {specialCount++;}
            }
            System.out.println("Total: " + getSum());
            System.out.println("Special products: " + specialCount);
        }
    }
    public boolean inBasketEnabled(String name){
        boolean enabled = false;
        for(Searchable product : myBasket){
            if (product.getSearchTerm().contains(name)) {
                enabled = true;
            }
            break;
        }
        return enabled;
    }
    public void clear(){
        myBasket = new Product[5];
        count = 0;
    }
}
