package org.skypro.skyshop.product;

import java.util.Objects;

public class Article implements Searchable{
    private final String nameOfArticle;
    private final String textOfArticle;

    public Article(String n,String t){
        nameOfArticle = n;
        textOfArticle = t;
    }
    public String toString(){
        return getType() +" "+ nameOfArticle + " - " + textOfArticle;
    }

     @Override
     public String getSearchTerm() {
         return toString();
     }

     @Override
     public String getType() {
         return "ARTICLE";
     }

     @Override
     public String getStringRepresentation() {
         return Searchable.super.getStringRepresentation();
     }
    @Override
    public String getName() {
        return nameOfArticle;
    }

    @Override
    public int hashCode(){
        return Objects.hashCode(nameOfArticle);
    }
    @Override
    public boolean equals(Object obj){
        if(this == obj) return true;
        if(obj instanceof Product){
            Product other = (Product) obj;
            return nameOfArticle.hashCode() == other.hashCode() && nameOfArticle.equals(other.getName());
        }else{
            return false;
        }
    }
 }
