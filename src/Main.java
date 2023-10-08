import com.workintech.Library.Books;
import com.workintech.Library.Categories;
import com.workintech.Library.Librarian;
import com.workintech.Library.Users;

public class Main {
    public static void main(String[] args) {
        Books book1 = new Books(1,"Burak CEVİZLİ" ,"JAVA COK ZOR", Categories.HORROR);
        Books book2 = new Books(2,"Seyyit Battal ARVAS" ,"JAVA COK ZOR AMA HALLEDERZ", Categories.ADVENTURE);
        Books book3 = new Books(3,"Osman PAMUKOGLU" ,"YAŞAYANLAR DISINDA YAPACAK BIRSEY YOK", Categories.SCI_FICTION);
        Books book4 = new Books(4,"KİTAP4 YAZARI" ,"BAKICAZ", Categories.HORROR);
        Books book5 = new Books(5,"KİTAP5 YAZARI" ,"KİTAP 5", Categories.ADVENTURE);

        Librarian librarian = new Librarian();
        librarian.addBookLibrary(book1);
        librarian.addBookLibrary(book2);
        librarian.addBookLibrary(book3);
        librarian.addBookLibrary(book4);
        librarian.addBookLibrary(book5);

        System.out.println(librarian);


        Users burak = new Users();
        burak.addUserList(book3);
        System.out.println(burak);
    }
}