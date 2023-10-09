package com.workintech.Library;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Library implements LibraryDoAble {


    public void addBookLibrary(Books book) {
        allBooks2.put(book.getID(), book);
        if (book.getKategori().equals(Categories.ADVENTURE)) {
            advenventureCategory.add(book);
        } else if (book.getKategori().equals(Categories.HORROR)) {
            horrorCategory.add(book);
        } else {
            scienceFictionCategory.add(book);
        }
    }

    public void removeBookFromLibrary(Books book) {
        allBooks2.remove(book.getID(), book);
        if (book.getKategori().equals(Categories.ADVENTURE)) {
            advenventureCategory.remove(book);
        } else if (book.getKategori().equals(Categories.HORROR)) {
            horrorCategory.remove(book);
        } else {
            scienceFictionCategory.remove(book);
        }
        System.out.println(book + "silinmiştir.");
    }




    public void listBooks() {
        List<Books> sortedList = new LinkedList<>(allBooks2.values());
        sortedList.sort(Comparator.comparing(Books::getName));
        for (Books book : sortedList) {
            System.out.println("**********************");
            System.out.println("Kitap ID : " + book.getID());
            System.out.println("Kitap Name : " + book.getName());
            System.out.println("Kitap Yazar : " + book.getYazar());
            System.out.println("Kitap Kategorisi : " + book.getKategori());
            System.out.println("**********************");
        }
    }

    public Books getBooksByName(String name){
        for(Books book : allBooks2.values()){
            if(book.getName().equals(name)){
                System.out.println("İstediğiniz kitap :" + book);
                return book;
            }
        }
        return null;
    }

    public Set<Books> getBooksByAuthorName(String name){
        for(Books book : allBooks2.values()){
            if(book.getYazar().equalsIgnoreCase(name)){
                authorBooks.add(book);
            }
        }
        return authorBooks;
    }

    public void listByCategories(Categories categories){
        if(categories.equals(Categories.ADVENTURE)){
            System.out.println( "Adventure Categories : " + advenventureCategory);
        }else if(categories.equals(Categories.HORROR)){
            System.out.println("Horror Categories : " + horrorCategory );
        }else if(categories.equals(Categories.SCI_FICTION)){
            System.out.println("Sci-Fic Categories : " + scienceFictionCategory);
        }
    }

    @Override
    public String toString() {
        return "All Books : " + allBooks2;
    }
}
