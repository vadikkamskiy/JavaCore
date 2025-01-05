package org.skypro.skyshop.searchengine;

import org.skypro.skyshop.product.Searchable;

public class SearchEngine {

    Searchable[] searchables;
    public void generateList(Searchable[] p){
        searchables = new Searchable[p.length];
        System.arraycopy(p,0,searchables,0, p.length);
    }
    public void search(String j){
        for(Searchable l : searchables){
            if (l.getSearchTerm().contains(j)){
                System.out.println(l);
            }
        }
    }

}
