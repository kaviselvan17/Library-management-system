import java.util.ArrayList;
import java.util.Scanner;
import java.lang.System;
public class library{
    private ArrayList<book>books;
    private ArrayList<member>members;
    private Scanner scan=new Scanner(System.in);
    public library(){
        books=new ArrayList<>();
        members=new ArrayList<>();
    }
    // add a book
    public  void addBook(){
      
        System.out.print("enter id:");
        int id=scan.nextInt();
        scan.nextLine();
        System.out.print("enter title:");
        String title=scan.nextLine();
        System.out.print("enter author:");
        String author=scan.nextLine();
        books.add(new book(id, title, author));
         System.out.println("Book added successfully!");}
    
    public  void addMultipleBooks() {
    System.out.print("How many books you want to add: ");
    int n = scan.nextInt();
    scan.nextLine();

    for (int i = 0; i < n; i++) {
        System.out.println("\nEnter details for book " + (i + 1));
        addBook();
    }
}
    // Display all books
   public void displayBooks(){
         System.out.println("List of Books:");
         for (book books : books){
            System.out.println(books);
        }
    }
    //remove books
    public void removebooks(){
        System.out.println("enter book id");
        int id=scan.nextInt();
        scan.nextLine();
        boolean found=false;
        for(int i=0;i<books.size();i++){
            if(books.get(i).id==id){
                books.remove(i);
                found=true;
                System.out.println("book removed successfully");
                break;

            }
        }
        if(!found){
            System.out.println("book not found");
        }
    
    }
    
    //members 
    public void members(){
        System.out.print("enter id:");
        int id=scan.nextInt();
        scan.nextLine();
        System.out.print("enter name:");
        String name=scan.nextLine();
        members.add(new member(id,name));
         System.out.println("your added successfully!");

    }
    //display members
     public void displaymembers(){
         System.out.println("List of member:");
         for (member members : members){
            System.out.println(members);
        }
    }
}