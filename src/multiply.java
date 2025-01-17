import java.util.Scanner;

public class multiply {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Number: ");
        int first = sc.nextInt();
        System.out.print("Enter Second Number: ");
        int second = sc.nextInt();
        int multiply = first * second;
        System.out.println("Multiplication of " + first + " and " + second + " is " + multiply);

    }
}
