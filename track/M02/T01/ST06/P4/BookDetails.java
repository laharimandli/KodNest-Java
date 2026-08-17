
import java.util.Scanner;

public class BookDetails {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String title = sc.nextLine();
        String author = sc.nextLine();

        Book book = new Book(title, author);

        book.display();
    }
}

class Book {

    String title;
    String author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}
