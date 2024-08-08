package bookstoreinventory;

import java.util.Arrays;
import java.util.Scanner;

public class BookstoreInventory {
    public static void main(String[] args) {
        // Phase 1: Create an array with five book titles
        String[] books = {"Harry Potter", "The Great Gatsby", "To Kill a Mockingbird", "Pride and Prejudice", "Othello"};

        // Phase 2: Using the insertion sort algorithm, create a method for sorting the array in ascending order
        System.out.println("Original array:");
        printArray(books);

        // Phase 3: Using the insertion sort algorithm, create a method for sorting the array in descending order
        System.out.println("Choose a sorting order:");
        System.out.println("1. Ascending");
        System.out.println("2. Descending");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        // Phase 4: Prompt the user whether they would like to use the insertion sort algorithm in ascending or descending order
        if (choice == 1) {
            // Create a copy of the original array to avoid modifying it
            String[] sortedBooks = books.clone();
            insertionSortAscending(sortedBooks);
            System.out.println("Sorted books in ascending order:");
            printArrayAsList(sortedBooks);
        } else if (choice == 2) {
            // Create a copy of the original array to avoid modifying it
            String[] sortedBooks = books.clone();
            insertionSortDescending(sortedBooks);
            System.out.println("Sorted books in descending order:");
            printArrayAsList(sortedBooks);
        } else {
            System.out.println("Invalid choice. Please try again.");
        }
    }

    // Method to print an array
    public static void printArray(String[] arr) {
        for (String s : arr) {
            System.out.print(s + " ");
        }
        System.out.println();
    }

    // Method to print an array as a list
    public static void printArrayAsList(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println((i + 1) + ". " + arr[i]);
        }
    }

    // Method to perform insertion sort in ascending order
    public static void insertionSortAscending(String[] arr) {
        for (int i = 1; i < arr.length; i++) {
            String key = arr[i];
            int j = i - 1;
            while (j >= 0 && key.compareTo(arr[j]) < 0) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    // Method to perform insertion sort in descending order
    public static void insertionSortDescending(String[] arr) {
        for (int i = 1; i < arr.length; i++) {
            String key = arr[i];
            int j = i - 1;
            while (j >= 0 && key.compareTo(arr[j]) > 0) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }
}
    

