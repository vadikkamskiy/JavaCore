package org.skypro.skyshop.searchengine;

import org.skypro.skyshop.exceptions.BestResultNotFound;
import org.skypro.skyshop.product.Searchable;

public class SearchEngine {
    Searchable[] searchables;
    public SearchEngine(Searchable[] p){
        searchables = new Searchable[p.length];
        System.arraycopy(p,0,searchables,0, p.length);
    }

    public Searchable search(String j) throws BestResultNotFound{
        int count = 1;
        Searchable r = null;
        for(int i= 0;i<searchables.length;i++){
            String[] u =  searchables[i].getSearchTerm().split(j);
            if(u.length>count ){
                count = u.length;
                r=searchables[i];
            }
        }
        if (r==null) {
            throw new BestResultNotFound(j + " not found");
        }
        return r;
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
