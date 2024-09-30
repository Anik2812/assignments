// import java.util.Scanner;

// public class prac_5 {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         System.out.print("Enter person's health (excellent/poor): ");
//         String health = scanner.nextLine();

//         System.out.print("Enter person's age: ");
//         int age = scanner.nextInt();

//         System.out.print("Enter person's location (city/village): ");
//         String location = scanner.next();

//         System.out.print("Enter person's gender (male/female): ");
//         String gender = scanner.next();

//         int premium = 0;
//         int maxAmount = 0;

//         if (health.equals("excellent") && age >= 25 && age <= 35 && location.equals("city") && gender.equals("male")) {
//             premium = 4000;
//             maxAmount = 200000;
//         } else if (health.equals("excellent") && age >= 25 && age <= 35 && location.equals("city") && gender.equals("female")) {
//             premium = 3000;
//             maxAmount = 100000;
//         } else if (health.equals("poor") && age >= 25 && age <= 35 && location.equals("village") && gender.equals("male")) {
//             premium = 6000;
//             maxAmount = 10000;
//         } else {
//             System.out.println("The person is not insured.");
//             return;
//         }

//         System.out.println("The person should be insured.");
//         System.out.println("Premium rate: Rs. " + premium);
//         System.out.println("Maximum amount for insurance: Rs. " + maxAmount);
//     }
// }

import java.util.* ;

public class prac_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number (1-7) to get the name of the day: ");
        int dayNumber = scanner.nextInt();

        String dayName = "";
        switch (dayNumber) {
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            case 4:
                dayName = "Thursday";
                break;
            case 5:
                dayName = "Friday";
                break;
            case 6:
                dayName = "Saturday";
                break;
            case 7:
                dayName = "Sunday";
                break;
            default:
                System.out.println("Invalid day number.");
                return;
        }

        System.out.println("The name of the day is: " + dayName);

        System.out.print("Enter a number (1-12) to get the name of the month: ");
        int monthNumber = scanner.nextInt();

        String monthName = "";
        switch (monthNumber) {
            case 1:
                monthName = "January";
                break;
            case 2:
                monthName = "February";
                break;
            case 3:
                monthName = "March";
                break;
            case 4:
                monthName = "April";
                break;
            case 5:
                monthName = "May";
                break;
            case 6:
                monthName = "June";
                break;
            case 7:
                monthName = "July";
                break;
            case 8:
                monthName = "August";
                break;
            case 9:
                monthName = "September";
                break;
            case 10:
                monthName = "October";
                break;
            case 11:
                monthName = "November";
                break;
            case 12:
                monthName = "December";
                break;
            default:
                System.out.println("Invalid month number.");
                return;
        }

        System.out.println("The name of the month is: " + monthName);

        System.out.println("Enter the quantity and item name to generate the bill:");
        System.out.print("Quantity: ");
        int quantity = scanner.nextInt();
        System.out.print("Item: ");
        String item = scanner.next();

        double price = 0;
        switch (item.toLowerCase()) {
            case "burger":
                price = 150;
                break;
            case "pizza":
                price = 300;
                break;
            case "sandwich":
                price = 100;
                break;
            default:
                System.out.println("Invalid item.");
                return;
        }

        double totalAmount = price * quantity;
        double gst = totalAmount * 0.12;
        double discount = 0;

        if (quantity > 5 && item.equalsIgnoreCase("burger")) {
            discount = totalAmount * 0.1;
        } else if (totalAmount > 1000) {
            discount = totalAmount * 0.15;
        } else if (totalAmount > 500) {
            discount = totalAmount * 0.2;
        }

        double finalAmount = totalAmount + gst - discount;

        System.out.println("Bill Details:");
        System.out.println("Item: " + item);
        System.out.println("Quantity: " + quantity);
        System.out.println("Price per item: Rs. " + price);
        System.out.println("Total amount: Rs. " + totalAmount);
        System.out.println("GST (12%): Rs. " + gst);
        System.out.println("Discount: Rs. " + discount);
        System.out.println("Final amount: Rs. " + finalAmount);
    }
}

