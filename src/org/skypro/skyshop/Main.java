package org.skypro.skyshop;

import org.skypro.skyshop.basket.Basket;
import org.skypro.skyshop.product.DiscountedProduct;
import org.skypro.skyshop.product.FixPriceProduct;
import org.skypro.skyshop.product.Product;
import org.skypro.skyshop.product.SampleProduct;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Basket myBasket = new Basket();
        Product[] shopList = new Product[9];
        shopList[0] = new SampleProduct("beer",69);
        shopList[1] = new FixPriceProduct("whiskey");
        shopList[2] = new DiscountedProduct("gin", 450, 11);
        shopList[3] = new SampleProduct("wine", 670);
        shopList[4] = new DiscountedProduct("beer", 120, 7);
        shopList[5] = new SampleProduct("wine", 940);
        shopList[6] = new FixPriceProduct("vodka");
        shopList[7] = new SampleProduct("wine", 1500);
        shopList[8] = new DiscountedProduct("vodka", 900, 5);
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
    }
}