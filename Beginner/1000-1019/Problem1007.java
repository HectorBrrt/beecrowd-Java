/*
Difference:
Read four integer values named A, B, C and D. 
Calculate and print the difference of product A and B by the product of C and D (A * B - C * D).

Input
The input file contains 4 integer values.

Output
Print DIFERENCA (DIFFERENCE in Portuguese) with all the capital letters, 
according to the following example, with a blank space before and after the equal signal.
*/

import java.util.Scanner;

public class beecrowd{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("A: ");
        int A = input.nextInt();
        System.out.print("B: ");
        int B = input.nextInt();
        System.out.print("C: ");
        int C = input.nextInt();
        System.out.print("D: ");
        int D = input.nextInt();
        int DIFFERENCE = (A * B - C * D);

        System.out.println("DIFERENCA = " + DIFFERENCE);

    }
}
