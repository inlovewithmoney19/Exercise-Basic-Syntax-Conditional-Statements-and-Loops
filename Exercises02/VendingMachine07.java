import java.util.Scanner;

public class VendingMachine07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String startCommand = scanner.nextLine();

        double sumMoney = 0;
        while (!startCommand.equals("Start")){
            double coins = Double.parseDouble(startCommand);

            if (coins != 0.1 &&
                    coins != 0.2 &&
                    coins != 0.5 &&
                    coins != 1.0 &&
                    coins != 2.0){
                System.out.printf("Cannot accept %.2f%n",coins);
            }else {
                sumMoney = sumMoney + coins;
            }
            startCommand = scanner.nextLine();
        }

        String product = scanner.nextLine();
        double productPrice = 0;

        while (!product.equals("End")){

            if (product.equals("Nuts")){
                productPrice = 2.0;
                if (productPrice <= sumMoney){
                    sumMoney = sumMoney - productPrice;
                    System.out.printf("Purchased %s%n", product);
                }else {
                    System.out.println("Sorry, not enough money");
                }
            } else if (product.equals("Water")){
                productPrice = 0.7;
                if (productPrice <= sumMoney){
                    sumMoney = sumMoney - productPrice;
                    System.out.printf("Purchased %s%n", product);
                }else {
                    System.out.println("Sorry, not enough money");
                }
            }else if (product.equals("Crisps")){
                productPrice = 1.5;
                if (productPrice <= sumMoney){
                    sumMoney = sumMoney - productPrice;
                    System.out.printf("Purchased %s%n", product);
                }else {
                    System.out.println("Sorry, not enough money");
                }
            }else if (product.equals("Soda")){
                productPrice = 0.8;
                if (productPrice <= sumMoney){
                    sumMoney = sumMoney - productPrice;
                    System.out.printf("Purchased %s%n", product);
                }else {
                    System.out.println("Sorry, not enough money");
                }
            }else if (product.equals("Coke")){
                productPrice = 1;
                if (productPrice <= sumMoney){
                    sumMoney = sumMoney - productPrice;
                    System.out.printf("Purchased %s%n", product);
                }else {
                    System.out.println("Sorry, not enough money");
                }
            }else {
                System.out.println("Invalid product");
            }
            product= scanner.nextLine();
        }
        System.out.printf("Change: %.2f",sumMoney);
    }
}

