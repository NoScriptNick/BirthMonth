import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //variables
        int birthMonth;

        System.out.println("Enter your birth month: ");
        if (scan.hasNextInt()) {
            birthMonth = scan.nextInt();
            if (birthMonth >= 1 && birthMonth <= 12) {
                System.out.println("Your birth month is " + birthMonth);
            } else {
                System.out.println("INVALID!!!!!!!!!!");
            }
        } else {
            System.out.println("INVALID!!!!!!!!");
        }
    }
}