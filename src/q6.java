import java.util.Scanner;
public class q6 {
    public static void main(String[] args) {

        final int numStudents = 100;
        double[] heights = new double[numStudents];
        double[] weights = new double[numStudents];
        Scanner scanner = new Scanner(System.in);

        // Input height and weight for each student
        for (int i = 0; i < numStudents; i++) {
            System.out.println("Enter data for student " + (i + 1) + ":");
            System.out.print("Height (in cm): ");
            heights[i] = scanner.nextDouble();
            System.out.print("Weight (in kg): ");
            weights[i] = scanner.nextDouble();
        }

        // Calculate the average height and weight
        double totalHeight = 0;
        double totalWeight = 0;

        for (int i = 0; i < numStudents; i++) {
            totalHeight += heights[i];
            totalWeight += weights[i];
        }

        double averageHeight = totalHeight / numStudents;
        double averageWeight = totalWeight / numStudents;

        // Output the average height and weight
        System.out.printf("Average height: %.2f cm\n", averageHeight);
        System.out.printf("Average weight: %.2f kg\n", averageWeight);


    }
}