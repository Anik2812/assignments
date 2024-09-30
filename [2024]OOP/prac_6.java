import java.util.*;

public class prac_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose an option:");
        System.out.println("1. Generate Multiplication Table");
        System.out.println("2. Reverse a String");
        System.out.println("3. Calculate Sum of first 100 natural numbers");
        System.out.println("4. Calculate Share Market Profit and Loss");
        System.out.println("5. Exit");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                // Multiplication Table
                System.out.print("Enter a number to generate its multiplication table: ");
                int num = scanner.nextInt();
                System.out.println("Multiplication table for " + num + " is:");
                for (int i = 1; i <= 10; i++) {
                    System.out.println(num + " * " + i + " = " + (num * i));
                }
                break;
            case 2:
                // Reverse String
                System.out.print("Enter a string to reverse: ");
                String str = scanner.next();
                System.out.println("Reversed string is: ");
                for (int i = str.length() - 1; i >= 0; i--) {
                    System.out.print(str.charAt(i));
                }
                break;
            case 3:
                // Sum of first 100 natural numbers
                int sum = 0;
                for (int i = 1; i <= 100; i++) {
                    sum += i;
                }
                System.out.println("Sum of the first 100 natural numbers is: " + sum);
                break;
            case 4:
                // Share Market Profit and Loss
                System.out.print("Enter the buying price of the share: ");
                float buyingPrice = scanner.nextFloat();
                System.out.print("Enter the selling price of the share: ");
                float sellingPrice = scanner.nextFloat();
                System.out.print("Enter the number of shares: ");
                int numShares = scanner.nextInt();

                float totalBuyingPrice = buyingPrice * numShares;
                float totalSellingPrice = sellingPrice * numShares;
                float profit = totalSellingPrice - totalBuyingPrice;
                float loss = totalBuyingPrice - totalSellingPrice;
                float profitPercentage = (profit / totalBuyingPrice) * 100;
                float lossPercentage = (loss / totalBuyingPrice) * 100;

                if (profit > 0) {
                    System.out.println("Profit: " + profit);
                    System.out.println("Percentage of Profit: " + profitPercentage + "%");
                } else if (loss > 0) {
                    System.out.println("Loss: " + loss);
                    System.out.println("Percentage of Loss: " + lossPercentage + "%");
                } else {
                    System.out.println("No profit or loss.");
                }
                break;
            case 5:
                System.out.println("Exiting the program.");
                break;
            default:
                System.out.println("Invalid choice. Please choose a valid option.");
        }
    }
}
