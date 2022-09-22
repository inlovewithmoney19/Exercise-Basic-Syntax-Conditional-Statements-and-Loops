import java.util.Scanner;

public class Vacation03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numPeoples = Integer.parseInt(scanner.nextLine());
        String personType = scanner.nextLine();
        String day = scanner.nextLine();

        double price = 0;
        if (day.equals("Friday")) {
            if (personType.equals("Students")) {
                price = 8.45;
            } else if (personType.equals("Business")) {
                price = 10.90;
            } else if (personType.equals("Regular")) {
                price = 15;
            }
        }
        if (day.equals("Saturday")) {
            if (personType.equals("Students")) {
                price = 9.80;
            } else if (personType.equals("Business")) {
                price = 15.60;
            } else if (personType.equals("Regular")) {
                price = 20;
            }
        }
        if (day.equals("Sunday") ) {
            if (personType.equals("Students")) {
                price = 10.46;
            } else if (personType.equals("Business")) {
                price = 16;
            } else if (personType.equals("Regular")) {
                price = 22.50;
            }
        }

        double totalPrice = numPeoples * price;
        if (numPeoples >= 30 && personType.equals("Students")) {
            totalPrice = totalPrice - (totalPrice * 0.15);
        } else if (numPeoples >= 100 && personType.equals("Business")) {
            totalPrice = totalPrice - (price * 10);
        } else if (numPeoples >= 10 && numPeoples <= 20) {
            totalPrice = totalPrice - (totalPrice * 0.05);
        }

        System.out.printf("Total price: %.2f", totalPrice);
    }
}
