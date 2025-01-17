import java.util.Scanner;

public class largernumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        System.out.println("Enter the number");
        int m = sc.nextInt();
        int larger = (n > m) ? n : m;

        System.out.println("The larger number is: " + larger);



    }
}
