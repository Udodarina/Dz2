import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Введите стоимость билета: ");
        Scanner input = new Scanner(System.in);
        float priceTicket = input.nextFloat();

        int bonus = (int) (priceTicket / 20);

        System.out.println("Начислено бонусов:" + bonus + " " + "миль");

    }
}