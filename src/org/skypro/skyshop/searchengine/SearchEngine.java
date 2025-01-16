package org.skypro.skyshop.searchengine;

import org.skypro.skyshop.product.Searchable;

public class SearchEngine {
    Searchable[] searchables;
    public SearchEngine(Searchable[] p){
        searchables = new Searchable[p.length];
        System.arraycopy(p,0,searchables,0, p.length);
    }

    public Searchable search(String j){
        int index = 0;
        int count = 0;
        for(int i = 0;i<searchables.length;i++){
            if(searchables[i].getSearchTerm().indexOf(j)>count){
                count = searchables[i].getSearchTerm().indexOf(j);
                index = i;
            }
        }
        return searchables[index];
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
