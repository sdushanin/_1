/**
 * Created by Stas on 12.08.2018.
 */
import java.util.Scanner;

public class Base {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Что хотим?: 1 - сложить, 2 - Вычесть, 3 - Умножить, 4 - Разделить");
        //Добавляем новую переменную choose.
        int choose = scanner.nextInt();
        //Делаем выбор, в зависимости от введенных пользователем чисел
        switch (choose) {
            case 1:
                System.out.println("введи первое число");
                // Водим первое число
                double i = scanner.nextDouble();
                // Водим второе число
                System.out.println("введи второе число");
                double a = scanner.nextDouble();
                // Задаем еще одну переменную d
                double d = i + a;
                // Округляем переменную d до 4х знаков после запятой
                System.out.printf("получилось = %.4f", d);
                scanner.close();
                break;
            case 2:
                System.out.println("введи первое число");
                // Водим первое число
                double i1 = scanner.nextDouble();
                // Водим второе число
                System.out.println("вводим второе число");
                double a1 = scanner.nextDouble();
                // Задаем еще одну переменную с1
                double c1 = i1 - a1;
                // Округляем переменную с1 до 4х знаков после запятой
                System.out.printf("получилось = %.4f", c1);
                scanner.close();
                break;
            case 3:
                System.out.println("вводим первое число");
                // Водим первое число
                double i2 = scanner.nextDouble();
                // Водим второе число
                System.out.println("вводим второе число");
                double b2 = scanner.nextDouble();
                // Задаем еще одну переменную ii2
                double ii2 = i2 * b2;
                // Округляем переменную ii2 до 4х знаков после запятой
                System.out.printf("получилось = %.4f", ii2);
                scanner.close();
                break;
            case 4:
                System.out.println("вводим первое число");
                // Водим первое число
                double i3 = scanner.nextDouble();
                // Водим второе число
                System.out.println("вводим второе число");
                double b3 = scanner.nextDouble();
                // Задаем еще одну переменную f3
                double f3 = i3 / b3;
                // Округляем переменную f до 4х знаков после запятой
                System.out.printf("получилось = %.4f", f3);
                scanner.close();
                break;

            default:
                System.out.println("ошибка б..я!!!");
        }
    }
}