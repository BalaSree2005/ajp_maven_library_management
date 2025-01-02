package com.vu.test1.view;

import com.vu.test1.model.Book;

import java.util.List;
import java.util.Scanner;

public class LibraryView {
    private final Scanner scanner = new Scanner(System.in);

    public int showMenu() {
        System.out.println("\nLibrary Management System:");
        System.out.println("1. Add a Book");
        System.out.println("2. View All Books");
        System.out.println("3. Remove a Book by ISBN");
        System.out.println("4. Exit");
        System.out.print("Choose an option: ");
        return scanner.nextInt();
    }

    public Book getBookDetails() {
        scanner.nextLine(); // Consume newline
        System.out.print("Enter Book Title: ");
        String title = scanner.nextLine();
        System.out.print("Enter Book Author: ");
        String author = scanner.nextLine();
        System.out.print("Enter Book ISBN: ");
        String isbn = scanner.nextLine();
        return new Book(title, author, isbn);
    }

    public String getIsbnToRemove() {
        scanner.nextLine(); // Consume newline
        System.out.print("Enter ISBN of the book to remove: ");
        return scanner.nextLine();
    }

    public void displayBooks(List<Book> books) {
        if (books.isEmpty()) {
            System.out.println("No books available in the library.");
        } else {
            System.out.println("Books in Library:");
            for (Book book : books) {
                System.out.println(book);
            }
        }
    }

    public void displayMessage(String message) {
        System.out.println(message);
    }
}
