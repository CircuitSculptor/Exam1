import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome to the customer portal of our company");
        System.out.println("Please choose one of the following options: ");
        System.out.println("C - Add Customer\nU - Update Customer\nD - Display All Customers\nE - Exit");

        try (Scanner sc = new Scanner(System.in)) {
            try {
                int option = sc.nextInt();
                //char option = sc;

                if (option == 'C') {


                } else if (option == 'U') {


                } else if (option == 'D') {


                } else if (option == 'E') {

                }
            }
            catch (Exception e) {
                System.out.println("Invalid option " + getMessage(e));
            }
        }
    }
}
