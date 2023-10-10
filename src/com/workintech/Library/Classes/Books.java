package com.workintech.Library.Classes;

import com.workintech.Library.Enum.Categories;
import com.workintech.Library.Interfaces.Actionable;

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


    public void setBook(Books book){
        if (this.getKategori().equals(Categories.ADVENTURE)) {
            Actionable.advenventureCategory.remove(book);
        } else if (this.getKategori().equals(Categories.HORROR)) {
            Actionable.horrorCategory.remove(book);
        } else {
            Actionable.scienceFictionCategory.remove(book);
        }
        this.setName(book.getName());
        this.setYazar(book.getYazar());
        this.setKategori(book.getKategori());
        if (book.getKategori().equals(Categories.ADVENTURE)) {
           Actionable.advenventureCategory.add(book);
        } else if (book.getKategori().equals(Categories.HORROR)) {
           Actionable.horrorCategory.add(book);
        } else {
           Actionable.scienceFictionCategory.add(book);
        }

    }
    public void setYazar(String yazar) {
        Yazar = yazar;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setKategori(Categories kategori) {
        this.kategori = kategori;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Books books = (Books) o;
        return ID == books.ID;
    }

    @Override
    public int hashCode() {
        return Objects.hash(kategori);
    }

    @Override
    public int compareTo(Books o) {
        return this.getName().compareTo(o.getName());
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
}
