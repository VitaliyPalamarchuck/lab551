import java.util.Scanner;
public class lab1 {
    //Завдання 1. З використанням методу concat() класу String скласти речення з
    //п’яти окремих слів введених користувачем.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Запит користувача на введення п'яти слів
        System.out.println("Будь ласка, введіть п'ять окремих слів:");
        // Отримання п'яти слів від користувача
        String word1 = scanner.next();
        String word2 = scanner.next();
        String word3 = scanner.next();
        String word4 = scanner.next();
        String word5 = scanner.next();
        //Конкатинація методом concat()
        String sentence = word1.concat(" ").concat(word2).concat(" ").concat(word3).concat(" ").concat(word4).concat(" ").concat(word5);
        // Виведення сформованого речення
        System.out.println("Сформоване речення: " + sentence);
    }
}
