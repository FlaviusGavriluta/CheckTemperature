package en.codegym.task.pro.task03.task0301;

import java.util.Scanner;

/* 
Warm or cold
*/

public class CheckTemperature {
    public static void main(String[] args) {
        String cold = "It's cold outside";
        String warm = "It's warm outside";

        // Create Scanner object
        Scanner scanner = new Scanner(System.in);

        // Prompt for temperature
        System.out.println("Enter the outside temperature: ");

        // Read user input
        int temperature = scanner.nextInt();
        
        if(temperature < 0)
            // Print if temperature is less than 0
            System.out.println(cold);
        else
            // Print if temperature is 0 or higher
            System.out.println(warm);
    }
}