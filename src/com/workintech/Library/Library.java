package com.workintech.Library;

public class Library implements Actionable{

    public void removeBookFromLibrary(Books book) {

        allBooks.remove(book);
        if(book.getKategori().equals(Categories.ADVENTURE)){
            advenventureCategory.remove(book);
        }else if(book.getKategori().equals(Categories.HORROR)){
            horrorCategory.remove(book);
        }else{
            scienceFictionCategory.remove(book);
        }
    }



    public void addBookLibrary(Books book) {
        allBooks.add(book);
        if(book.getKategori().equals(Categories.ADVENTURE)){
            advenventureCategory.add(book);
        }else if(book.getKategori().equals(Categories.HORROR)){
            horrorCategory.add(book);
        }else{
            scienceFictionCategory.add(book);
        }
    }

    @Override
    public void addUserList(Books book) {
        allBooks.remove(book);
        userList.add(book);
        if(book.getKategori().equals(Categories.ADVENTURE)){
            advenventureCategory.remove(book);
        }else if(book.getKategori().equals(Categories.HORROR)){
            horrorCategory.remove(book);
        }else{
            scienceFictionCategory.remove(book);
        }
    }

    @Override
    public void removeFromUserList(Books book) {
        allBooks.add(book);
        userList.remove(book);

        if(book.getKategori().equals(Categories.ADVENTURE)){
            advenventureCategory.add(book);
        }else if(book.getKategori().equals(Categories.HORROR)){
            horrorCategory.add(book);
        }else{
            scienceFictionCategory.add(book);
        }
    }

    @Override
    public String toString() {
        return "All Books : " + allBooks;
    }
}
