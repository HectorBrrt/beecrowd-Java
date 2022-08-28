import java.util.Scanner;

public class beecrowd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("First number: ");
        int n = input.nextInt();
        double pi = 3.14159;
        double area = n*n*pi;

        System.out.println("Area = " + area);
    }
}
