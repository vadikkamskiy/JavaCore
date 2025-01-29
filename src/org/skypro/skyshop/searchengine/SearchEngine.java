package org.skypro.skyshop.searchengine;

import java.util.LinkedList;
import java.util.List;

import org.skypro.skyshop.exceptions.BestResultNotFound;

import org.skypro.skyshop.product.Searchable;

public class SearchEngine {
    List<Searchable> searchables;
    public SearchEngine(List<Searchable> p){
        searchables = p;
    }

    public List<Searchable> search(String j) throws BestResultNotFound{
        List<Searchable> r = new LinkedList<>();
        for (Searchable searchable : searchables) {
            if(searchable.toString().contains(j)){
                r.add(searchable);
            }
        }
        if (r.isEmpty()) {
            throw new BestResultNotFound(j + " not found");
        }
        return r;
    }
    public void add(Searchable r){
        searchables.add(r);
    }
}
