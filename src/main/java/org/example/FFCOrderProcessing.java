package org.example;

import java.util.Scanner;

class Furniture {
    double price;
    int width;
    int height;

    Furniture(double price, int width, int height) {
        this.price = price;
        this.width = width;
        this.height = height;
    }

    void display() {
        System.out.println("Price: $" + price);
        System.out.println("Width: " + width + " inches");
        System.out.println("Height: " + height + " inches");
    }
}

class Chair extends Furniture {
    String chairType;

    Chair(double price, int width, int height, String chairType) {
        super(price, width, height);
        this.chairType = chairType;
    }

    void display() {
        super.display();
        System.out.println("Chair Type: " + chairType);
    }
}

class Bookshelf extends Furniture {
    String shelfType;

    Bookshelf(double price, int width, int height, String shelfType) {
        super(price, width, height);
        this.shelfType = shelfType;
    }

    void display() {
        super.display();
        System.out.println("Shelf Type: " + shelfType);
    }
}

public class FFCOrderProcessing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to FFC Order Processing System");

        while (true) {
            System.out.println("\nSelect furniture item:");
            System.out.println("1. Chair");
            System.out.println("2. Bookshelf");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            if (choice == 3) {
                System.out.println("Thank you for using FFC Order Processing System. Goodbye!");
                break;
            }

            System.out.print("Enter price: $");
            double price = scanner.nextDouble();
            System.out.print("Enter width (in inches): ");
            int width = scanner.nextInt();
            System.out.print("Enter height (in inches): ");
            int height = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter chair type: ");
                    String chairType = scanner.next();
                    Chair chair = new Chair(price, width, height, chairType);
                    chair.display();
                    break;
                case 2:
                    System.out.print("Enter shelf type: ");
                    String shelfType = scanner.next();
                    Bookshelf bookshelf = new Bookshelf(price, width, height, shelfType);
                    bookshelf.display();
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
