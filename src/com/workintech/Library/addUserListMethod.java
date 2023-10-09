package com.workintech.Library;

public class addUserListMethod extends Library{
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
}

