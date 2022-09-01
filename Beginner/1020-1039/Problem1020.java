/*
Age in Days
Read an integer value corresponding to a person's age (in days) and print it in years, months and days, 
followed by its respective message “ano(s)”, “mes(es)”, “dia(s)”.

Note: only to facilitate the calculation, consider the whole year with 365 days and 30 days every month. 
In the cases of test there will never be a situation that allows 12 months and some days, like 360, 363 or 364. 
This is just an exercise for the purpose of testing simple mathematical reasoning.

Input
The input file contains 1 integer value.

Output
Print the output, like the following example.
*/

import java.util.Scanner;

public class beecrowd{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Age (in days): ");
        int age = input.nextInt();

        int years = age/365;
        int months = (age%365)/30;
        int days = (age%365)%30;

        System.out.printf("""
                %d year(s)
                %d month(s)
                %d day(s)
                """, years, months, days);
    }
}
