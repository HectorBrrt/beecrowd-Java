import java.util.Scanner;

public class beecrowd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("First number: ");
        int A = input.nextInt();

        System.out.print("Second number: ");
        int B = input.nextInt();

        int SOMA = A+B;
        System.out.println("SOMA = " + SOMA);

    }
}
