import java.text.NumberFormat;
import java.util.Scanner;

public class InvoiceCompute {

    public static void InvoiceCollection() {
    Scanner input = new Scanner(System.in);
    NumberFormat percent = NumberFormat.getPercentInstance();
    NumberFormat currency = NumberFormat.getCurrencyInstance();

        String choice = "y";
        int counter = 0;

            while(choice.equalsIgnoreCase("y")) {

            System.out.println("Enter subtotal amount: ");
            double subtotal = 0;

            double discountPercent;

            boolean isNumber;

            do {
                if (input.hasNextDouble()) {
                    subtotal = input.nextDouble();
                    isNumber = true;
                } else {
                    System.out.println("Invalid entry. Please enter a numeric value. ");
                    isNumber = false;
                    input.next();
                }
            } while (!isNumber);

            if(subtotal >= 1000){
                discountPercent = .10;
            } else if (subtotal >= 800) {
                discountPercent = .05;
            } else if (subtotal >= 500) {
                discountPercent = .03;
            } else {
                discountPercent = 0;
            }

            double discountAmount = subtotal * discountPercent;
            double total = subtotal - discountAmount;

            String messageFormat = "Invoice: \n" + "Subtotal: " + currency.format(subtotal) + "\n" + "Percent Discount: " + percent.format(discountPercent) + "\n" + "Total: " + currency.format(total) + "\n";
            System.out.println(messageFormat);

            counter++;

            System.out.println("Would you like to make another calculation? \n" + "Y/N: ");
            choice = input.next();
            System.out.println();

        }

        System.out.println("Invoices generated: " + counter + "\n" + "Thank you for participating.");

    }

}