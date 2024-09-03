package Projects;

import java.util.ArrayList;
import java.util.Scanner;

class Book {
    String id;
    String title;
    boolean isIssued;

    public Book(String id, String title) {
        this.id = id;
        this.title = title;
        this.isIssued = false;
    }
}

public class LibraryManagement {
    static ArrayList<Book> books = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("1. Add Book\n2. Issue Book\n3. Return Book\n4. View Books\n5. Exit");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline
            switch (choice) {
                case 1:
                    addBook();
                    break;
                case 2:
                    issueBook();
                    break;
                case 3:
                    returnBook();
                    break;
                case 4:
                    viewBooks();
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }

    static void addBook() {
        System.out.print("Enter Book ID: ");
        String id = scanner.nextLine();
        System.out.print("Enter Book Title: ");
        String title = scanner.nextLine();
        books.add(new Book(id, title));
        System.out.println("Book added successfully!");
    }

    static void issueBook() {
        System.out.print("Enter Book ID to Issue: ");
        String id = scanner.nextLine();
        for (Book book : books) {
            if (book.id.equals(id) && !book.isIssued) {
                book.isIssued = true;
                System.out.println("Book issued successfully!");
                return;
            }
        }
        System.out.println("Book not found or already issued!");
    }

    static void returnBook() {
        System.out.print("Enter Book ID to Return: ");
        String id = scanner.nextLine();
        for (Book book : books) {
            if (book.id.equals(id) && book.isIssued) {
                book.isIssued = false;
                System.out.println("Book returned successfully!");
                return;
            }
        }
        System.out.println("Book not found or wasn't issued!");
    }

    static void viewBooks() {
        System.out.println("Books in Library:");
        for (Book book : books) {
            System.out.println("ID: " + book.id + ", Title: " + book.title + ", Issued: " + book.isIssued);
        }
    }
}

