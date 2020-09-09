import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner myInt = new Scanner(System.in);
        int a;
        System.out.println("Enter an integer: ");
        a = myInt.nextInt();
        System.out.println("These are all of the prime numbers less than or equal to " + a);
        Soe b = new Soe();
        b.soe(a);
    }
}
