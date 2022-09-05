/*
Greatest:
Make a program that reads 3 integer values and present the greatest one followed by the message "is the greatest". 
Use the following formula: GreatestAB= (a+b+abs(a-b))/2

Input
The input file contains 3 integer values.

Output
Print the greatest of these three values followed by a space and the message “is the greatest”.
*/

import java.util.Scanner;

public class beecrowd{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Type a, b and c: ");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        int maiorAB = (a+b+Math.abs(a-b))/2;
        int maiorABC = (maiorAB + c + Math.abs(maiorAB-c))/2;

        System.out.printf("%d is the greatest", maiorABC);
    }
}
