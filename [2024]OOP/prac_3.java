// import java.util.Scanner;

// public class prac_3 {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         System.out.print("Enter first number: ");
//         double num1 = scanner.nextDouble();

//         System.out.print("Enter second number: ");
//         double num2 = scanner.nextDouble();

//         System.out.println("Addition: " + (num1 + num2));
//         System.out.println("Subtraction: " + (num1 - num2));
//         System.out.println("Multiplication: " + (num1 * num2));

//         if (num2 != 0) {
//             System.out.println("Division: " + (num1 / num2));
//         } else {
//             System.out.println("Division: Cannot divide by zero");
//         }

//         System.out.print("Enter principal amount: ");
//         double principal = scanner.nextDouble();

//         System.out.print("Enter interest rate (as decimal): ");
//         double rate = scanner.nextDouble();

//         System.out.print("Enter number of years: ");
//         int years = scanner.nextInt();

//         double interest = principal * rate * years;
//         System.out.println("Simple Interest: " + interest);

//         scanner.close();
//     }
// }

public class prac_3 {
    public static void main(String[] args) {
        int sheelaPens = 8;
        int leelaPens = 3;
        int malaPens = 0;

        sheelaPens -= 2;
        malaPens += 2;

        leelaPens -= 2;
        malaPens += 2;

        malaPens -= 3;

        malaPens -= 1;
        sheelaPens += 1;

        System.out.println("Final pen counts:");
        System.out.println("Sheela: " + sheelaPens + " pens");
        System.out.println("Leela: " + leelaPens + " pens");
        System.out.println("Mala: " + malaPens + " pens");
    }
}