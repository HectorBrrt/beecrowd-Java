import java.util.Scanner;

public class beecrowd{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Time spent in the trip (in hours): ");
        int time = input.nextInt();
        System.out.print("Average speed: (in km/h): ");
        int avg = input.nextInt();

        double liters = (double) (avg*time)/12;
        System.out.printf("%.3f", liters);
    }
}
