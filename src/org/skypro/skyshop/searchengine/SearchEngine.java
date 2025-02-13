package org.skypro.skyshop.searchengine;

import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import org.skypro.skyshop.exceptions.BestResultNotFound;
import org.skypro.skyshop.product.Searchable;

public class SearchEngine {
    Set<Searchable> searchables = new HashSet<>();
    public SearchEngine(List<Searchable> p){
        searchables.addAll(p);
    }

    public Set<Searchable> search(String j) throws BestResultNotFound{
        Comparator<Searchable> comparator = (s1, s2) -> {
            int lengthCompare = Integer.compare(s1.getName().length(), s2.getName().length());
            if (lengthCompare != 0) {
                return lengthCompare;
            } else {
                return s1.compareTo(s2); 
            }
        };
        Set<Searchable> output = new TreeSet<>(comparator);
       for (Searchable s : searchables) {
        if (s.getSearchTerm().contains(j)) {
            output.add(s);
        }
       }
       return output;
    }
    public void add(Searchable r){
        searchables.add(r);
    }

    @Override
    public String toString(){
        String output = "";
        for (Searchable s : searchables) {
            output += s.getName() + '\n';
        }
        return output;
    }
}
