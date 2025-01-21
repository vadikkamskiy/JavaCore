package org.skypro.skyshop.basket;
import java.util.LinkedList;
import java.util.List;

import org.skypro.skyshop.product.Product;

public class Basket {
    private static int count = 0;
    private static int specialCount = 0;
    List<Product> myBasket = new LinkedList<>();

    public void addProduct(Product p){
        myBasket.add(p);
        count++;
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
                System.out.println(prod);
                if(prod.isSpesial()) {specialCount++;}
            }
            System.out.println("Total: " + getSum());
            System.out.println("Special products: " + specialCount);
        }
    }
    public boolean inBasketEnabled(String name){
        boolean enabled = false;
        for(Product product : myBasket){
            if (product.getSearchTerm().contains(name)) {
                enabled = true;
            }
            break;
        }
        return enabled;
    }
    public void clear(){
        myBasket.clear();
        count = 0;
    }

    public List<Product> deleteProducts(String name){
        List<Product> deleted = new LinkedList<>();
        for (int i = 0; i<myBasket.size();i++){
            if(myBasket.get(i).getName().equals(name)){
                deleted.add(myBasket.get(i));
                myBasket.remove(i);
            }
        }
        if(deleted.isEmpty()){
            System.out.println("Basket not contains " + name);
        }
        return deleted;
    }
}
