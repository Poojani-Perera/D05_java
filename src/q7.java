import java.util.Scanner;
public class q7 {
   public static void main(String[] args) {
       int lessThanThousand = 0;
       int greaterThanThousand = 0;

       Scanner scanner = new Scanner(System.in);
       int[] numbers = new int[100];


       System.out.println("enter 100 positive integers:");
       for (int i = 0; i < 100; i++) {
           numbers[i] = scanner.nextInt();
       }

       for (int number : numbers) {
           if (number < 1000) {
               lessThanThousand++;
           } else if (number > 1000) {
               greaterThanThousand++;
           }
       }


       System.out.println("Numbers less than 1000: " + lessThanThousand);
       System.out.println("Numbers greater than 1000: " + greaterThanThousand);
   }
}