import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by Андрей on 05.09.2016.
 */
public class Calk {
    public static void main(String arg[]) {
        System.out.println("Приложение калькулятор выполняет следуюшие математические действия:");
        System.out.println("/ - Деление");
        System.out.println("* - Умножение");
        System.out.println("- - Вычитание");
        System.out.println("+ - Сложение");
        System.out.println("sqrt - Вычисление квадратного корня числа");

        Double a = null;
        String deistvie = null;


//Чтение первого числа
        while (a == null) {
            a = chtenieDouble();
        }
//Чтение математического действия и решение примера
// Цикл не завершится пока не будет введено действие удовлетворяющее условию
        while (deistvie == null) {
            System.out.println("Введите математическое действие (/,*,-,+,sqrt)");
            deistvie = viborDeistvia(a);
        }


    }

    // Метод чтения действительного числа
    static Double chtenieDouble() {
        Scanner sc = new Scanner(System.in);
        Double a1 = null;
        System.out.println("Введите число");
        try {
            a1 = sc.nextDouble();
            /* Ловим ошибку неправильного ввода действительного числа,
             если ввод неправильный, программа предложит еще раз ввести аргумент */
        } catch (InputMismatchException e) {
            System.out.println("Ошибка! Введите действительное число");
            a1 = null;
        }
        return a1;
    }

    //Метод чтения математического действия и решения примера с выводом результата на экран
    static String viborDeistvia(Double a) {
        Scanner sc = new Scanner(System.in);
        double b;
        String deistvie = null;
        deistvie = sc.nextLine();

        if (deistvie.equals("/")) {
            System.out.println("Действие деления");
            b = chtenieDouble();
            if (b == 0) {
                System.out.println("Деление на ноль");
                return null;
            }
            System.out.println("Результат равен " + a / b);
            return "ss";// Возвращение значения отличного от null для завершения цикла While метода main

        } else if (deistvie.equals("*")) {
            System.out.println("Действие умножения");
            b = chtenieDouble();
            System.out.println("Результат равен " + a * b);
            return "ss";
        } else if (deistvie.equals("+")) {
            System.out.println("Действие Сложения");
            b = chtenieDouble();
            System.out.println("Результат равен " + (a + b));
            return "ss";
        } else if (deistvie.equals("-")) {
            System.out.println("Действие Вычитания");
            b = chtenieDouble();
            System.out.println("Результат равен " + (a - b));
            return "ss";
        } else if (deistvie.equals("sqrt")) {
            System.out.println("Вычисление квадратного корня");
            try {
                System.out.println("Результат равен " + Math.sqrt(a));
                return "ss";
            } catch (ArithmeticException e) {
                System.out.println("Ввели отрицательное число");
                return null;
            }
        }
        System.out.println("Неправильно введено действие");
        return null;
    }
}












