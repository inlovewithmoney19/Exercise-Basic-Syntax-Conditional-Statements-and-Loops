import java.util.Scanner;

public class StrongNumber06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        int startNumber = number;
        int NumberSum = 0;
        while (number > 0 ){
            int lastNum = number % 10 ;

            int factorial = 1 ;
            for (int i = 1; i <= lastNum ; i ++) {
                factorial = factorial * i ;
            }

            NumberSum = factorial + NumberSum;
            number = number / 10;
        }

        if (NumberSum == startNumber){
            System.out.println("yes");
        }else {
            System.out.println("no");
        }
    }
}
