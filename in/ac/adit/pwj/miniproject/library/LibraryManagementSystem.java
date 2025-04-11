package in.ac.adit.pwj.miniproject.library;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LibraryManagementSystem {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);
        List<User> users = new ArrayList<>();

        // Adding users
        System.out.println("Enter number of users:");
        int numberOfUsers = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        for (int i = 0; i < numberOfUsers; i++) {
            System.out.println("Enter user type (Student/Faculty):");
            String userType = scanner.nextLine();
            System.out.println("Enter user name:");
            String userName = scanner.nextLine();
            String userId = "U" + (i + 1); // Simple user ID generation
            if (userType.equalsIgnoreCase("Student")) {
                users.add(new Student(userName, userId));
            } else if (userType.equalsIgnoreCase("Faculty")) {
                users.add(new Faculty(userName, userId));
            } else {
                System.out.println("Invalid user type. Please enter either 'Student' or 'Faculty'.");
                i--; // Decrement to repeat this iteration
            }
        }

        // Main loop for user actions
        while (true) {
            System.out.println("\nLibrary Management System");
            System.out.println("1. Add Book");
            System.out.println("2. Borrow Book");
            System.out.println("3. Return Book");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1: // Add Book
                    System.out.print("Enter book title to add: ");
                    String bookTitle = scanner.nextLine();
                    library.addBook(new Book(bookTitle));
                    System.out.println("Book added: " + bookTitle);
                    break;

                case 2: // Borrow Book
                    System.out.print("Enter user ID to borrow book: ");
                    String userIdToBorrow = scanner.nextLine();
                    User userToBorrow = findUserById(users, userIdToBorrow);
                    if (userToBorrow != null) {
                        System.out.print("Enter book title to borrow: ");
                        String borrowTitle = scanner.nextLine();
                        // Create a thread for borrowing
                        Thread borrowThread = new Thread(() -> userToBorrow.borrowBook(library, borrowTitle));
                        borrowThread.start();
                        try {
                            borrowThread.join(); // Wait for the borrowing thread to finish
                        } catch (InterruptedException e) {
                            System.out.println("Thread interrupted: " + e.getMessage());
                        }
                    } else {
                        System.out.println("User  not found.");
                    }
                    break;

                case 3: // Return Book
                    System.out.print("Enter user ID to return book: ");
                    String userIdToReturn = scanner.nextLine();
                    User userToReturn = findUserById(users, userIdToReturn);
                    if (userToReturn != null) {
                        System.out.print("Enter book title to return: ");
                        String returnTitle = scanner.nextLine();
                        // Create a thread for returning
                        Thread returnThread = new Thread(() -> userToReturn.returnBook(library, returnTitle));
                        returnThread.start();
                        try {
                            returnThread.join(); // Wait for the returning thread to finish
                        } catch (InterruptedException e) {
                            System.out.println("Thread interrupted: " + e.getMessage());
                        }
                    } else {
                        System.out.println("User  not found.");
                    }
                    break;

                case 4: // Exit
                    System.out.println("Exiting the system.");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static User findUserById(List<User> users, String userId) {
                for (User  user : users) {
                    if (user.userId.equals(userId)) {
                        return user;
                    }
                }
                return null; // User not found
            }
        }