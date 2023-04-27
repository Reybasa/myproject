/**
 * @(#)lengthconverter.java.java
 *
 * lengthconverter.java application
 *
 * @author 
 * @version 1.00 2023/4/27
 */
 
public class lengthconverter.java {
    
    import java.util.Scanner;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double inputValue;
        int choice;

        do {
            System.out.println("Select the measurement type to be converted:");
            System.out.println("1. Meter");
            System.out.println("2. Centimeter");
            System.out.println("3. Mile");
            System.out.println("4. Yard");
            System.out.println("5. Foot");
            System.out.println("6. Inch");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    inputValue = getMeasurementValue("meter");
                    convertAndPrintResults(inputValue, "Meter", 100, 39.37, 3.281, 1.094, 0.001);
                    break;
                case 2:
                    inputValue = getMeasurementValue("centimeter");
                    convertAndPrintResults(inputValue, "Centimeter", 0.01, 0.3937, 0.0328, 0.0109, 0.00001);
                    break;
                case 3:
                    inputValue = getMeasurementValue("mile");
                    convertAndPrintResults(inputValue, "Mile", 1609.34, 63360, 5280, 1760, 1.609);
                    break;
                case 4:
                    inputValue = getMeasurementValue("yard");
                    convertAndPrintResults(inputValue, "Yard", 0.9144, 36, 3, 1.094, 0.0009);
                    break;
                case 5:
                    inputValue = getMeasurementValue("foot");
                    convertAndPrintResults(inputValue, "Foot", 0.3048, 12, 0.3333, 0.0833, 0.0003);
                    break;
                case 6:
                    inputValue = getMeasurementValue("inch");
                    convertAndPrintResults(inputValue, "Inch", 0.0254, 0.3937, 0.0328, 0.0109, 0.000025);
                    break;
                case 7:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }

        } while (choice != 7);

        scanner.close();
    }

    public static double getMeasurementValue(String measurementType) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value in " + measurementType + ": ");
        double value = scanner.nextDouble();
        return value;
    }

    public static void convertAndPrintResults(double inputValue, String measurementType, double meterConversion,
                                             double centimeterConversion, double mileConversion, double yardConversion,
                                             double footConversion) {
        System.out.println("Converting " + inputValue + " " + measurementType + ":");
        System.out.println("Meters: " + (inputValue * meterConversion));
        System.out.println("Centimeters: " + (inputValue * centimeterConversion));
        System.out.println("Miles: " + (inputValue * mileConversion));
        System.out.println("Yards: " + (inputValue * yardConversion));
        System.out.println("Feet: " + (inputValue * footConversion));
        System.out.println("Inches: " + (inputValue / centimeterConversion));
Write to

    }
}