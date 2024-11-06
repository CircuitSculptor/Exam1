import java.util.Scanner;
import java.util.ArrayList;

public class CustomerManagment {

    public static void main(String[] args) {

    getDetails();

    //details.get(1);

    }

    public static void getDetails() {

        ArrayList<String> details;
        details = new ArrayList<String>();

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Please enter your customerId: ");
            details.add(sc.nextLine());
            System.out.println("Please enter your name: ");
            details.add(sc.nextLine());
            System.out.println("Please enter your email: ");
            details.add(sc.nextLine());
            System.out.println("Please enter your phone number: ");
            details.add(sc.nextLine());
        }

        details.get(1);
    }
}
