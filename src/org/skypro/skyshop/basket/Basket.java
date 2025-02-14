package org.skypro.skyshop.basket;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;
import org.skypro.skyshop.product.Product;

public class Basket {
    private int sumOfBasket = 0;
    private static int count = 0;
    private static int specialCount = 0;

    private Map<String,List<Product>> myBasket = new TreeMap<>();

    public void addProduct(Product p){
        myBasket.computeIfAbsent(p.getName(), k-> new ArrayList<>()).add(p);
        sumOfBasket += p.getPrice();
        count++;
    }

    public int getSum(){
        List<Product> lop = myBasket.values().stream()
            .flatMap(List::stream)
            .collect(Collectors.toList());
        sumOfBasket = lop.stream()
            .mapToInt(p -> p.getPrice())
            .sum();
        long sC = lop.stream()
            .filter(n -> n.isSpesial())
            .count();
        specialCount = (int) sC;
        return sumOfBasket;
    }


    public void getList(){
        if(count == 0){
            System.out.println("Basket is empty");
        }else{
            myBasket.values().stream()
                .forEach(n -> System.out.println(n));
        }
        System.out.println("Sum of basket :" + getSum());
        System.out.println("Special products :" + specialCount);
    }
    public boolean inBasketEnabled(String name){
        boolean enabled = false;
        if(myBasket.containsKey(name)){
            enabled = true;
        }
        return enabled;
    }
    public void delete(){
        myBasket.clear();
        count = 0;
        sumOfBasket = 0;
        specialCount = 0;
    }

    public List<Product> deleteProducts(String name){
        List<Product> deleted = new LinkedList<>();
        deleted = myBasket.get(name);
        myBasket.entrySet().removeIf(entry -> entry.getKey().equals(name));
        return deleted;
    }

}
