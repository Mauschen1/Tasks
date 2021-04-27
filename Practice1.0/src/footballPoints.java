import java.util.Scanner;
public class footballPoints {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); // Вызов класса сканер
        System.out.println("Введите количество побед:"); // Вывод текста
        int win = in.nextInt(); // // Ввод с консоли побед
        System.out.println("Введите количество проигрышей:");
        int lose = in.nextInt(); // Ввод с консоли проигрышей
        System.out.println("Введите количество игр в ничью:");
        int draw = in.nextInt(); // Ввод с консоли игр в ничью
        int score = (win * 3) + (lose * 0) + (draw * 3); // Расчет общего количесвта
        System.out.println("Общее количество очков:" + score); // Вывод общего количества очков на экран
    }
}
