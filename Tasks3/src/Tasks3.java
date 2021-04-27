import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Arrays;
import static java.lang.Math.*;
import static java.lang.System.*;
public class Tasks3 {
    // Задача № 1 Города милионники
    public static String[][] millionsRounding(String[]... a)
    {
        for(int i=0; i<a.length; i++)
        {
            BigDecimal r=new BigDecimal(a[i][1]);
            r=r.divide(new BigDecimal("1000000")).setScale(0, RoundingMode.HALF_UP);
            a[i][1]=r.toString()+"000000";
        }
        return a;
    }
    // Задача № 2 Треугольник
    public static double[] otherSides(double a)
    {
        double[] str=new double[2];
        str[0]= 2 * a;//нахождение гипотенузы
        str[1]=a * sqrt(3);//находжение второго катета
        //округление до двух знаков после запятой
        str[0]=ceil(str[0] * 100) / 100;
        str[1]=ceil(str[1] * 100) / 100;
        return str;
    }
    // Задача № 3 Камень, ножницы, бумага
    public static String rps(String p1, String p2)
    {
        if((p1.equals("paper") || p1.equals("rock") || p1.equals("scissors")) && (p2.equals("paper")  || p2.equals("rock")  || p2.equals("scissors")))
        {
            if (p1.equals(p2))
                return "TIE";
            else if((p1.equals("paper") && p2.equals("rock")) || (p1.equals("rock") && p2.equals("scissors")) || (p1.equals("scissors") && p2.equals("paper")))
                return "Player 1 wins";
            else
                return "Player 2 wins";
        }
        else
        {
            return "None";
        }
    }
    // Задача № 4 Четные, нечетные числа
    public static int warOfNumbers(int... numbers)
    {
        int even=0;//четные
        int odd=0;//нечетные
        for (int num : numbers)
        {
            if(num%2==0)
            {
                even=even+num;
            }
            else
            {
                odd=odd+num;
            }
        }
        return abs(even-odd);
    }
    // Задача № 5 Буквы
    public static String reverseCase(String str)
    {
        String reverse="";
        for(int i=0; i<str.length(); i++)
        {
            if(Character.isUpperCase(str.charAt(i)))
                reverse=reverse+(char)(str.charAt(i)+32);
            else
                reverse=reverse+(char)(str.charAt(i)-32);
        }
        return reverse;
    }
    // Задача №6 Строки
    public static String inatorInator(String str)
    {
        int len=str.length();
        String a=""+str.charAt(len-1);
        if (a.matches("[aAeEiIoOuUyY]"))
            str=str+"-инатор";
        else
            str=str+"инатор";
        return str+" "+String.valueOf(len*1000);
    }
    // Задача №7 Кирпич
    public static boolean doesBrickFit(int a,int b, int c, int w, int h)
    {
        if(((a>h || a>w) && (b>h || b>w)) || ((c>h || c>w) && (b>h || b>w)) || ((c>h || c>w) && (a>h || a>w)))
            return false;
        return true;
    }
    // Задача №8 Расстрояние
    public static double totalDistance(double obtp, double cons, int pass, boolean cond)
    {
        cons=cons+cons*0.05*pass;
        if (cond)
            cons=cons+cons*0.1;
        return ceil((obtp/cons)*10000)/100;
    }
    // Задача №9 Среднее массива
    public static double mean(int[] a)
    {
        int sum=0;
        for (int i : a) {
            sum=sum+i;
        }
        return ceil((((double) sum/a.length))*100)/100;
    }
    // Задача №10 Четноть суммы
    public static boolean parityAnalysis(int a)
    {
        int sum=0;
        int s=a;
        while(s/10>0)
        {
            sum=sum+s%10;
            s=s/10;
        }
        sum=sum+s;
        out.println(sum);
        if(a%2==sum%2)
            return true;
        else
            return false;
    }
    public static void main(String[] args)
    {
        out.println(Arrays.deepToString(millionsRounding(new String[] {"Париж", "2148327"},new String[] {"Лондон", "8908081"})));
        out.println(Arrays.toString(otherSides(20.5)));
        out.println(rps("rock", "scissors"));
        out.println(warOfNumbers(10, 15, 20, 25));
        out.println(reverseCase("aaaaBBBBAAAAbbbb"));
        out.println(inatorInator("Капуч"));
        out.println(doesBrickFit(15, 10, 10, 25, 30));
        out.println(totalDistance(80.0, 5.0, 0, false));
        out.println(mean(new int[] {10, 0, 5, 4, 11, 26, 28, 14, 9, 7, 15}));
        out.println(parityAnalysis(157));
    }
}
