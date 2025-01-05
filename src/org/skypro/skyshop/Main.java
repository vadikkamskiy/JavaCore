package org.skypro.skyshop;

import org.skypro.skyshop.basket.Basket;
import org.skypro.skyshop.product.*;
import org.skypro.skyshop.searchengine.SearchEngine;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Basket myBasket = new Basket();
        Searchable[] shopList = new Searchable[11];
        shopList[0] = new SampleProduct("beer",69);
        shopList[1] = new FixPriceProduct("whiskey");
        shopList[2] = new DiscountedProduct("gin", 450, 11);
        shopList[3] = new SampleProduct("wine", 670);
        shopList[4] = new DiscountedProduct("beer", 120, 7);
        shopList[5] = new SampleProduct("wine", 940);
        shopList[6] = new FixPriceProduct("vodka");
        shopList[7] = new SampleProduct("wine", 1500)   ;
        shopList[8] = new DiscountedProduct("vodka", 900, 5);
        shopList[9] = new Article("my think", "that's bullshit");
        shopList[10] = new Article("I'm serious", "that's holy crap");
        System.out.println("Shop \n");
        for (Searchable c : shopList){
            System.out.println(c);
        }
        myBasket.getList();
        for(int i = 0;i<7;i++ ){
            myBasket.addProduct(shopList[i]);
        }
        myBasket.getList();
        System.out.println(myBasket.inBasketEnabled("beer"));

        myBasket.clear();
        myBasket.getList();
        SearchEngine se = new SearchEngine();
        se.generateList(shopList);

        se.search("th");
    }
}