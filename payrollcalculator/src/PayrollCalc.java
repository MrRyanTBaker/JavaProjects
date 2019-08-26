public class PayrollCalc {

    public static void main(String[] args) {
    
        CopyrightHeader.Header();
        
        HourlyCalc.HourlyEmployeeCalculation("Darrel", "McDonald", 9.45);
        HourlyCalc.HourlyEmployeeCalculation("Xavier", "Andrews", 9.90);
        HourlyCalc.HourlyEmployeeCalculation("Christian", "Bale", 9.75);
        HourlyCalc.HourlyEmployeeCalculation("Selena", "Dresher", 9.25);
        
        SalaryCalc.SalaryEmployeeCalculation("Emilia", "Rogers", 35000);
        SalaryCalc.SalaryEmployeeCalculation("Jamie", "Lane", 29000);
       
    }    
}