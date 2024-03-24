package EmailandPasswordGenerator;

import java.util.Random;

public class Rough {

    // Function to generate a random email address
    public static String generateRandomEmail(String firstName, String lastName) {
        Random rand = new Random();
        
        // Generate a random number between 1000 and 9999
        int randomNum = rand.nextInt(9000) + 1000;
        
        // Generate a random domain from a list of common email domains
        String[] domains = {"gmail.com", "yahoo.com", "hotmail.com", "outlook.com", "aol.com"};
        String randomDomain = domains[rand.nextInt(domains.length)];
        
        // Concatenate first name, last name, random number, and domain to create the email address
        String email = firstName.toLowerCase() + "." + lastName.toLowerCase() + randomNum + "@" + randomDomain;
        
        return email;
    }
    
    public static void main(String[] args) {
        // Example usage
        String firstName = "John";
        String lastName = "Doe";
        String randomEmail = generateRandomEmail(firstName, lastName);
        System.out.println("Randomly generated email address: " + randomEmail);
    }
}
