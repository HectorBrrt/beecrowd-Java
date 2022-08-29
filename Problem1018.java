public class beecrowd{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Value: R$ ");
        int value = input.nextInt();

        int f1 = value/100;
        int f2 = (value%100)/50;
        int f3 = ((value%100)%50)/20;
        int f4 = (((value%100)%50)%20)/10;
        int f5 = ((((value%100)%50)%20)%10)/5;
        int f6 = (((((value%100)%50)%20)%10)%5)/2;
        int f7 = (((((value%100)%50)%20)%10)%5)%2;

        System.out.printf("""
                Value =  %d
                %d bill(s) of U$ 100,00
                %d bill(s) of U$ 50,00
                %d bill(s) of U$ 20,00
                %d bill(s) of U$ 10,00
                %d bill(s) of U$ 5,00
                %d bill(s) of U$ 2,00
                %d bill(s) of U$ 1,00""", value,f1,f2,f3,f4,f5,f6,f7);
    }
}
