import java.util.Scanner;

public class color {
    public static int Kraska(int n, int w, int h) {
        Scanner in = new Scanner(System.in); // Вызов класса сканер
        System.out.println("Введите количество квадратных метров"); // Ввод извне текста
        n = in.nextInt(); // Ввод извне переменной минут
        System.out.println("Введите ширину"); // Ввод извне текста
        w = in.nextInt(); // Ввод извне переменной минут
        System.out.println("Введите высоту"); // Ввод извне текста
        h = in.nextInt(); // Ввод извне переменной минут
        return (int)Math.ceil(n/(w*h));
    }
}
