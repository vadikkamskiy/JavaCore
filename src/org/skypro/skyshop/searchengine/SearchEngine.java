package org.skypro.skyshop.searchengine;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import org.skypro.skyshop.exceptions.BestResultNotFound;

import org.skypro.skyshop.product.Searchable;

public class SearchEngine {
    List<Searchable> searchables;
    public SearchEngine(List<Searchable> p){
        searchables = p;
    }

    public Map<String,List<Searchable>> search(String j) throws BestResultNotFound{
        Map<String,List<Searchable>> output = new TreeMap<>();
       for (Searchable s : searchables) {
        if (s.getSearchTerm().contains(j)) {
            output.computeIfAbsent(s.getName(), k-> new ArrayList<>()).add(s);
        }
       }
       return output;
    }
    public void add(Searchable r){
        searchables.add(r);
    }
}
