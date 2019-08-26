import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CopyrightHeader {

    public static void Header() {

        final String F_NAME = "Ryan";
        final String L_NAME = "Baker";
        final String CONSTRUCTION = "06/26/2019";
        final DateFormat sdf = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
        Date date = new Date();

        System.out.println(F_NAME + " " + L_NAME + " " + "initially created on: " + CONSTRUCTION);
        System.out.println("The current date and time is: " + sdf.format(date));
        System.out.println();
        System.out.println("Payroll Calculations, Week 2 Assignment");
        System.out.println();

    }

}