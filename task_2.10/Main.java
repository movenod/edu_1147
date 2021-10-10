/*
Задание: Дан массив с числами. Проверьте, есть ли в нем два одинаковых числа подряд. Если есть - выведите 'да', а если нет - выведите 'нет'.
*/


public class Main {
    public static void main(String[] args) {
        //напишите тут ваш код
        int[] nums = {2, 3, 7, 4, 4, 8, 7};
        // int numberX = 5;
        boolean ansv = false;


        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i] == nums[i+1]) {
                ansv = true;
               // break;
            }
        }
        System.out.println(ansv ? "да" : "нет");

    }
}
