/*
Average 2:
Read three values (variables A, B and C), which are the three student's grades.
Then, calculate the average, considering that grade A has weight 2, grade B has weight 3 and the grade C has weight 5.
Consider that each grade can go from 0 to 10.0, always with one decimal place.

Input
The input file contains 3 values of floating points (double) with one digit after the decimal point.

Output
Print the message "MEDIA"(average in Portuguese) and the student's average according to the following example,
with a blank space before and after the equal signal.
*/

import java.util.Scanner;

public class beecrowd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Grade A: ");
        double A = input.nextDouble();
        System.out.print("Grade B: ");
        double B = input.nextDouble();
        System.out.print("Grade C: ");
        double C = input.nextDouble();

        double average = ((A*2)+(B*3)+(C*5))/10;

        System.out.printf("MEDIA = %.1f%n", average);
    }
}
