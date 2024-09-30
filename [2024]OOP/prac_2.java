// import java.util.*;

// class CurrencyConverter {

//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);
        
//         double amount;
//         System.out.println("Enter the amount in INR: ");
//         amount = sc.nextDouble();        

//         double exchangeRateUSD = 82;
//         double exchangeRateEUR = 120;

//         double usdAmount = amount / exchangeRateUSD;
//         double eurAmount = amount / exchangeRateEUR;

//         System.out.println("The amount in INR is: " + amount);
//         System.out.println("The amount in USD is: " + usdAmount);
//         System.out.println("The amount in EUR is: " + eurAmount);
//     }
// }

import java.util.Scanner;

class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of subjects:");
        int numSubjects = scanner.nextInt();
        
        double totalScore = 0;
        
        for (int i = 1; i <= numSubjects; i++) {
            System.out.print("Enter score for subject " + i + ":");
            double score = scanner.nextDouble();
            totalScore += score;
        }
        
        double averageScore = totalScore / numSubjects;
        
        char grade;
        
        if (averageScore >= 90) {
            grade = 'A';
        } else if (averageScore >= 80) {
            grade = 'B';
        } else if (averageScore >= 70) {
            grade = 'C';
        } else if (averageScore >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        
        System.out.println("Average score: " + averageScore);
        System.out.println("Grade: " + grade);
        
        scanner.close();
    }
}
