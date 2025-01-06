package org.skypro.skyshop.product;

public interface Searchable {
    String getSearchTerm();

    String getType();
    default String getStringRepresentation(){
        return getType() +'\n' + getSearchTerm();
    }

    default int getPrice(){
        return 0;
    }

}
