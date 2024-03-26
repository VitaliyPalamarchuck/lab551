import java.util.Scanner;
public class lab5 {
    //Завдання 5. Створити програму визначення більшого за кількістю символів
    // рядка з двох введених користувачем
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Запит користувача на введення двох слів
        System.out.println("Будь ласка, введіть два окремі слова:");
        // Отримання двох слів від користувача
        String word1 = scanner.next();
        String word2 = scanner.next();
        // Порівняння довжин рядків та виведення результату
        if (word1.length() > word2.length()) {
            System.out.println("Перше слово \"" + word1 + "\" має більшу кількість символів.");
        } else if (word1.length() < word2.length()) {
            System.out.println("Друге слово \"" + word2 +  "\" має більшу кількість символів.");
        } else {
            System.out.println("Обидва слова мають однакову кількість символів.");
        }
    }
}