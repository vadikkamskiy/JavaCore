package org.skypro.skyshop.searchengine;

import org.skypro.skyshop.product.Product;
import org.skypro.skyshop.product.Searchable;

public class SearchEngine {
    private int weight;

    private Searchable[] findProduct = new Searchable[5];
    public SearchEngine(int w){
        weight = w;
    }
    Searchable[] searchables = new Searchable[9];
    public void generateList(Product[] p){
        System.arraycopy(p,0,searchables,0, p.length);
    }
    public void search(String j){
        int count = 0;
        for(Searchable l : searchables){
            if (l.getSearchTerm().contains(j) && count < 5){
                findProduct[count] = l;
                count++;
            }
        }
    }
    public void showSearching(){
        for(Searchable o : findProduct){
            System.out.println(o);
        }
        findProduct = new Searchable[5];
    }
}
