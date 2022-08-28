/*
Simple Calculate:
In this problem, the task is to read a
code of a product 1, the number of units of product 1,the price for one unit of product 1,
the code of a product 2,the number of units of product 2 and the price for one unit of product 2.
After this, calculate and show the amount to be paid.

Input
The input file contains two lines of data. In each line there will be 3 values:
two integers and a floating value with 2 digits after the decimal point.

Output
The output file must be a message like the following example where "Valor a pagar" means Value to Pay.
Remember the space after ":" and after "R$" symbol. The value must be presented with 2 digits after the point.
*/

import java.util.Scanner;

public class beecrowd{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Product 1: ");
        int code1 = input.nextInt();
        int units1 = input.nextInt();
        double price1 = input.nextDouble();

        System.out.print("Product 2: ");
        int code2 = input.nextInt();
        int units2 = input.nextInt();
        double price2 = input.nextDouble();

        double total = (units1*price1) + (units2*price2);

        System.out.printf("Total price: U$ %.2f ", total);
    }
}
