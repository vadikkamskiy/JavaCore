package org.skypro.skyshop;

import org.skypro.skyshop.basket.Basket;
import org.skypro.skyshop.exceptions.BestResultNotFound;
import org.skypro.skyshop.product.*;
import org.skypro.skyshop.searchengine.SearchEngine;

import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws Exception {
        Basket myBasket = new Basket();
        Product[] shopList = new Product[9];
        Article[] artList = new Article[9];
        try {
            shopList[0] = new SampleProduct("beerr",0);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            shopList[0] = new SampleProduct("beerr",69);

        }
        artList[0] = new Article("Bad beer" , "Very good choise");
        shopList[1] = new FixPriceProduct("whiskey");
        artList[1] = new Article("Whiskey Jacky Danielson","beautiful with cola");
        shopList[2] = new DiscountedProduct("gin", 450, 11);
        artList[2] = new Article("Gin Hendroy's","very strong");
        shopList[3] = new SampleProduct("wine", 670);
        artList[3] = new Article("Wine Divine","vine, we miss");
        shopList[4] = new DiscountedProduct("beer", 790, 12);
        artList[4] = new Article("Beer hellniken", "damn good");
        shopList[5] = new SampleProduct("wine", 940);
        artList[5] = new Article("Tuchi","Cabernet");
        shopList[6] = new FixPriceProduct("vodka");
        artList[6] = new Article("Vodka absoluse", "Luse everything");
        shopList[7] = new SampleProduct("wine", 1500);
        artList[7] = new Article("Wine mother-in-law's cellar","taste of childhood");
        shopList[8] = new DiscountedProduct("vodka", 900, 5);
        artList[8] = new Article("Vodka nemiron", "turn it up");
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

        Searchable[] searchables = new Searchable[shopList.length + artList.length];
        for (int i = 0; i < shopList.length; i++) {
            searchables[i * 2] = shopList[i];
            searchables[i * 2 + 1] = artList[i];
        }
        SearchEngine se = new SearchEngine(searchables);

        System.out.println(se.search("beer"));
        try {
            System.out.println(se.search("moonshine"));
        } catch (BestResultNotFound e) {
            System.out.println(e);
        }
        Product l = new FixPriceProduct("whiskeyyyyy");
        se.add(l);
        }
}