import java.util.Scanner;
import java.text.NumberFormat;

public class SalaryCalc {    
    
    public static void SalaryEmployeeCalculation(String salaryFirstName, String salaryLastName, double annualSalary) {
        Scanner input = new Scanner(System.in);
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        currency.setMaximumFractionDigits(2);
        boolean isNumber;
        int totalWeeks = 0;
        
        System.out.println("This calculation is intended for " + salaryFirstName + " " + salaryLastName + ". *Salary Rate Employee*");
     
        System.out.println("Did they work the first week? Y/N");
        String weekWorked = input.nextLine();
          
        if (weekWorked.equalsIgnoreCase("y")) {
            totalWeeks++;
        } else {
        }

        System.out.println("Did they work the second week? Y/N");
        weekWorked = input.nextLine();

        if (weekWorked.equalsIgnoreCase("y")) {
            totalWeeks++;
        } else {
        }

        System.out.println("Did they work the third week? Y/N");
        weekWorked = input.nextLine();

        if (weekWorked.equalsIgnoreCase("y")) {
            totalWeeks++;
        } else {
        }

        System.out.println("Did they work the fourth week? Y/N");
        weekWorked = input.nextLine();

        if (weekWorked.equalsIgnoreCase("y")) {
            totalWeeks++;
        } else {
        }

        double salaryGrossMonthlyIncome = (((annualSalary / 12) / 4) * totalWeeks);
        if (salaryGrossMonthlyIncome > annualSalary) {
            salaryGrossMonthlyIncome = 0;
        } else {
        }

        System.out.println(
                salaryFirstName + " " + salaryLastName + "\n" + "Full Weeks Worked: " + totalWeeks + "\n" + "Gross Pay: "
                        + currency.format(salaryGrossMonthlyIncome) + "\n");
        
    }
}