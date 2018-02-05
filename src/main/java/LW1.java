import java.util.Scanner;

public class LW1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the 1kg candies price");
        double candiesPrice = scan.nextDouble();

        System.out.println("Enter the 1kg price for cookies");
        double cookiesPrice = scan.nextDouble();
        double result = (candiesPrice * 0.3) + (cookiesPrice * 0.4);
        double resultForThree = 3 * ((cookiesPrice * 2) + (candiesPrice * 1.8));

        System.out.println("The first result " + result);
        System.out.println("Result for three purchases " + resultForThree);
        }
    }



