package com.workintech.Library;

import java.util.Comparator;
import java.util.Objects;

public class Books implements Comparable<Books> {
    private int ID;
    private String Yazar;
    private String Name;
    private Categories kategori;

    public Books(int ID, String yazar, String name, Categories kategori) {
        this.ID = ID;
        Yazar = yazar;
        Name = name;
        this.kategori = kategori;
    }

    public int getID() {
        return ID;
    }

    public String getYazar() {
        return Yazar;
    }

    public String getName() {
        return Name;
    }

    public Categories getKategori() {
        return kategori;
    }

    @Override
    public String toString() {
        return "Books{" +
                "ID=" + ID +
                ", Yazar='" + Yazar + '\'' +
                ", Name='" + Name + '\'' +
                ", kategori=" + kategori +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Books books = (Books) o;
        return ID == books.ID && Objects.equals(Name, books.Name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(kategori);
    }

    @Override
    public int compareTo(Books o) {
        return this.getName().compareTo(o.getName());
    }
}
