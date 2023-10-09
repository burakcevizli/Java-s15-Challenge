import com.workintech.Library.*;

public class Main {
    public static void main(String[] args) {
        Books book1 = new Books(1,"Burak CEVİZLİ" ,"JAVA COK ZOR", Categories.HORROR);
        Books book2 = new Books(2,"Seyyit Battal ARVAS" ,"JAVA COK ZOR AMA HALLEDERZ", Categories.ADVENTURE);
        Books book3 = new Books(3,"Osman PAMUKOGLU" ,"YAŞAYANLAR DISINDA YAPACAK BIRSEY YOK", Categories.SCI_FICTION);
        Books book4 = new Books(4,"KİTAP4 YAZARI" ,"BAKICAZ", Categories.HORROR);
        Books book5 = new Books(5,"KİTAP5 YAZARI" ,"KİTAP 5", Categories.ADVENTURE);
        Books book6 = new Books(6,"KİTAP5 YAZARI" ,"KİTAP 5", Categories.ADVENTURE);

        Library library = new AddBookLibraryMethod();
        library.addBookLibrary(book1);
        library.addBookLibrary(book2);
        library.addBookLibrary(book3);
        library.addBookLibrary(book4);
        library.addBookLibrary(book5);
        library.addBookLibrary(book6);
        library.listBooks();

        Student student1 = new Student();
        student1.addUserList(book3);
        System.out.println(student1);

    }
}