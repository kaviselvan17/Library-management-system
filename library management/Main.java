import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        library Library = new library();
        Scanner scan = new Scanner(System.in);
        int choice;
        do{
         System.out.println("\nLibrary Management System");
        
          System.out.println("1. addMultipleBook");
          System.out.println("2. Display Books");
          System.out.println("3. Remove Books");
          System.out.println("4. Add member"); 
          System.out.println("5. display member");
          System.out.println("6. Exit");  
          System.out.print("Enter choice: ");
            choice = scan.nextInt();
                switch (choice) {
                
                case 1 ->Library.addMultipleBooks();
                case 2 -> Library.displayBooks();
                case 3 -> Library.removebooks();
                case 4 -> Library.members();
                case 5->Library.displaymembers();
                case 6-> System.out.println("Exiting...");
                default -> System.out.println("Invalid choice!");

                }
                
                 
            } while (choice != 5);
    }
}