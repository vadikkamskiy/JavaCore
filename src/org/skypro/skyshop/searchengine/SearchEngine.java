package org.skypro.skyshop.searchengine;

import org.skypro.skyshop.product.Searchable;

public class SearchEngine {
    Searchable[] searchables;
    public SearchEngine(Searchable[] p){
        searchables = new Searchable[p.length];
        System.arraycopy(p,0,searchables,0, p.length);
    }

    public Searchable[] search(String j){
        int count = 0;
        Searchable[] n = new Searchable[5];
        for(Searchable l : searchables){

            if (l.getSearchTerm().contains(j)){
                n[count] = l;
                count++;
            }
        }
        return n;
    }
    public void add(Searchable r){
        Searchable[] newArr = new Searchable[searchables.length + 1];
        for (int i = 0; i < searchables.length; i++) {
            newArr[i] = searchables[i];
        }
        newArr[newArr.length - 1] = r;
        searchables = newArr;
    }
}
