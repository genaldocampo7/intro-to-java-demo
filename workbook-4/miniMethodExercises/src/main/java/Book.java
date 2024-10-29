import java.time.LocalDate;
import java.util.Date;

public class Book {
    private String title;
    private String author;
    private double price;
    private String isbn;


    public Book(String title, String author, double price, String isbn) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.isbn = isbn;
    }

    public void bookDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + price);
        System.out.println("ISBN: " + isbn);
    }

    public void applyDiscount(double percentage) {
        this.price = this.price * (1 - percentage/100);
        System.out.println("Discount applied! New price: " + this.price);
    }

    public void applyDiscount(double percentage, LocalDate startDate, LocalDate endDate) {
    if(LocalDate.now().isBefore(endDate) && LocalDate.now().isAfter(startDate)) {
        applyDiscount(percentage);
    }
    System.out.println("Discount not valid!");
    }
}



