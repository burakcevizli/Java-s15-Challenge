package com.workintech.Library;

public class RemoveBookFromLibraryMethod extends Library {

    public void removeBookFromLibrary(Books book) {
        allBooks2.remove(book.getID(), book);
        if (book.getKategori().equals(Categories.ADVENTURE)) {
            advenventureCategory.remove(book);
        } else if (book.getKategori().equals(Categories.HORROR)) {
            horrorCategory.remove(book);
        } else {
            scienceFictionCategory.remove(book);
        }
    }
}
