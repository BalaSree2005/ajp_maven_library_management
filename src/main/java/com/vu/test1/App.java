package com.vu.test1;

import com.vu.test1.controller.LibraryController;
import com.vu.test1.view.LibraryView;

public class App {
    public static void main(String[] args) {
        LibraryView view = new LibraryView();
        LibraryController controller = new LibraryController(view);
        controller.run();
    }
}
