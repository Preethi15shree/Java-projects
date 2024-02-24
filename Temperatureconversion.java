import java.util.Scanner;
import java.io.*;

public class Temperatureconversion {
    public static void main (String [] args){
        // Displaying the title of the program
        System.out.println("\n\t\t\t\t\t\t********TEMPERATURE CONVERSION********");
        System.out.println("\n\t\t\t\t\t\t********F = Fahrenheit C = Celsius K = Kelvin********\r");
        Scanner input = new Scanner(System.in);
        String again;

        do{

        // Prompting the user to enter the temperature value, type, and conversion type
        System.out.println("Enter the temperature value, type, and conversion type:");
        float tempValue = input.nextFloat();
        String tempType = input.next();
        String tempConvertTo = input.next();

        // Fahrenheit to Celsius & Kelvin
        float fToCelsius = ((tempValue -32) * 5) / 9;
        fToCelsius = Math.round(fToCelsius * 100.0) / 100.0F;
        float fToKelvin = (((tempValue - 32) * 5) / 9) + 273.15F;
        fToKelvin = Math.round(fToKelvin * 100.0) / 100.0F;

        // Celsius to Fahrenheit & Kelvin
        float cToFahrenheit = ((tempValue  * 9) / 5) + 32;
        cToFahrenheit = Math.round(cToFahrenheit * 100.0) / 100.0F;
        float cToKelvin = tempValue + 273.15F;
        cToKelvin = Math.round(cToKelvin * 100.0) / 100.0F;

        // Kelvin to Fahrenheit & Celcius
        float kToFahrenheit = ((((tempValue - 273.15F) * 9) / 5) + 32);
        kToFahrenheit = Math.round(kToFahrenheit * 100.0) / 100.0F;
        float kToCelsius = tempValue - 273.15F;
        kToCelsius = Math.round(kToCelsius * 100.0) / 100.0F;

        // Error messages
        String wrongType = "Entered wrong temperature type, Please try again";
        String wrongConvertType = "Entered wrong conversion type. Please try again";

        // Checking the temperature type and conversion type
        if(tempType.equalsIgnoreCase("f")) {
            if(tempConvertTo.equalsIgnoreCase("f"))
            {
                System.out.println("Fahrenheit: " + tempValue +"F" + "<***>" + "Fahrenheit :" + tempValue+ "F");
            }
            else if(tempConvertTo.equalsIgnoreCase("c"))
            {
                System.out.println("Fahrenheit: " + tempValue +"F" + "<***>" + "Celsius :" + fToCelsius+ "C");

            }
            else if(tempConvertTo.equalsIgnoreCase("k"))
            {
                System.out.println("Fahrenheit: " + tempValue +"F" + "<***>" + "Fahrenheit :" + fToKelvin+ "K");

            }
            else
            {
                System.out.println(wrongConvertType);
            }
        }

        else if(tempType.equalsIgnoreCase("c")) {
            if(tempConvertTo.equalsIgnoreCase("c"))
            {
                System.out.println("Celsius: " + tempValue +"C" + "<***>" + "Celsius :" + tempValue+ "C");
            }
            else if(tempConvertTo.equalsIgnoreCase("f"))
            {
                System.out.println("Celsius: " + tempValue +"C" + "<***>" + "Fahrenheit :" + cToFahrenheit+ "F");

            }
            else if(tempConvertTo.equalsIgnoreCase("k"))
            {
                System.out.println("Celsius: " + tempValue +"C" + "<***>" + "Celsius :" + cToKelvin+ "K");

            }
            else
            {
                System.out.println(wrongConvertType);
            }
        }

        else if(tempType.equalsIgnoreCase("k")) {
            if(tempConvertTo.equalsIgnoreCase("k"))
            {
                System.out.println("Kelvin: " + tempValue +"K" + "<***>" + "Kelvin :" + tempValue+ "K");
            }
            else if(tempConvertTo.equalsIgnoreCase("f"))
            {
                System.out.println("Kelvin: " + tempValue +"K" + "<***>" + "Fahrenheit :" + kToFahrenheit+ "F");

            }
            else if(tempConvertTo.equalsIgnoreCase("c"))
            {
                System.out.println("Kelvin: " + tempValue +"K" + "<***>" + "Celsius :" + kToCelsius+ "C");

            }
            else
            {
                System.out.println(wrongConvertType);
            }
        }

        else {
            System.out.println(wrongType);
        }

        // Asking the user if they want to continue
        System.out.println("\rwould u like to continue?(y/n)");
        again = input.next();
        }
        while (again.equalsIgnoreCase("y"));
   

    }

}