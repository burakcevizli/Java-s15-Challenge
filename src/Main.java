import com.workintech.Library.Books;
import com.workintech.Library.Categories;
import com.workintech.Library.Library;
import com.workintech.Library.Users;

import java.awt.print.Book;

public class Main {
    public static void main(String[] args) {
        Books book1 = new Books(1,"Burak CEVİZLİ" ,"JAVA COK ZOR", Categories.HORROR);
        Books book2 = new Books(2,"Seyyit Battal ARVAS" ,"JAVA COK ZOR AMA HALLEDERZ", Categories.ADVENTURE);
        Books book3 = new Books(3,"Osman PAMUKOGLU" ,"YAŞAYANLAR DISINDA YAPACAK BIRSEY YOK", Categories.SCI_FICTION);
        Books book4 = new Books(4,"KİTAP4 YAZARI" ,"BAKICAZ", Categories.HORROR);
        Books book5 = new Books(5,"KİTAP5 YAZARI" ,"KİTAP 5", Categories.ADVENTURE);

        Library library = new Library();
        library.addBookLibrary(book1);
        library.addBookLibrary(book2);
        library.addBookLibrary(book3);
        library.addBookLibrary(book4);
        library.addBookLibrary(book5);
        System.out.println(library);



        Users burak = new Users();
        burak.addUserList(book3);
        System.out.println(burak);

        System.out.println(library);

        burak.removeFromUserList(book3);
        System.out.println(library);
    }
}