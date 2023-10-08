package com.workintech.Library;

public class Library implements Actionable {


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
    }

    @Override
    public void addUserList(Books book) {
        if (userList.size() > 4) {
            System.out.println("Daha fazla kitap alamazsınız.");
        } else {
            allBooks2.remove(book.getID(), book);
            userList.add(book);
            if (book.getKategori().equals(Categories.ADVENTURE)) {
                advenventureCategory.remove(book);
            } else if (book.getKategori().equals(Categories.HORROR)) {
                horrorCategory.remove(book);
            } else {
                scienceFictionCategory.remove(book);
            }
        }
    }

    @Override
    public void removeFromUserList(Books book) {
        allBooks2.put(book.getID(), book);
        userList.remove(book);

        if (book.getKategori().equals(Categories.ADVENTURE)) {
            advenventureCategory.add(book);
        } else if (book.getKategori().equals(Categories.HORROR)) {
            horrorCategory.add(book);
        } else {
            scienceFictionCategory.add(book);
        }
    }

    @Override
    public String toString() {
        return "All Books : " + allBooks2;
    }
}
