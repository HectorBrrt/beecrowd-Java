/*
Salary:
Write a program that reads an employee's number, his/her worked hours number in a month and the amount he received per hour.
Print the employee's number and salary that he/she will receive at end of the month, with two decimal places.

Don’t forget the space before and after the equal signal and after the U$. asdfasdfasdfsdf

Input
The input file contains 2 integer numbers and 1 value of floating point, representing the number,
worked hours amount and the amount the employee receives per worked hour.

Output
Print the number and the employee's salary, according to the given example, with a blank space before and after the equal signal.
*/

import java.util.Scanner;

public class beecrowd{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Employee's number: ");
        int emplnum = input.nextInt();
        System.out.print("Worked hours in a month: ");
        int time = input.nextInt();
        System.out.print("Salary per hour: U$ ");
        double sal = input.nextDouble();
        System.out.printf("NUMBER = %d\nSALARY = %.2f",emplnum, sal*time);
    }
}
