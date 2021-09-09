/*Вывести на экран все возможные комбинации слов "Мама", "Мыла", "Раму".
Каждую комбинацию вывести с новой строки. Слова не разделять.
Пример:
МылаРамуМама
РамуМамаМыла
...
Требования:
•	Программа должна выводить текст.
•	Текст в каждой строке должен быть уникален.
•	Должны быть выведены все возможные комбинации. */

public class Main {
    public static void main(String[] args) {

        String s1 = "Мама";
        String s2 = "Мыла";
        String s3 = "Раму";
        System.out.println(s1 + s2 + s3);
        System.out.println(s1 + s3 + s2);
        System.out.println(s2 + s1 + s3);
        System.out.println(s2 + s3 + s1);
        System.out.println(s3 + s1 + s2);
        System.out.println(s3 + s2 + s1);


    }
}
