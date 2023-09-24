package Task1;

import java.util.Scanner;

public class Main {
    public static void main (String[] args) {

        Calculation calculation = new Calculation(0, 10);
        Scanner scanner = new Scanner(System.in);

        boolean exit = false;
        while (!exit) {
            System.out.println("Выберите действие:");
            System.out.println("1. Рассчитать стоимость покупки");
            System.out.println("2. Добавить новый продукт");
            System.out.println("3. Рассчитать сумму с учетом скидки");
            System.out.println("4. проверить на работоспособность");
            System.out.println("5. Выход");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    calculation.purchaseAmount();
                    break;
                case 2:
                    calculation.newProduct();
                    break;
                case 3:
                    calculation.calculateDiscount(calculation.purchaseAmount, calculation.discountAmount);
                    break;
                case 4:
                    calculation.testCalculateDiscont();
                case 5:
                    exit = true;
                    break;
                default:
                    System.out.println("Неверный выбор");
            }
        }

        scanner.close();
    }
}