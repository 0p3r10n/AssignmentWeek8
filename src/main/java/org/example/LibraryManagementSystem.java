package org.example;

import java.util.Scanner;

// Define the base class Book
class Book {
    String authorName;
    String title;
    double price;
    int pages;
    int stock;

    Book(String authorName, String title, double price, int pages, int stock) {
        this.authorName = authorName;
        this.title = title;
        this.price = price;
        this.pages = pages;
        this.stock = stock;
    }

    void display() {
        System.out.println("Author: " + authorName);
        System.out.println("Title: " + title);
        System.out.println("Price: $" + price);
        System.out.println("Pages: " + pages);
        System.out.println("Stock: " + stock);
    }
}

// Define the SoftwareBook class, a subclass of Book
class SoftwareBook extends Book {
    String softwareVersion;
    String softwareName;

    SoftwareBook(String authorName, String title, double price, int pages, int stock, String softwareVersion, String softwareName) {
        super(authorName, title, price, pages, stock);
        this.softwareVersion = softwareVersion;
        this.softwareName = softwareName;
    }

    // Override the display method to include software-specific details
    @Override
    void display() {
        super.display();
        System.out.println("Software Version: " + softwareVersion);
        System.out.println("Software Name: " + softwareName);
    }
}

// Define the HardwareBook class, a subclass of Book
class HardwareBook extends Book {
    String hardwareCategory;
    String publisher;

    HardwareBook(String authorName, String title, double price, int pages, int stock, String hardwareCategory, String publisher) {
        super(authorName, title, price, pages, stock);
        this.hardwareCategory = hardwareCategory;
        this.publisher = publisher;
    }

    // Override the display method to include hardware-specific details
    @Override
    void display() {
        super.display();
        System.out.println("Hardware Category: " + hardwareCategory);
        System.out.println("Publisher: " + publisher);
    }
}

public class LibraryManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Library Management System");

        while (true) {
            System.out.println("\nSelect book category:");
            System.out.println("1. Software Book");
            System.out.println("2. Hardware Book");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            if (choice == 3) {
                System.out.println("Thank you for using Library Management System. Goodbye!");
                break;
            }

            System.out.print("Enter author name: ");
            String authorName = scanner.next();
            System.out.print("Enter title: ");
            String title = scanner.next();
            System.out.print("Enter price: $");
            double price = scanner.nextDouble();
            System.out.print("Enter number of pages: ");
            int pages = scanner.nextInt();
            System.out.print("Enter stock quantity: ");
            int stock = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter software version: ");
                    String softwareVersion = scanner.next();
                    System.out.print("Enter software name: ");
                    String softwareName = scanner.next();
                    SoftwareBook softwareBook = new SoftwareBook(authorName, title, price, pages, stock, softwareVersion, softwareName);
                    softwareBook.display();
                    break;
                case 2:
                    System.out.print("Enter hardware category: ");
                    String hardwareCategory = scanner.next();
                    System.out.print("Enter publisher: ");
                    String publisher = scanner.next();
                    HardwareBook hardwareBook = new HardwareBook(authorName, title, price, pages, stock, hardwareCategory, publisher);
                    hardwareBook.display();
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
