package org.skypro.skyshop.product;

public interface Searchable {
    String getSearchTerm();
    String getName();
    String getType();
    default String getStringRepresentation(){
        return getType() +'\n' + getSearchTerm();
    }
}
