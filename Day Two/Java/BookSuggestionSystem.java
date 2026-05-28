import java.util.Scanner;
import java.util.Random;

public class BookSuggestionSystem {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random random = new Random();

       
        String[] books = {"The Vangence ", "The Hobbit ", "Mystery "};

        while (true) {
            System.out.print("""
                ================================================>
                        1. Suggest
                        2. Add
                        3. Remove
                        4. Update
                        5. Exit.
              <===================================================
                        """);
            System.out.print("Enter your choice of action: ");
            String choice = input.nextLine();

            if (choice.equals("1")) {
                if (books.length == 0) {
                    System.out.println("No books!");
                    continue;
                }
                while (true) {
                    System.out.println(getSuggestion(books, random));
                    System.out.print("Do you want to continue: (Yes/No): ");
                    String answer = input.nextLine();
                   
                        break; 
                }
            } 
            else if (choice.equals("2")) {
                System.out.print("Title to add: ");
                String title = input.nextLine();

                int originalSize = books.length;
                books = addBook(books, title);
                System.out.println(books.length > originalSize ? "Book has been added successfully!" : "Already exists!");
            } 
            else if (choice.equals("3")) {
                System.out.print("Title to remove: ");
                String title = input.nextLine();

                int originalSize = books.length;
                books = removeBook(books, title);

                System.out.println(books.length < originalSize ? "Removed" : "Book Not found!");
            } 
            else if (choice.equals("4")) {
                System.out.print("Old title: ");
                
                String oldTitle = input.nextLine();
                System.out.print("New title: ");
                String newTitle = input.nextLine();

                String[] updatedBooks = updateBook(books, oldTitle, newTitle);
                if (updatedBooks == books) {
                    System.out.println("Book Updated Successfully!");
                } else {
                    books = updatedBooks;
                    System.out.println("Updated successfully!");
                }
            } 
            else if (choice.equals("5")) {
                System.out.println("Exit!");
                break;
            }
        }
        
    }

    public static String getSuggestion(String[] books, Random random) {
        String randomBook = books[random.nextInt(books.length)];
        int randomPage = random.nextInt(100) + 1;
        return "Book: " + randomBook +  " at Page " + randomPage;
    }

    
    public static String[] addBook(String[] books, String title) {
        
        for (String name : books) {
            if (name.equalsIgnoreCase(title)) return books;
        }

        String[] newBooks = new String[books.length + 1];
        for (int count = 0; count < books.length; count++) {
            newBooks[count] = books[count];
        }
        newBooks[books.length] = title;
        return newBooks;
    }

    public static String[] removeBook(String[] books, String title) {
        boolean found = false;
        for (String name : books) {
            if (name.equalsIgnoreCase(title)) { found = true; break; }
        }
        if (!found) return books;

        String[] newBooks = new String[books.length - 1];
        int newIndex = 0;

        for (int count = 0; count < books.length; count++) {
            if (books[count].equalsIgnoreCase(title)) {
                continue;
            }
            newBooks[newIndex] = books[count];
            newIndex++;
        }
        return newBooks;
    }

    public static String[] updateBook(String[] books, String oldTitle, String newTitle) {
        for (int count = 0; count < books.length; count++) {
            if (books[count].equalsIgnoreCase(oldTitle)) {
                String[] updatedBooks = books.clone();
                updatedBooks[count] = newTitle;
                return updatedBooks;
            }
        }
        return books;
    }
} 

