/*
Создай классы Dog, Cat, Mouse.
Добавь по три поля в каждый класс, на твой выбор.
Создай объекты для героев мультика Том и Джерри.
Так много, как только вспомнишь.
Пример:
Mouse jerryMouse = new Mouse("Jerry", 12 , 5),
где 12 - высота в см,
5 - длина хвоста в см.
Требования:
•	Создай класс Dog.
•	Создай класс Cat.
•	В классе Dog должно быть три переменные.
•	В классе Cat должно быть три переменные.
•	Должен быть создан хотя бы один объект типа Mouse.
•	Должен быть создан хотя бы один объект типа Dog.
•	Должен быть создан хотя бы один объект типа Cat.
*/

public class Main {
    public static void main(String[] args) {
        Mouse jerryMouse = new Mouse("Jerry", 12, 5);
        Mouse muscleMouse = new Mouse("Muscle", 13, 6);
        Cat tomasCat = new Cat("Tom", 60, 30);
        Cat topsyCat = new Cat("Topsy", 32, 13);
        Dog spikeDog = new Dog("Spike", 93, 17);
        Dog tykeDog = new Dog("Tyke", 39, 11);

        System.out.println("- Привет! Я - "+jerryMouse.name+", мышонок. Мой рост - "+ jerryMouse.height+", а длина хвостика - "+ jerryMouse.tail+".");
        System.out.println("- Привет! Я - "+muscleMouse.name+", мышонок, друг "+jerryMouse.name+".  Мой рост - "+ muscleMouse.height+", а длина хвостика - "+ muscleMouse.tail+".");
        System.out.println("- Привет! Я "+tomasCat.name+", кот.  Мой рост - "+ tomasCat.height+", а длина хвоста - "+ tomasCat.tail+".");
        System.out.println("- Привет! Я -"+topsyCat.name+",  котенок. Мой рост - "+ topsyCat.height+", а длина хвоста - "+ topsyCat.tail+".");
        System.out.println("- Привет! Я "+spikeDog.name+" Мой рост "+spikeDog.height+", а длина хвостика "+spikeDog.tail+".");
        System.out.println("- Привет! Я "+tykeDog.name+" Мой рост "+tykeDog.height+", а длина хвостика "+tykeDog.tail+".");


    }
}
class Cat {
    String name;
    int height;
    int tail;

    public Cat(String name, int height, int tail) {
        this.name = name;
        this.height = height;
        this.tail = tail;
    }
}
class Dog {
    String name;
    int height;
    int tail;

    public Dog(String name, int height, int tail) {
        this.name = name;
        this.height = height;
        this.tail = tail;
    }
}
class Mouse {
    String name;
    int height;
    int tail;

    public Mouse(String name, int height, int tail) {
        this.name = name;
        this.height = height;
        this.tail = tail;
    }
}
