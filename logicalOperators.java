import java.util.Scanner;

class LogicalOperators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the username:");
        String username = sc.nextLine();

        System.out.println("Enter the password:");
        String password = sc.nextLine();

        if (username.equals("aneeta") && password.equals("hai123")) {
            System.out.println("Authorized login successful");
        } else if (username.equals("aneeta") && !password.equals("hai123")) {
            System.out.println("Incorrect password");
        } else if (!username.equals("aneeta") && password.equals("hai123")) {
            System.out.println("Incorrect username");
        } else {
            System.out.println("Not registered");
        }

        sc.close(); // Always good practice to close the Scanner
    }
}
