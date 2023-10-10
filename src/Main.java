import com.workintech.Library.Classes.Books;
import com.workintech.Library.Classes.Library;
import com.workintech.Library.Classes.Student;
import com.workintech.Library.Enum.Categories;
import com.workintech.Library.Interfaces.Actionable;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Books book1 = new Books(1, "Burak CEVİZLİ", "JAVA", Categories.HORROR);
        Books book2 = new Books(2, "Ahmet Süleyman", "JAVA2", Categories.ADVENTURE);
        Books book3 = new Books(3, "Osman PAMUKOGLU", "JAVA3", Categories.SPORTS);
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

        Scanner scanner = new Scanner(System.in);

        System.out.println("********************** KUTUPHANEMIZE HOS GELDINIZ **********************");
        System.out.println("************************************");
        anaMenu:
        while (true) {
            System.out.println("OGRENCIYSENIZ S ' YE , KUTUPHANECI ISENIZ L ' YE BASINIZ ,ÇIKMAK ICIN E ' A BASINIZ. ");
            String secenek = scanner.nextLine().toLowerCase();

            if (secenek.equals("s")) {
                System.out.print("Ogrenci şifresi girin: ");
                String sifre = scanner.next();

                if (sifre.equals("ogrenci123")) {
                    System.out.println("Ogrenci olarak giriş yaptınız.");

                    while (true) {
                        System.out.println("Menü:");
                        System.out.println("1. Kitap Al");
                        System.out.println("2. Kitap İade Et");
                        System.out.println("3. Kategoriye Göre Kitap Listele");
                        System.out.println("4. Tüm Kitapları Listele");
                        System.out.println("5. Kiraladığınız Kitapları Görüntüle");
                        System.out.println("6. Yazar İsmine Göre Kitap Ara");
                        System.out.println("7. Yeni Kitap Ekle");
                        System.out.println("9. Ana Menüye Dön");
                        System.out.println("0. Çıkış");

                        System.out.print("Seçenek: ");
                        String ogrenciSecenek = scanner.next();

                        switch (ogrenciSecenek) {
                            case "0":
                                System.out.println("Çıkış yapılıyor...");
                                System.exit(0);
                                break;
                            case "1":
                                System.out.println("Lütfen almak istediğiniz kitabın ismini giriniz : ");
                                String bookName = scanner.next().toUpperCase();
                                student.addUserList(library.getBooksByName(bookName));
                                System.out.println("Faturanız " + (Actionable.userList.size() + 1) * 5 + " tl dir .");
                                if (Actionable.userList.size() < 5) {
                                    System.out.println("Kitabınız eklenmiştir : " + bookName);
                                }
                                System.out.println("Kitaplarınız : " + student);
                                break;
                            case "2":
                                System.out.println("Kitap iadesi yapmak istediğiniz kitabı yazınız : ");
                                String givenBookName = scanner.next().toUpperCase();
                                System.out.println("Kitabınız iade edilmiştir : " + student.givenBooksByName(givenBookName));
                                if (Actionable.userList.isEmpty()) {
                                    System.out.println("İade edilecek kitap bulunmamaktadır.");
                                } else {
                                    student.removeFromUserList(student.givenBooksByName(givenBookName));
                                    System.out.println("Faturanız iade edilmiştir. Tutar : 5 tl dir .");
                                }
                                System.out.println("Kitaplarınız : " + student);
                                break;
                            case "3":
                                System.out.println("Hangi Kategoriyi görmek istiyorsunuz : ");
                                System.out.println("Adventure için 1 ' i , Sci-Fic ' için 2 'i , Horror için 3'ü seçiniz.");
                                String kategori = scanner.next();
                                switch (kategori) {
                                    case "1" -> library.listByCategories(Categories.ADVENTURE);
                                    case "2" -> library.listByCategories(Categories.SPORTS);
                                    case "3" -> library.listByCategories(Categories.HORROR);
                                    default -> System.out.println("Olmayan bir kategori seçtiniz.");
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
                                String writerName = scanner.next();
                                System.out.println(library.getBooksByAuthorName(writerName));
                                break;
                            case "7":
                                System.out.println("Enter book ID: ");
                                int bookID = scanner.nextInt();
                                if (Actionable.allBooks2.containsKey(bookID)) {
                                    System.out.println("Aynı id ye ekleme yapamazsınız...");
                                } else {
                                    System.out.println("Enter book author: ");
                                    String bookAuthor = scanner.next();
                                    System.out.println("Enter book name: ");
                                    String bookNameForAdding = scanner.next().toUpperCase();
                                    System.out.println("Enter book category: ");
                                    Categories bookCategory = Categories.valueOf(scanner.next().toUpperCase());
                                    Books addedBook = new Books(bookID, bookAuthor, bookNameForAdding, bookCategory);
                                    library.addBookLibrary(addedBook);
                                    System.out.println("Your book added library: " + addedBook);
                                    System.out.println("Updated Book List: " + library);
                                }
                                break;
                            case "9":
                                System.out.println("Ana menüye dönülüyor...");
                                continue anaMenu;
                            default:
                                System.out.println("Geçersiz seçenek. Tekrar deneyin.");
                        }
                    }
                } else {
                    System.out.println("Hatalı şifre. Giriş reddedildi.");
                }
            } else if (secenek.equals("l")) {
                System.out.print("Kutuphaneci şifrenizi girin: ");
                String sifre = scanner.next();
                if (sifre.equals("kutuphane123")) {
                    System.out.println("Kutuphaneci olarak giriş yaptınız.");

                    while (true) {
                        System.out.println("Menü:");
                        System.out.println("1. Bir Kitap Ekle");
                        System.out.println("2. Bir Kitap Sil");
                        System.out.println("9. Ana Menüye Dön");
                        System.out.println("0. Çıkış");

                        System.out.print("Seçenek: ");
                        String kutuphaneciSecenek = scanner.next();

                        switch (kutuphaneciSecenek) {
                            case "1":
                                System.out.println("Enter book ID: ");
                                int bookID = scanner.nextInt();
                                if (Actionable.allBooks2.containsKey(bookID)) {
                                    System.out.println("Aynı id ye ekleme yapamazsınız...");
                                } else {
                                    System.out.println("Enter book author: ");
                                    String bookAuthor = scanner.next();
                                    System.out.println("Enter book name: ");
                                    String bookNameForAdding = scanner.next().toUpperCase();
                                    System.out.println("Enter book category: ");
                                    Categories bookCategory = Categories.valueOf(scanner.next().toUpperCase());
                                    Books addedBook = new Books(bookID, bookAuthor, bookNameForAdding, bookCategory);
                                    library.addBookLibrary(addedBook);
                                    System.out.println("Your book added library: " + addedBook);
                                    System.out.println("Updated Book List: " + library);
                                }
                                break;

                            case "2":
                                System.out.println("Please enter book name for deleting: ");
                                String deletedBook = scanner.next().toLowerCase();
                                for (Books book : Actionable.allBooks2.values()) {
                                    if (deletedBook.equals(book.getName().toLowerCase())) {
                                        System.out.println(book.getName() + "=> This book deleted in library list.");
                                        library.removeBookFromLibrary(book);
                                        System.out.println("Updated Book List: " + library);
                                        break;
                                    } else {
                                        System.out.println("Yanlıs kitap ismi girdiniz.");
                                        System.out.println("Kutuphane : " + library);
                                    }
                                }
                                break;

                            case "3":
                                Scanner scanner2 = new Scanner(System.in);
                                System.out.println("Düzenlenecek kitabı seçiniz :");
                                String duzenlenecekBookName = scanner2.nextLine().toUpperCase();
                                Books duzenlenecekKitap = library.getBooksByName(duzenlenecekBookName);
                                System.out.println("Düzenlenecek kitabın yazar ismini giriniz :");
                                String yeniYazarName = scanner2.nextLine();
                                duzenlenecekKitap.setYazar(yeniYazarName);
                                System.out.println("Düzenlenecek kitabın ismini giriniz :");
                                String yeniKitapName = scanner2.nextLine().toUpperCase();
                                duzenlenecekKitap.setName(yeniKitapName);
                                System.out.println("Duzenlenecek kategoriyi yazınız.");
                                Categories yeniKitapKategori = Categories.valueOf(scanner2.nextLine().toUpperCase());
                                duzenlenecekKitap.setKategori(yeniKitapKategori);
                                System.out.println("KITAP DUZENLENMISTIR " + duzenlenecekKitap);
                            case "9":
                                System.out.println("Ana menüye dönülüyor...");
                                continue anaMenu;
                            case "0":
                                System.out.println("Çıkış yapılıyor...");
                                System.exit(0);
                                break;

                            default:
                                System.out.println("Gecersiz bir seçenek işaretlediniz.");
                        }
                    }
                }
            } else if (secenek.equals("e")) {
                System.out.println("Çıkış yapılıyor.");
                System.exit(-1);
            }
        }
    }
}
