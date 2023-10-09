package com.workintech.Library;

public class AddBookLibraryMethod extends Library implements Actionable{

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


}
