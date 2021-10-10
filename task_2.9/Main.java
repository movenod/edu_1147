/*
Задание: Дан массив с числами. Проверьте, что в этом массиве есть число 5.
 Если есть - выведите 'да', а если нет - выведите 'нет'.
*/

public class Main {
    public static void main(String[] args) {
        //напишите тут ваш код
        int[] nums = {2, 3, 7, 4, 5, 8, 7};
        int numberX = 5;
        boolean ansv = false;


        for (int i = 0; i < nums.length; i++) {
            if (numberX == nums[i]) {
                ansv = true;
               // break;
            }
        }
        System.out.println(ansv ? "да" : "нет");

    }
}
