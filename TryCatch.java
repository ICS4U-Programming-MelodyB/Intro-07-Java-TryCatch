import java.util.Scanner;

/**
* The Program calculates the volume of a sphere in Java
* and check input for non numerical inputs.
*
* @author  Melody Berhane
* @version 1.0
* @since   2023-2-10
*/
public final class TryCatch {

    /**
     * This is a private constructor used to satisfy the
     * style checker.
     *
     * @exception IllegalStateException Utility class.
     * @see IllegalStateException
     */
    private TryCatch() {
        throw new IllegalStateException("Utility class");
    }

    /**
     * This is the main method.
     *
     * @param args Unused.
     */
    public static void main(String[] args) {
        // Welcome the user
        System.out.println("Welcome to Melody's volume of a Sphere Program!");
        System.out.print("Enter the radius of the sphere (cm): ");

        // Using Scanner for Getting Input for User
        final Scanner scanner = new Scanner(System.in);
        final String radString = scanner.nextLine();

        try {
            // Convert the string to a double
            final double radDouble = Double.parseDouble(radString);

            // If radius is negative, tell the user
            if (radDouble < 0) {
                System.out.println("The radius cannot be negative.");
            } else {
                // Calculate the volume
                final double volume = Math.PI * Math.pow(radDouble, 3);
                final double finalVolume = volume * (4f / 3f);

                // Display the volume, round to 2 decimal places
                System.out.print("The area of a circle with radius, ");
                System.out.print(radString + "cm, is ");
                System.out.format("%.2f", finalVolume);
                System.out.println("cm^2.");
            }
        } catch (NumberFormatException error) {
            System.out.println("Please enter a valid radius. "
                + error.getMessage());
        }

        // Closing Scanner
        scanner.close();
    }
}
