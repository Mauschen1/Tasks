import java.util.Scanner;

public class FPS {
    public static int FPS (int FPS){
        Scanner in = new Scanner(System.in); // Вызов класса сканер
        System.out.println("Введите количество квадратных метров"); // Ввод извне текста
        int a = in.nextInt(); // Ввод извне переменной минут
        int b = in.nextInt(); // Ввод извне переменной минут
        FPS = a*b*60;
        return FPS;
    }
}
