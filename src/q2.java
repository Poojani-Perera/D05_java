import java.util.Scanner;
public class q2 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);

        System.out.println("Enter the number 1: ");
         int num1 = num.nextInt();

        System.out.println("Enter the number 2: ");
        int num2 = num.nextInt();

        if (num1 < num2) {
            System.out.println("The first number is less than the second number");;

        } else if (num1 > num2) {
            System.out.println("The first number is greater than the second number");;
        }
        else {
            System.out.println("Both are equal");
        }
    }
}
