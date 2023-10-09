package com.workintech.Library;


import java.util.*;

public interface Actionable {
    void addBookLibrary(Books book);

    void removeBookFromLibrary(Books book);

    void addUserList(Books book);

    void removeFromUserList(Books book);

    List<Books> scienceFictionCategory = new LinkedList<>();
    List<Books> horrorCategory = new LinkedList<>();
    List<Books> advenventureCategory = new LinkedList<>();
    Map<Integer, Books> allBooks2 = new TreeMap<>();
    List<Books> userList = new LinkedList<>();


}
