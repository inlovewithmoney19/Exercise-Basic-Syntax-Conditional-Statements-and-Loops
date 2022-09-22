import java.util.Scanner;

public class PrintAndSum04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startNum = Integer.parseInt(scanner.nextLine());
        int finalNum = Integer.parseInt(scanner.nextLine());

        int numSum = 0;
        for (int i = startNum; i <= finalNum ; i++) {
            System.out.print(i + " ");
            numSum = numSum + i ;
        }
        System.out.println();
        System.out.println("Sum: " + numSum);
    }
}
