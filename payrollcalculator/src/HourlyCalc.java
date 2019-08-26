import java.text.NumberFormat;
import java.util.Scanner;

public class HourlyCalc {
    
    public static void HourlyEmployeeCalculation(String hourlyFirstName, String hourlyLastName, double payRate) {
        Scanner input = new Scanner(System.in);
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        currency.setMaximumFractionDigits(2);
        boolean isNumber;
        double firstWeek = 0;
        double secondWeek = 0;
        double thirdWeek = 0;
        double fourthWeek = 0;
        
        System.out.println("This calculation is intended for " + hourlyFirstName + " " + hourlyLastName + ". *Hourly Rate Employee*");

        System.out.println("Please input the number of hours worked in week 1: ");
        do{ 
                if(input.hasNextDouble()){
                    firstWeek = input.nextDouble();
                    isNumber = true;
                }else {
                    System.out.println("Invalid entry. Please enter a numeric value.");
                    isNumber = false;
                    input.next();
                }
            } while (!isNumber);        

        System.out.println("Please input the number of hours worked in week 2: ");
        do{ 
                if(input.hasNextDouble()){
                    secondWeek = input.nextDouble();
                    isNumber = true;
                }else {
                    System.out.println("Invalid entry. Please enter a numeric value.");
                    isNumber = false;
                    input.next();
                }
            } while (!isNumber);

        System.out.println("Please input the number of hours worked in week 3: ");
        do{ 
                if(input.hasNextDouble()){
                    thirdWeek = input.nextDouble();
                    isNumber = true;
                }else {
                    System.out.println("Invalid entry. Please enter a numeric value.");
                    isNumber = false;
                    input.next();
                }
            } while (!isNumber);

        System.out.println("Please input the number of hours worked in week 4: ");
        do{ 
                if(input.hasNextDouble()){
                    fourthWeek = input.nextDouble();
                    isNumber = true;
                }else {
                    System.out.println("Invalid entry. Please enter a numeric value.");
                    isNumber = false;
                    input.next();
                }
            } while (!isNumber);

        double hourlyTotalHours = firstWeek + secondWeek + thirdWeek + fourthWeek;
        double hourlyGrossIncome = payRate * hourlyTotalHours;

        System.out.println(
            hourlyFirstName + " " + hourlyLastName + "\n" 
            + "Total Hours Worked: " + hourlyTotalHours + "\n" 
            + "Gross Pay: " + currency.format(hourlyGrossIncome) + "\n");
        
        input.nextLine(); //included because of the "\n" being consumed after the last method is called, skipping the first salary question
        
    }
}