import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.UUID;

class Book {
    private String id, title, author, category;

    public Book(String title, String author, String category) {
        this.id = UUID.randomUUID().toString();
        this.title = title;
        this.author = author;
        this.category = category;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "===\nID: " + id + "\nTitle: " + title + "\nAuthor: " + author + "\nCategory: " + category + "\n===";
    }
}

public class BookManager {
    private static List<Book> books = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean menu = true;
        while (menu) {
            System.out.println("Welcome to book management app\nPlease choose your menu:");
            System.out.println("1. Create a new book");
            System.out.println("2. Get all books");
            System.out.println("3. Get book by ID");
            System.out.println("4. Update book");
            System.out.println("5. Delete book");
            System.out.println("6. Exit");
            System.out.print("Enter your choice (1-6): ");

            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    createBook();
                    break;
                case 2:
                    getAllBooks();
                    break;
                case 3:
                    getBookById();
                    break;
                case 4:
                    updateBook();
                    break;
                case 5:
                    deleteBook();
                    break;
                case 6:
                    System.out.println("Bye...");
                    menu = false;
                    break;
                default:
                    System.out.println("Invalid option. Please try again!");
                    break;
            }
        }
    }

    private static void createBook() {
        System.out.print("Enter title: ");
        String title = scanner.nextLine();
        System.out.print("Enter author: ");
        String author = scanner.nextLine();
        System.out.print("Enter category: ");
        String category = scanner.nextLine();
        Book newBook = new Book(title, author, category);
        books.add(newBook);
        System.out.println("Book created with ID: " + newBook.getId());
        System.out.println("\nInformasi buku yang telah diinput:");
    for (Book book : books) {
      System.out.println(book); // Memanggil method toString() dari kelas Book
    }
    }

    private static void getAllBooks() {
        for (Book book : books) {
            System.out.println(book);
        }
    }

    private static void getBookById() {
        System.out.print("Enter book ID: ");
        String id = scanner.nextLine();
        for (Book book : books) {
            if (book.getId().equals(id)) {
                System.out.println(book);
                return;
            }
        }
        System.out.println("Book not found.");
    }

    private static void updateBook() {
        System.out.print("Enter book ID: ");
        String id = scanner.nextLine();
        for (Book book : books) {
            if (book.getId().equals(id)) {
                System.out.print("Enter title: ");
                book.setTitle(scanner.nextLine());
                System.out.print("Enter author: ");
                book.setAuthor(scanner.nextLine());
                System.out.print("Enter category: ");
                book.setCategory(scanner.nextLine());
                System.out.print("\nBook updated!\n");
                System.out.println(book);
                return;
            }
        }
        System.out.println("Book not found.");
    }

    private static void deleteBook() {
        System.out.print("Enter book ID: ");
        String id = scanner.nextLine();
        books.removeIf(book -> book.getId().equals(id));
        System.out.println("Book deleted!");
    }
}

