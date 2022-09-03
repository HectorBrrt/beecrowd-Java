/*
Area of a Circle
The formula to calculate the area of a circumference is defined as A = π . R2. Considering to this problem that π = 3.14159:

Calculate the area using the formula given in the problem description.

Input
The input contains a value of floating point (double precision), that is the variable R.

Output
Present the message "A=" followed by the value of the variable, 
as in the example bellow, with four places after the decimal point. Use all double precision variables. 
*/

import java.util.Scanner;

public class beecrowd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Value: ");
        int R = input.nextInt();
        double pi = 3.14159;
        double area = R*R*pi;

        System.out.printf("A= %.4f%n", area);
    }
}
