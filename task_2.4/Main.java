/*
Задание: Пользователь вводит сумму вклада и процент, который будет начисляться ежегодно. Отобразить размер вклада поочередно на ближайшие 5 лет.
*/

import java.util.Scanner;

public class Main {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

    System.out.println("ведите начальный размер вклада ");
    double summ = scanner.nextDouble();

    System.out.println("ведите ежегодный процент начисляемый на вклад ");
    double p = scanner.nextDouble(); // процент

    System.out.println("Сумма вклада "+summ+", под "+p+"% годовых");
    for (int i=0; i<5; i++){
        summ = summ + (summ * p/100);
        System.out.println(summ+" за "+(1+i)+ "год");
    }


    }

    }
