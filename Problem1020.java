public class beecrowd{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Seconds: ");
        int seconds = input.nextInt();

        int hours = seconds/3600;
        int minutes = (seconds%3600)/60;
        seconds = (seconds%3600)%60;

        System.out.printf("%d : %d : %d", hours, minutes, seconds);

    }
}
