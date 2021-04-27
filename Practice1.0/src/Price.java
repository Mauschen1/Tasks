import java.util.Scanner;

public class Price {
    public static boolean Price (boolean P) {
        Scanner in = new Scanner(System.in); // Вызов класса сканер
        System.out.println("Введите число:"); // Ввод извне текста
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int prbl = a * b - c;
        if (prbl>0)
        {
            P = true;
        }
        else {
            P = false;
        }
        return P;
    }
}
