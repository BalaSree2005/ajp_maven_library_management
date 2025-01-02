package com.vu.test1.controller;

import com.vu.test1.model.Book;
import com.vu.test1.view.LibraryView;

import java.util.ArrayList;
import java.util.List;

public class LibraryController {
    private final List<Book> library = new ArrayList<>();
    private final LibraryView view;

    public LibraryController(LibraryView view) {
        this.view = view;
    }

    public void run() {
        boolean running = true;

        while (running) {
            int choice = view.showMenu();
            switch (choice) {
                case 1 -> {
                    Book book = view.getBookDetails();
                    library.add(book);
                    view.displayMessage("Book added successfully.");
                }
                case 2 -> view.displayBooks(library);
                case 3 -> {
                    String isbn = view.getIsbnToRemove();
                    boolean removed = library.removeIf(book -> book.getIsbn().equals(isbn));
                    if (removed) {
                        view.displayMessage("Book removed successfully.");
                    } else {
                        view.displayMessage("Book with ISBN " + isbn + " not found.");
                    }
                }
                case 4 -> {
                    running = false;
                    view.displayMessage("Exiting Library Management System..!");
                }
                default -> view.displayMessage("Invalid choice. Please try again.");
            }
        }
    }
}
