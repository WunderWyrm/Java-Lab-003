/**
 *
 * @author Trevor Hartman
 * @author Samuel Theiss
 *
 * @since Version 1.0
 *
 */

import java.util.Scanner;

public class GettingHotInHere {
    /**
     * Teaching Mr. Roboto how to listen to us.
     * @param args Command line arguments [The source file path, The target file path, ...]
     **/
    public static void main(String[] args) {
        // The instantiation code for a Scanner instance.
        Scanner scanner = new Scanner(System.in);

        System.out.print("What is the temperature in °F: ");

        int fahrenheit = scanner.nextInt();
        float celsius = ( (float) (fahrenheit - 32) ) * (5.0f / 9.0f);

        System.out.printf("%d°F\n", fahrenheit);
        System.out.printf("%f°C\n", celsius);
        System.out.printf("%d°C\n", (int) celsius);
        System.out.printf("If it were 2°C warmer it would be: %f°C\n", 2.0f + celsius);
    }
}
