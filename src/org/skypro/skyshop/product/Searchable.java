package org.skypro.skyshop.product;

public interface Searchable {
    public String getSearchTerm();

    public String getType();
    default public String getStringRepresentation(){
        return getType() +'\n' + getSearchTerm();
    }
}
