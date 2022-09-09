/*
Extremely Basic
Read 2 variables, named A and B and make the sum of these two variables, assigning its result to the variable X. 
Print X as shown below. Print endline after the result otherwise you will get “Presentation Error”.

Input
The input file will contain 2 integer numbers. asdfasdfasdfsdf

Output
Print the letter X (uppercase) with a blank space before and after the equal signal followed by the value of X, 
according to the following example.
*/

import java.util.Scanner;

public class beecrowd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("First number: ");
        int A = input.nextInt();

        System.out.print("Second number: ");
        int B = input.nextInt();

        int X = A+B;
        System.out.println("X= " + X);

    }
}
