import java.util.Scanner;
// created
public class LW2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the time in minutes");
        double timeInMin = scan.nextDouble();

        System.out.println("Enter the distance in km");
        double distanceinKM = scan.nextDouble();

        double speed = (distanceinKM * 1000) / (timeInMin * 60);
        System.out.println ("The speed is " + speed + " m/s");
    }
}
