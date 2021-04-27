import java.util.Scanner;
public class PointsScore {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); // Вызов класса сканер
        System.out.println("Введите количество бросков на два очка:"); // Вывод текста
        int d = in.nextInt(); // // Ввод извне количесвта 2-х очковых бросков
        System.out.println("Введите количество бросков на три очка:");
        int t = in.nextInt(); // Ввод извне количесвта 3-х очковых бросков
        int score = (d * 2) + (t * 3); // Расчет общего количесвта
        System.out.println("Общее количество очков:" + score); // Вывод общего количества очков на экран
    }
}
