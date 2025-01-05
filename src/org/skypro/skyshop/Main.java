package org.skypro.skyshop;

import org.skypro.skyshop.basket.Basket;
import org.skypro.skyshop.product.*;
import org.skypro.skyshop.searchengine.SearchEngine;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Basket myBasket = new Basket();
        Product[] shopList = new Product[9];
        shopList[0] = new SampleProduct("beer",69,new Article("bad","nice beer"));
        shopList[1] = new FixPriceProduct("whiskey",new Article("Jacky Danielson","good with cola"));
        shopList[2] = new DiscountedProduct("gin", 450, 11 ,new Article("Handroy's","wery sweet"));
        shopList[3] = new SampleProduct("wine", 670, new Article("Purhary","pinot noir"));
        shopList[4] = new DiscountedProduct("beer", 120, 7, new Article("hellniken", "damn good"));
        shopList[5] = new SampleProduct("wine", 940,new Article("elnatural","oraganic wine"));
        shopList[6] = new FixPriceProduct("vodka",new Article("nemiron", "turn it up"));
        shopList[7] = new SampleProduct("wine", 1500,new Article("Los nubes" , "cabernet"))   ;
        shopList[8] = new DiscountedProduct("vodka", 900, 5,new Article("absolose","lose everything"));
        System.out.println("Shop \n");
        for (Product product : shopList){
            System.out.println(product);
        }
        myBasket.getList();
        for(int i = 0;i<7;i++ ){
            myBasket.addProduct(shopList[i]);
        }
        myBasket.getList();
        System.out.println(myBasket.inBasketEnabled("beer"));

        myBasket.clear();
        myBasket.getList();
        SearchEngine se = new SearchEngine(shopList.length);
        se.generateList(shopList);
        se.search("nice");
        se.showSearching();
        se.search("wine");
        se.showSearching();
        se.search("good");
        se.showSearching();
    }
}