import java.util.Scanner;

public class Login05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nickname = scanner.nextLine();
        String password = "";
        for (int position = nickname.length() - 1; position >= 0 ; position--) {
            char currentSymbol = nickname.charAt(position) ;
            password = password + currentSymbol;
        }

        String intPassword = scanner.nextLine();
        int counter = 0;
        while (!intPassword.equals(password)){
            counter ++ ;
            if (counter == 4){
                System.out.printf("User %s blocked!",nickname);
                break;
            }

            System.out.println("Incorrect password. Try again.");
            intPassword = scanner.nextLine();
        }

        if (password.equals(intPassword)){
            System.out.printf("User %s logged in.",nickname);
        }
    }
}
