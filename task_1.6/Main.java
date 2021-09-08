import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите любое число:");


        Scanner scanner = new Scanner(System.in);
        float fA = scanner.nextFloat();
        fA = fA + (fA * 15 / 100);
        System.out.println("Значение числа, увеличенное на 15% равно " + fA);

    }
}
