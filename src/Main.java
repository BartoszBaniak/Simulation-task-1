import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //int seed = 123;
        int a = 97;
        int b = 11;
        int M = 100;
        double low = 478.123;
        double high = 12345.876;
        double lambda = 0.001;
        int n = 10;
        double[] p = {0.2, 0.1, 0.3, 0.15, 0.25};
        double[] xx = {-1, 0, 1, 2, 3};

        Scanner scanner = new Scanner(System.in);
        System.out.println("Type in the seed you want to use: ");
        int seed = scanner.nextInt();
        MyRandom myRandom = new MyRandom(seed, a, b, M, low, high);

        System.out.println("\nChoose the method.\n1. NextInt()\n2. NextDouble()\n3. NextDouble(low, high)\n4. Expontential");
        int choice = scanner.nextInt();

        switch(choice){
            case 1:
                for(int i = 0; i < n; i++) {
                    int randomNumber1 = myRandom.nextInt();
                    System.out.println("NextInt("+ (i+1) +") = " + randomNumber1);
                }
                break;

            case 2:
                for(int i = 0; i < n; i++) {
                    double randomNumber2 = myRandom.nextDouble();
                    System.out.println("NextDouble("+ (i+1) +") = " + randomNumber2);
                }
                break;

            case 3:
                for(int i = 0; i < n; i++) {
                    double randomNumber3 = myRandom.nextDouble(low, high);
                    System.out.println("NextDouble("+ (i+1) +") = " + randomNumber3);
                }
                break;

            case 4:
                for(int i = 0; i < n; i++) {
                    double randomNumber4 = myRandom.Exponential(lambda);
                    System.out.println("Expontential("+ (i+1) +") = " + randomNumber4);
                }
                break;

            case 5:
                for(int i = 0; i < n; i++) {
                    double randomNumber5 = myRandom.rozklad1();
                }
                break;

            case 6:
                for(int i = 0; i < n; i++) {
                    double randomNumber6 = myRandom.dyskret(xx, p);
                    System.out.println(randomNumber6);
                }
                break;

            default:
                System.out.println("\nChoose the right method\n");
                break;
        }
    }
}