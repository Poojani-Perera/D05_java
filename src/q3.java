import java.util.Scanner;
public class q3 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.println(" Enter the selling price: ");
        double sell = obj.nextDouble();


        System.out.println(" Enter the cost of the  product: ");
        double cost = obj.nextDouble();


        /////////////////////

        if (sell > cost) {
            double profit = sell - cost;
            System.out.println("Profit: $" + profit);  ///////////
        } else if (cost> sell) {
            double loss = cost - sell;
            System.out.println("Loss: $" + loss);
        } else {
            System.out.println("No Profit No Loss");
        }

    }
}
