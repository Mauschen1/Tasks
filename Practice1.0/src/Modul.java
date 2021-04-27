import java.util.Scanner;

public class Modul {
    public static int Modul (int M){
        Scanner in = new Scanner(System.in); // Вызов класса сканер
        System.out.println("Введите число:"); // Ввод извне текста
        int a = in.nextInt();
        int b = in.nextInt();
        M = a - a/ b * b;
        return M;
    }
}
