import java.util.Scanner;

public class PadawanEquipment10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double amountMoney = Double.parseDouble(scanner.nextLine());
        double studentsNum = Double.parseDouble(scanner.nextLine());
        double oneLightSaberPrice = Double.parseDouble(scanner.nextLine());
        double oneRobePrice = Double.parseDouble(scanner.nextLine());
        double oneBeltPrice = Double.parseDouble(scanner.nextLine());

        double moneyForSabers = Math.ceil(studentsNum + (studentsNum * 0.10)) * oneLightSaberPrice; // 10% more
        double moneyForRobes = oneRobePrice * studentsNum;

        double moneyForBelts = studentsNum * oneBeltPrice ; // every 6 belt is free
        if (studentsNum >= 6){
            moneyForBelts = studentsNum * oneBeltPrice - (Math.floor(studentsNum / 6) * oneBeltPrice);
        }

        double priceForAllEquipment = moneyForBelts + moneyForRobes + moneyForSabers;

        if (amountMoney >= priceForAllEquipment ){
            System.out.printf("The money is enough - it would cost %.2flv.", priceForAllEquipment);
        }else {
            System.out.printf("George Lucas will need %.2flv more.", Math.abs(amountMoney- priceForAllEquipment));
        }
    }
}
