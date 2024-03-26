import java.util.Scanner;
public class lab4 {
    //Завдання 4.
    // Створити програму перевірки ідентичності двох введених з клавіатури імен без урахування регістру
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Запит користувача на введення двох слів
        System.out.println("Будь ласка, введіть два окремі слова:");
        // Отримання двох слів від користувача
        String word1 = scanner.next();
        String word2 = scanner.next();
        //Виведення результату порівняння двох введених слів
        System.out.println("Результат порівняння двох введених слів: "+word1.equalsIgnoreCase(word2));
    }
}
