/*
Banknotes and Coins:
Read a value of floating point with two decimal places. This represents a monetary value.
After this, calculate the smallest possible number of notes and coins on which the value can be decomposed.
The considered notes are of 100, 50, 20, 10, 5, 2. The possible coins are of 1, 0.50, 0.25, 0.10, 0.05 and 0.01.
Print the message “NOTAS:” followed by the list of notes and the message “MOEDAS:” followed by the list of coins.

Input
The input file contains a value of floating point N (0 ≤ N ≤ 1000000.00).

Output
Print the minimum quantity of banknotes and coins necessary to change the initial value, as the given example.
*/

import java.util.Scanner;
public class beecrowd{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Value: R$ ");
        double value = input.nextDouble();

        System.out.println("Bills: "); // -----------------------------------------//
        int aux;
        aux = (int) value/100;
        System.out.printf("%d bill(s) of U$ 100.00\n", aux);
        value =  value%100;

        aux = (int) value/50;
        System.out.printf("%d bill(s) of U$ 50.00\n", aux);
        value = value%50;

        aux = (int) value/20;
        System.out.printf("%d bill(s) of U$ 20.00\n", aux);
        value =  value%20;

        aux = (int) value/10;
        System.out.printf("%d bill(s) of U$ 10.00\n", aux);
        value = value%10;

        aux = (int) value/5;
        System.out.printf("%d bill(s) of U$ 5.00\n", aux);
        value =value%5;

        aux = (int) value/2;
        System.out.printf("%d bill(s) of U$ 2.00\n", aux);
        value = value%2;

        value = value * 100.0;
        System.out.println("Coins: "); // -----------------------------------------//

        aux = (int) value/100;
        System.out.printf("%d coin(s) of U$ 1.00\n", aux);
        value = value%100.0;

        aux = (int) value/50;
        System.out.printf("%d coin(s) of U$ 0,50\n", aux);
        value = value%50.0;

        aux = (int) value/25;
        System.out.printf("%d coin(s) of U$ 0,25\n", aux);
        value = value%25.0;

        aux = (int) value/10;
        System.out.printf("%d coin(s) of U$ 0,10\n", aux);
        value = value%10.0;

        aux = (int) value/5;
        System.out.printf("%d coin(s) of U$ 0,05\n", aux);
        value = value%5.0;

        aux = (int) value;
        System.out.printf("%d coin(s) of U$ 0,01\n", aux);
    }
}
