import java.util.Scanner; // Ссылка на класс Сканер
public class MinToSec {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); // Вызов класса сканер
        System.out.println("Введите количество минут:"); // Ввод извне текста
        int min = in.nextInt(); // Ввод извне переменной минут
        int sec = min * 60; // перевод минут в секунды
        System.out.println("В секундах:" + sec); // Вывод секунд на экран
    }
}
