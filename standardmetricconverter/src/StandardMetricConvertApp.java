public class StandardMetricConvertApp {

    public static void main(String[] args) {

        CopyrightHeader.Header();

        System.out.println("This application will allow you to convert Standard to Metric units based on mass and distance.");
        System.out.println("This application is set up to require you to engage in both conversions and allow for multiple entries. \n");
        
        ConversionMenu.menu();

    }
}