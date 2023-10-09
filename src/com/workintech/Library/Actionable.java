package com.workintech.Library;


import java.util.*;

public interface Actionable {

    List<Books> scienceFictionCategory = new LinkedList<>();
    List<Books> horrorCategory = new LinkedList<>();
    List<Books> advenventureCategory = new LinkedList<>();
    Map<Integer, Books> allBooks2 = new TreeMap<>();
    List<Books> userList = new LinkedList<>();
    Set<Books> authorBooks = new TreeSet<>();
}
