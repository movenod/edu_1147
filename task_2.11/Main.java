/*
Задание: Дан массив с числами. Узнайте сколько элементов с начала массива надо сложить,
 чтобы в сумме получилось больше 10-ти.
*/


public class Main {
    public static void main(String[] args) {
        //напишите тут ваш код
        int[] nums = {1, 1, 1, 1, 1, 1, 1, 1, 2, 1};
        int sum = 0;
        int a = 0;


        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
            if (sum < 10) {a=a+1;
                // break;
                            }
                }
        System.out.println(" Нужно сложить элементов, чтобы было больше 10-и  " +(a+1));

    }
}
