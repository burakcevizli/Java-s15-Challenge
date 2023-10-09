package com.workintech.Library.Classes;

import com.workintech.Library.Enum.Categories;
import com.workintech.Library.Interfaces.StudentDoAble;

public class Student implements StudentDoAble {


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


    public Books givenBooksByName(String name){
        for(Books book : userList){
            if(book.getName().equals(name)){
                System.out.println("İade Edilen Kitap :" + book);
                return book;
            }
        }
        return null;
    }


    @Override
    public String toString() {
        return getClass().getSimpleName() + " List :" + userList;
    }
}
