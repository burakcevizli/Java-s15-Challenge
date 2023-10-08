package com.workintech.Library;


import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public interface Actionable {
      void addBookLibrary(Books book);
      void removeBookFromLibrary(Books book);
      void addUserList(Books book);
      void removeFromUserList(Books book);

    List<Books> scienceFictionCategory = new LinkedList<>();
    List<Books> horrorCategory = new LinkedList<>();
    List<Books> advenventureCategory = new LinkedList<>();
    Map<Integer,Books> allBooks2 = new HashMap<>();
    List<Books> userList = new LinkedList<>();
}
