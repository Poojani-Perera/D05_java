import java.util.Scanner;
public class q1 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        System.out.println("Enter the salary: ");
        double salary = myObj.nextDouble();

        System.out.println("Enter the year :");
        int year = myObj.nextInt();

        double bonusPercentage = 0;

        if (year < 5) {
            bonusPercentage = 0.10;

        } else if (year < 10) {
            bonusPercentage = 0.15;
        } else if (year >= 10) {
            bonusPercentage = 0.25;
        }


        double bonus = salary * bonusPercentage;
        double totalSalary = salary + bonus;
        System.out.println("Your total salary with bonus is: " + totalSalary);

    else{
        System.out.println("No bonus is given to non-permanent employees.");
        }
    }
}
