package org.skypro.skyshop;

import org.skypro.skyshop.basket.Basket;
import org.skypro.skyshop.product.Product;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Basket myBasket = new Basket();
        Product[] shopList = new Product[9];
        shopList[0] = new Product("beer", 80);
        shopList[1] = new Product("whiskey", 800);
        shopList[2] = new Product("gin", 450);
        shopList[3] = new Product("wine", 670);
        shopList[4] = new Product("beer", 120);
        shopList[5] = new Product("wine", 940);
        shopList[6] = new Product("vodka", 450);
        shopList[7] = new Product("wine", 1500);
        shopList[8] = new Product("vodka", 900);
        System.out.println("Shop \n");
        for (Product product : shopList){
            System.out.println(product.getName());
        }
        myBasket.getList();
        for(int i = 0;i<7;i++ ){
            myBasket.addProduct(shopList[i]);
        }
        myBasket.getList();
        System.out.println(myBasket.inBasketEnabled("beer"));

        myBasket.clear();
        myBasket.getList();
    }
}