import java.util.Scanner;
public class q4 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter the  your age: ");
        int age = obj.nextInt();

        System.out.println("Enter the  weigh : ");
        int weigh = obj.nextInt();

        if (age > 18) {
            System.out.println("");;
        }else if (weigh >= 50) {
            System.out.println("eligible for blood donation");;
        }else {
            System.out.println("your can't donate");
        }


    }
}
