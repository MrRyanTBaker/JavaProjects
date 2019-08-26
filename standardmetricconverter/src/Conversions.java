import java.text.DecimalFormat;
import java.util.Scanner;

public class Conversions {
    public static void heightConversion(double standardFeet, double standardInches) {

        Scanner input = new Scanner(System.in);
        DecimalFormat df2 = new DecimalFormat("#.##");
        boolean isNumber;

        System.out.println("Enter the number of feet: ");
            do{ 
                if(input.hasNextDouble()){
                    standardFeet = input.nextDouble();
                    isNumber = true;
                }else {
                    System.out.println("Invalid entry. Please enter a numeric value.");
                    isNumber = false;
                    input.next();
                }
            } while (!isNumber);

        System.out.println("Enter the number of inches: ");
            do{ 
                if(input.hasNextDouble()){
                    standardInches = input.nextDouble();
                    isNumber = true;
                }else {
                    System.out.println("Invalid entry. Please enter a numeric value.");
                    isNumber = false;
                    input.next();
                }
            } while (!isNumber);


        double metricCenti = (((standardFeet * 30.48) + (standardInches * 2.54)));

        System.out.println(
                "You entered " + standardFeet + " feet and " + standardInches + " inches.  This converts to " + df2.format(metricCenti)
                        + " centimeters. \n");
    }

    public static void weightConversion(double pounds) {

        Scanner input = new Scanner(System.in);
        DecimalFormat df2 = new DecimalFormat("#.##");
        boolean isNumber;

        System.out.println("Enter the number of pounds: ");
            do{ 
                if(input.hasNextDouble()){
                    pounds = input.nextDouble();
                    isNumber = true;
                }else {
                    System.out.println("Invalid entry. Please enter a numeric value.");
                    isNumber = false;
                    input.next();
                }
            } while (!isNumber);

        double metricKilo = (pounds / 2.205);

        System.out.println(pounds + " pounds converts to " + df2.format(metricKilo) + " kilograms. \n");

    }
}
