/*
Distance Between Two Points:
Read the four values corresponding to the x and y axes of two points in the plane, p1 (x1, y1) and p2 (x2, y2)
and calculate the distance between them, showing four decimal places after the comma, according to the formula:

Distance = square_root((x2-x1)² + (y2-y1)²)
Input
The input file contains two lines of data. The first one contains two double values:
x1 y1 and the second one also contains two double values with one digit after the decimal point: x2 y2.

Output
Calculate and print the distance value using the provided formula, with 4 digits after the decimal point.
*/

import java.util.Scanner;

public class beecrowd{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("(X1, Y1): ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        System.out.println("(X2, Y2): ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();

        // Distance = square_root((x2-x1)^2 + (y2-y1)^2)

        double distance = Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));

        System.out.printf("%.4f%n", distance);



    }
}
