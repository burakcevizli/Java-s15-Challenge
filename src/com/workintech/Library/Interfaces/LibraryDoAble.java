package com.workintech.Library.Interfaces;

import com.workintech.Library.Classes.Books;

public interface LibraryDoAble extends Actionable{

    void addBookLibrary(Books book);


    void removeBookFromLibrary(Books book);
}
