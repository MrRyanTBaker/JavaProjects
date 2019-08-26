import java.util.Scanner;

public class ConversionMenu {

    public static void menu() {

        Scanner input = new Scanner(System.in);

        System.out.println("Would you like to convert height or weight?  Please type your response as either 'height' or 'weight'.");
        String choice = input.next();

        if (choice.equalsIgnoreCase("height")) {

            do {
                Conversions.heightConversion(0, 0);
                System.out.println("Would you like to convert another height/distance? If yes, enter 'y'. Otherwise it any key.");
                choice = input.next();

            } while (choice.equalsIgnoreCase("y"));

            do {
                Conversions.weightConversion(0);
                System.out.println("Would you like to convert another weight? If yes, enter 'y'. Otherwise it any key.");
                choice = input.next();

            } while (choice.equalsIgnoreCase("y"));


        } else if (choice.equalsIgnoreCase("weight")) {

            do {
                Conversions.weightConversion(0);
                System.out.println("Would you like to convert another weight? If yes, enter 'y'. Otherwise press any key.");
                choice = input.next();

            } while (choice.equalsIgnoreCase("y"));


            do {
                Conversions.heightConversion(0, 0);
                System.out.println("Would you like to convert another height/distance? If yes, enter 'y'. Otherwise press any key.");
                choice = input.next();

            } while (choice.equalsIgnoreCase("y"));

        } else {

        }
        System.out.println("This ends our activity. Thank you for participating.\n");
          
    }
}
