/* Задача наполнить корабельный бассейн. Нужно посчитать, сколько литров воды нужно для заполнения бассейна до бортов.
Известно, что бассейн имеет линейные размеры a × b × c, заданные в метрах.
Эти размеры передаются запрашиваются у пользователя. Прграмма должена вывести на экран количество литров воды,
которое нужно для наполнения бассейна.
Пример:
Пользователь даёт числа 25, 5, 2.
Пример вывода:
250000 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число 1: ");
        int num1 = scanner.nextInt();
        System.out.println("Введите число 2: ");
        int num2 = scanner.nextInt();
        System.out.println("Введите число 3: ");
        int num3 = scanner.nextInt();
        int collitrov = num1*num2*num3*1000;
        System.out.println("Для наполнения бассейна нужно " +collitrov+ " литров воды");
    }
}

