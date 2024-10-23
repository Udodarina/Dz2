import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите стоимость билета: ");
        float PriceTicket = scanner.nextFloat();

        int bonus = (int) (PriceTicket / 20);

        System.out.println("Начислено бонусов:" + bonus + " " + "миль");

    }
}