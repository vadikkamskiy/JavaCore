package org.skypro.skyshop.searchengine;

import org.skypro.skyshop.product.Product;
import org.skypro.skyshop.product.Searchable;

public class SearchEngine {

    private Searchable[] findProduct = new Searchable[5];
    Searchable[] searchables;
    public void generateList(Product[] p){
        searchables = new Searchable[p.length];
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
    public void addProdct(Product t){
        for(int i = 0;i< findProduct.length;i++){
            if(findProduct[i] == null){
                findProduct[i] = t;
                break;
            }
        }
    }
}
