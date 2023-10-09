import com.workintech.Library.*;

import java.util.Iterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Books book1 = new Books(1, "Burak CEVİZLİ", "JAVA", Categories.HORROR);
        Books book2 = new Books(2, "Ahmet Süleyman", "JAVA2", Categories.ADVENTURE);
        Books book3 = new Books(3, "Osman PAMUKOGLU", "JAVA3", Categories.SCI_FICTION);
        Books book4 = new Books(4, "KİTAP4 YAZARI", "BAKICAZ", Categories.HORROR);
        Books book5 = new Books(5, "KİTAP4 YAZARI", "KITAP5", Categories.ADVENTURE);
        Books book6 = new Books(6, "KİTAP4 YAZARI", "KITAP6", Categories.ADVENTURE);

        Library library = new Library();
        library.addBookLibrary(book1);
        library.addBookLibrary(book2);
        library.addBookLibrary(book3);
        library.addBookLibrary(book4);
        library.addBookLibrary(book5);
        library.addBookLibrary(book6);
        Student student = new Student();


        //Scanner Kısmı


        while (true) {
            System.out.println("OGRENCIMIZ HOS GELDINIZ ....");

            Scanner scanner = new Scanner(System.in);

            System.out.println("KUTUPHANEMIZDEN KITAP ALMAK ICIN LUTFEN 1`i , \n" +
                    "KUTUPHANEMIZE KITABI GERI VERMEK ICINSE 2'i SEÇİNİZ , \n" +
                    "KATEGORILERI GORMEK ICINSE 3' ü SECINIZ , \n" +
                    "KUTUPHANEMIZDE KI TUM KITAPLARI GORMEK ICIN 4 ' E BASINIZ , \n" +
                    "ODUNC ALDIGINIZ KITAPLARI GORMEK ICIN 5' E BASINIZ,\n" +
                    "YAZARIN KITAPLARINI GORMEK ICIN 6' A BASINIZ.");
            System.out.println("ÇIKMAK ICIN LUTFEN 0 ' A BASINIZ.");

            String secenek = scanner.nextLine();

            switch (secenek) {

                case "0":
                    System.exit(-1);

                case "1":
                    System.out.println("Lütfen almak istediğiniz kitabın ismini giriniz : ");
                    String bookName = scanner.nextLine();
                    System.out.println("Faturanız 5 tl dir .");
                    if (Actionable.userList.size() < 5) {
                        System.out.println("Kitabınız eklenmiştir : " + bookName);
                    }
                    student.addUserList(library.getBooksByName(bookName));
                    System.out.println("Kitaplarınız : " + student);
                    break;
                case "2":
                    System.out.println("Kitap iadesi yapmak istediğiniz kitabı yazınız : ");
                    String givenBookName = scanner.nextLine();
                    System.out.println("Kitabınız iade edilmiştir : " + student.givenBooksByName(givenBookName));
                    System.out.println("Faturanız iade edilmiştir. Tutar 5 tl dir.");
                    student.removeFromUserList(student.givenBooksByName(givenBookName));
                    System.out.println("Kitaplarınız : " + student);
                    break;

                case "3":
                    System.out.println("Hangi Kategoriyi görmek istiyorsunuz : ");
                    System.out.println("Adventure için 1 ' i , Sci-Fic ' için 2 'i , Horror için 3'ü seçiniz.");
                    String kategori = scanner.nextLine();
                    switch (kategori) {
                        case "1" -> library.listByCategories(Categories.ADVENTURE);
                        case "2" -> library.listByCategories(Categories.SCI_FICTION);
                        case "3" -> library.listByCategories(Categories.HORROR);
                    }
                    break;

                case "4":
                    library.listBooks();
                    break;

                case "5":
                    if (Actionable.userList.isEmpty()) {
                        System.out.println("Henüz kitap kiralamadınız.");
                    } else {
                        System.out.println(student);
                    }
                    break;

                case "6":
                    System.out.println("Lütfen yazarın isimini giriniz :");

                    String writerName = scanner.nextLine();

                    System.out.println(library.getBooksByAuthorName(writerName));

            }


        }


    }
}