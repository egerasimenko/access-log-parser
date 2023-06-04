import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Получаем исходные числа
       System.out.println("Введите первое число:");
	   int number1 = new Scanner(System.in).nextInt();
        System.out.println("Введите второе число:");
        int number2 = new Scanner(System.in).nextInt();
        //Сложение чисел
        int sum = number1+number2;
        //Вывод суммы на экран:
        System.out.println("Сумма чисел:"+sum);
        //Вычитание чисел
        int difference = number1-number2;
        //Вывод разности на экран:
        System.out.println("Разность чисел:"+difference);
        //Умножение чисел
        int product = number1*number2;
        //Вывод произведения на экран:
        System.out.println("Произведение чисел:"+product);
        //Деление чисел
        double quotient = (double) number1/number2;
        //Вывод частного на экран:
        System.out.println("Частное чисел:"+quotient);

    }
}
