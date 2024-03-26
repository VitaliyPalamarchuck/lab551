import java.util.Scanner;

public class lab2 {
    // Завдання 2. Створити програму визначення та виведення на екран першої літери
    // п’яти довільно введених користувачем слів із використанням методу
    //substring(pos1, pos2).
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Запит користувача на введення п'яти слів
        System.out.println("Будь ласка, введіть п'ять окремих слів:");
        String word1 = scanner.next();
            String s1 = word1.substring(0,1); //Використання методу substring(pos1, pos2)
        String word2 = scanner.next();
            String s2= word2.substring(0,1);  //Використання методу substring(pos1, pos2)
        String word3 = scanner.next();
            String s3 = word3.substring(0,1);  //Використання методу substring(pos1, pos2)
        String word4 = scanner.next();
            String s4 = word4.substring(0,1);  //Використання методу substring(pos1, pos2)
        String word5 = scanner.next();
            String s5 = word5.substring(0,1);  //Використання методу substring(pos1, pos2)

        //Конкатинація методом concat()
        String sentence1 = word1.concat(" ").concat(word2).concat(" ").concat(word3).concat(" ").concat(word4).concat(" ").concat(word5);
        // Виведення сформованого речення
        System.out.println("Сформоване речення: " + sentence1);
        //Конкатинація методом concat()
        String sentence2 = s1.concat(" ").concat(s2).concat(" ").concat(s3).concat(" ").concat(s4).concat(" ").concat(s5);
        // Виведення перших літер слів
        System.out.printf("Перші літери слів речення:"+sentence2);


    }
}
