/*
Consumption:
Calculate a car's average consumption being provided the total distance traveled (in Km)
and the spent fuel total (in liters).

Input
The input file contains two values: one integer value X representing the total distance (in Km)
and the second one is a floating point number Y representing the spent fuel total,
with a digit after the decimal point.

Output
Present a value that represents the average consumption of a car with 3 digits after the decimal point,
followed by the message "km/l".
*/

import java.util.Scanner;

public class beecrowd{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Total distance (in km): ");
        int X = input.nextInt();
        System.out.print("Total fuel spent (in liters): ");
        double Y = input.nextDouble();
        double consumption = X/Y;
        System.out.printf("Consuption: %.3f km/l", consumption);
    }
}
