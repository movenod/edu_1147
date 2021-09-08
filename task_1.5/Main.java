/* Программа запрашивает у пользователя значение в градусах Цельсия. Программа должена переводить температуру и выводить на экран
значение в градусах Фаренгейта.
Температура по Цельсию TC и температура по Фаренгейту TF связаны следующим соотношением:
TF = (9 / 5) * TC + 32
Пример:
на вход подается значение 41.
Пример вывода:
105.8 */

import java.util.Scanner;

public class Main {
public static void main(String[] args) {
System.out.println("Введите температуру в градусах Цельсия:");

  float TF;
  
    Scanner scanner = new Scanner(System.in);
    int TC = scanner.nextInt();
    TF = (9 / 5) * TC + 32;
    System.out.println("Температура по Фаренгейту будет " + TF);

}
