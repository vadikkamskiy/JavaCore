package org.skypro.skyshop.searchengine;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import org.skypro.skyshop.exceptions.BestResultNotFound;
import org.skypro.skyshop.product.Searchable;

public class SearchEngine {
    Searchable[] searchables;
    public SearchEngine(Searchable[] p){
        searchables = new Searchable[p.length];
        System.arraycopy(p,0,searchables,0, p.length);
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
        Searchable[] newArr = new Searchable[searchables.length + 1];
        for (int i = 0; i < searchables.length; i++) {
            newArr[i] = searchables[i];
        }
        newArr[newArr.length - 1] = r;
        searchables = newArr;
    }
}
