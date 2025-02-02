package org.skypro.skyshop.basket;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;


import org.skypro.skyshop.product.Product;

public class Basket {
    private int sumOfBasket = 0;
    private static int count = 0;
    private static int specialCount = 0;

    private Map<String,List<Product>> myBasket = new TreeMap<>();

    public void addProduct(Product p){
        myBasket.computeIfAbsent(p.getName(), k-> new ArrayList<>()).add(p);
        sumOfBasket += p.getPrice();
        if(p.isSpesial()){
            specialCount++;
        }
        count++;
    }

    public int getSum(){
        return sumOfBasket;
    }


    public void getList(){
        if(count == 0){
            System.out.println("Basket is empty");
        }else{
            System.out.println("My basket");
            
            for(Map.Entry<String,List<Product>> gl : myBasket.entrySet()){
                System.out.println(gl);
            }

            System.out.println("Special product : "+ specialCount);
            System.out.println("Sum of basket : " + sumOfBasket);
        }
    }
    public boolean inBasketEnabled(String name){
        boolean enabled = false;
        if(myBasket.containsKey(name)){
            enabled = true;
        }
        return enabled;
    }
    public void clear(){
        myBasket.clear();
        count = 0;
        sumOfBasket = 0;
    }

    public List<Product> deleteProducts(String name){
        List<Product> deleted = new LinkedList<>();
        if(myBasket.containsKey(name)){
            deleted.addAll(myBasket.get(name));
            int sumRemoved = 0;
            for (Product product : deleted) {
                sumRemoved += product.getPrice();
            }
            sumOfBasket -= sumRemoved;
            myBasket.remove(name);
        }
        if(deleted.isEmpty()){
            System.out.println("Basket not contains " + name);
        }
        return deleted;
    }

}
