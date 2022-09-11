/*
Area:
Make a program that reads three floating point values: A, B and C. Then, calculate and show:
a) the area of the rectangled triangle that has base A and height C.
b) the area of the radius's circle C. (pi = 3.14159)
c) the area of the trapezium which has A and B by base, and C by height.
d) the area of the square that has side B.
e) the area of the rectangle that has sides A and B.

Input
The input file contains three double values with one digit after the decimal point.

Output
The output file must contain 5 lines of data. Each line corresponds to one of the areas described above,
always with a corresponding message (in Portuguese) and one space between the two points and the value.
The value calculated must be presented with 3 digits after the decimal point.
*/

import java.util.Scanner;

public class beecrowd{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("A: ");
        double A = input.nextDouble();
        System.out.print("B: ");
        double B = input.nextDouble();
        System.out.print("C: ");
        double C = input.nextDouble();

        double a = (A*C)/2;
        double b = 3.14159 *C*C;
        double c = ((A+B)*C)/2;
        double d = B*B;
        double e = A*B;

        System.out.printf("Triangle: %.3f", a);
        System.out.printf("\nCircle: %.3f", b);
        System.out.printf("\nTrapezium: %.3f", c);
        System.out.printf("\nSquare: %.3f", d);
        System.out.printf("\nRectangle: %.3f", e);
    }
}
