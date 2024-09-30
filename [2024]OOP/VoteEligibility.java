import java.util.Scanner;

public class VoteEligibility {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        
        if (age >= 18) {
            System.out.println("You are eligible to vote!");
        } else {
            System.out.println("You are not eligible to vote yet.");
        }
        
        System.out.print("Enter a password: ");
        String password = scanner.next();
        
        if (password.length() >= 8 && password.length() <= 16) {
            System.out.println("Password length is valid.");
        } else {
            System.out.println("Password length is not valid.");
        }
        
        scanner.close();
    }
}


// import java.util.Scanner;

// public class VoteEligibility {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         // Apply discount based on total purchase amount
//         System.out.print("Enter total purchase amount: ");
//         double purchaseAmount = scanner.nextDouble();
//         double discount = purchaseAmount >= 100 ? 0.1 : 0.0;
//         double discountedPrice = purchaseAmount - (purchaseAmount * discount);
//         System.out.println("Discounted price: " + discountedPrice);

//         // Check if a student has passed based on their score
//         System.out.print("Enter student's score: ");
//         int score = scanner.nextInt();
//         String result = score >= 60 ? "Passed" : "Failed";
//         System.out.println("Result: " + result);

//         // Determine if a number is even or odd
//         System.out.print("Enter a number: ");
//         int number = scanner.nextInt();
//         String parity = number % 2 == 0 ? "Even" : "Odd";
//         System.out.println("Parity: " + parity);

//         scanner.close();
//     }
// }