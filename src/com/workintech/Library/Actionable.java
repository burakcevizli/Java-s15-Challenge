package com.workintech.Library;


import java.util.LinkedList;
import java.util.List;

public interface Actionable {
      void addBookLibrary(Books book);
      void removeBookFromLibrary(Books book);
      void addUserList(Books book);
      void removeFromUserList(Books book);

    List<Books> scienceFictionCategory = new LinkedList<>();
    List<Books> horrorCategory = new LinkedList<>();
    List<Books> advenventureCategory = new LinkedList<>();
    List<Books> allBooks = new LinkedList<>();
    List<Books> userList = new LinkedList<>();
}
