import java.util.Scanner;
import java.util.Exception;

public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome to the customer portal of our company\n" +
                "Please choose one of the following options: \n" +
                "C - Add Customer\nU - Update Customer\nD - Display All Customers\nE - Exit");

        try (Scanner sc = new Scanner(System.in)) {
            try {
                int option = sc.nextInt();

                if (option == 'C') {
                    getDetails();
                    System.out.println("Add Customer");

                } else if (option == 'U') {
                    System.out.println("Update Customer");

                } else if (option == 'D') {
                    System.out.println("Display All Customers");

                } else if (option == 'E') {
                    System.out.println("Exit");
                }
            }
            catch (Exception e) {
                getMessage(e);
                System.out.println("Invalid option " + getMessage(e));
            }
        }
    }
}
