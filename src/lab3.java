import java.util.Scanner;

public class lab3 {
    //Завдання 3. Створити програму виводу на екран повідомлення про більше
    //дробове число з трьох введених користувачем.
    // Передбачити можливість повідомлення користувача про введення не дробового числа.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Запит на введення трьох дробових чисел
        System.out.println("Будь ласка, введіть три окремих дробових числа (через кому) :");
        double num1, num2, num3; // Отримання трьох введених вами дробових чисел

        if (scanner.hasNextDouble()) {      //Перевірка першого числа
            num1 = scanner.nextDouble();
        } else {
            System.out.println("Введено неправильне значення. Будь ласка, введіть дробове число (через кому).");
            return;
        }
        if (scanner.hasNextDouble()) {      //Перевірка другого числа
            num2 = scanner.nextDouble();
        } else {
            System.out.println("Введено неправильне значення. Будь ласка, введіть дробове число (через кому).");
            return;
        }
        if (scanner.hasNextDouble()) {      //Перевірка третього числа
            num3 = scanner.nextDouble();
        } else {
            System.out.println("Введено неправильне значення. Будь ласка, введіть дробове число (через кому).");
            return;
        }
        // Пошук найбільшого числа
        double max = Math.max(Math.max(num1, num2), num3);
        // Вивід повідомлення про найбільше дробове число
        System.out.println("Найбільше дробове число: " + max);
    }
}
