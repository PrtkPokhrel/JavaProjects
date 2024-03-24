package EmailandPasswordGenerator;

import java.util.Scanner;

public class Email {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int userChoice;
        Generator generator = new Generator();

        while (true) {
            System.out.print("\n");
            System.out.println("Welcome ");
            System.out.println("1. Generate a new email address: ");
            System.out.println("2. Generate a random password: ");
            System.out.println("3. Exit");
            System.out.print("Plese enter your choice ");
            userChoice = scan.nextInt();

            if (userChoice == 1) {
                int secondChoice;
                System.out.print("\n");
                System.out.println("1. Generate with your first and lastname: ");
                System.out.println("2. Generate random email");
                System.out.print("Enter your choice: ");
                secondChoice = scan.nextInt();
                if (secondChoice == 1) {
                    String fname;
                    String lname;
                    System.out.println("\nEnter your first name: ");
                    fname = scan.nextLine();
                    System.out.println("Enter your last name: ");
                    lname = scan.nextLine();
                    System.out.print(generator.emailFL(fname,lname));
                } else {
String random;
                    System.out.println(generator.emailRandom(random));
                }
            }

            else if (userChoice == 2) {
                int passLength;
                System.out.print("\n");
                System.out.print("Enter how many length of password you need: ");
                passLength = scan.nextInt();
            }

            else {

                break;
            }
        }

        scan.close();

    }
}

class Generator {

    public String emailFL(String fname,String lname) {
 
  
        
    }

    public String emailRandom(String result) {

    }


    public String passwordGenerator() {

    }
}
