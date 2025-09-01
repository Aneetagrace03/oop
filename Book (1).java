import java.util.Scanner;

class Book {
    String title;
    String author;
    float price;


    void setDetails(String t, String a, float p) {
        title = t;
        author = a;
        price = p;
    }

  
    void inputDetails() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter book title:");
        title = sc.nextLine();

        System.out.println("Enter author name:");
        author = sc.nextLine();

        System.out.println("Enter book price:");
        price = sc.nextFloat();
    }

    
    void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }
}

public class BookMain {
    public static void main(String[] args) {
        Book b1 = new Book();
        b1.inputDetails();

        System.out.println("\nBook Details:");
        b1.display();
    }
}
