import java.util.Scanner;

public class RageExpenses11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lostGames = Integer.parseInt(scanner.nextLine());
        double headsetPrice = Double.parseDouble(scanner.nextLine());
        double mousePrice = Double.parseDouble(scanner.nextLine());
        double keyboardPrice = Double.parseDouble(scanner.nextLine());
        double displayPrice = Double.parseDouble(scanner.nextLine());

        int breakHeadset = lostGames / 2;
        int breakMouse = lostGames /3 ;
        int breakKeyboard = lostGames / 6;
        int breakDisplau = lostGames / 12;

        double finalDamage = (headsetPrice * breakHeadset) + (breakMouse * mousePrice) +
                (breakKeyboard * keyboardPrice) + (breakDisplau * displayPrice) ;

        System.out.printf("Rage expenses: %.2f lv.",finalDamage);
    }
}
