public class Main {
    public static void main(String[] args) {

        Book book = new Book("The Lord of the Rings: The Fellowship of the Ring", "J.R. Tolkien", 22.0, "978-0547928210");
        book.bookDetails();
        book.applyDiscount(30);
       



        Dog dog = new Dog("Pochita", "bulldog", "wuf");
        dog.bark();
        dog.walk("Denji");


    }
}
