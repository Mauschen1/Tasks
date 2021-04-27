import java.util.Scanner;

public class Challenge {
        public static int squaed (int a){
       Scanner in = new Scanner(System.in); // Вызов класса сканер
       System.out.println("Введите число:"); // Ввод извне текста
       a = in.nextInt();
       int i = a * a;
       return i;
        }
    }
