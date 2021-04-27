import java.util.Scanner;
public class TrueFalse {
    public static boolean main(String[] args) {
        Scanner in = new Scanner(System.in); // Вызов класса сканер
        System.out.println("Введите число:"); // Вывод текста
        boolean znach; // определение переменной
        int chislo = in.nextInt(); // // Ввод с консоли побед
        if (chislo % 5 == 0) // условие проверки
             {
            znach = true; // значение принимает true
        } else {
            znach = false;
        }
        return znach;
    }
}
