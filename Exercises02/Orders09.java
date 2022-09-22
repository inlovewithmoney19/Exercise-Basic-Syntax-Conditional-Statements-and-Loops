import java.util.Scanner;

public class Orders09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int orders = Integer.parseInt(scanner.nextLine());

        int numOrders = 0;

        double priceForEverything = 0;
        double pricePerRow = 0 ;
        for (int i = orders; i >= numOrders ; i++) {
            if (numOrders == orders){
                break;
            }

            double productPrice = Double.parseDouble(scanner.nextLine());
            int days = Integer.parseInt(scanner.nextLine());
            int productsPerDay = Integer.parseInt(scanner.nextLine());

            pricePerRow = ((days * productsPerDay) * productPrice);
            priceForEverything = pricePerRow + priceForEverything;
            System.out.printf("The price for the coffee is: $%.2f%n",pricePerRow);
            numOrders ++ ;

        }
        System.out.printf("Total: $%.2f",priceForEverything);
    }
}
