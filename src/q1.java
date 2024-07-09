import java.util.Locale;
import java.util.Scanner;
public class q1 {
    public static void main(String[] args) {
        double bonusPercentage = 0;
        double salary=0;

        Scanner myObj = new Scanner(System.in);

        System.out.println("Are you permenent? yes/no :");
        String ispermenent = myObj.nextLine().trim().toLowerCase();


        if ( ispermenent.equals("yes")) {
            System.out.println("Enter the salary: ");
             salary = myObj.nextDouble();

            System.out.println("Enter the year :");
            int year = myObj.nextInt();

            bonusPercentage = 0;

            if (year < 5) {
                bonusPercentage = 0.10;

            } else if (year < 10) {
                bonusPercentage = 0.15;

            } else if (year >= 10) {
                bonusPercentage = 0.25;
            }
        }
        else{
        System.out.println("No bonus is given to non-permanent employees.");
        }

        double bonus = salary * bonusPercentage;
        double totalSalary = salary + bonus;
        System.out.println("Your total salary with bonus is: " + totalSalary);

    }
}
