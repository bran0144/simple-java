import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int value;
        value = in.nextInt();
        System.out.print("That number doubled is: ");
        System.out.println(value * 2);
    }
}
