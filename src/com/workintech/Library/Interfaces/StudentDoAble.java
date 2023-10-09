package com.workintech.Library.Interfaces;

import com.workintech.Library.Classes.Books;

public interface StudentDoAble extends Actionable{

    void addUserList(Books book);


    void removeFromUserList(Books book);
}
