/*
Simple Product
Read two integer values. 
After this, calculate the product between them and store the result in a variable named PROD. 
*/

import java.util.Scanner;

public class beecrowd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("First number: ");
        int A = input.nextInt();

        System.out.print("Second number: ");
        int B = input.nextInt();

        int PROD = A*B;
        System.out.println("SOMA = " + PROD);

    }
}
