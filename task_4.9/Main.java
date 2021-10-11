/*Исходный код с вебинара https://github.com/vladlen-vozhzhaev/edu_0988/tree/main/30.07.2021
        Задача, доработать код с вебинара
        Составить генеалогическое древо. У вас должно быть 2 бабушки, 2 дедушки, мама, папа, ребёнок.
        Для всех персонажей должен корректно работать метод info()
        На экран должно попасть максимум информации.
        т.е. для ребенка нужно вывести инфо о родителях, а так же о бабушках и дедушках.*/

    public class Main {
        public static void main(String[] args) {
            Person p1 = new Person("Николай", "Петров", 68, null, null);
            Person p2 = new Person("Надежда", "Петрова", 67, null, null);

            Person p3 = new Person("Михаил", "Иванов", 72, null, null);
            Person p4 = new Person("Ольга", "Иванова", 70, null, null);

            Person p5 = new Person("Ирина", "Иванова", 35, p2, p1);
            Person p6 = new Person("Иван", "Иванов", 38, p4, p3);

            Person p7 = new Person("Василий", "Иванов", 12, p5, p6);

            p7.info();
        }
    }

    class Person { // Описание того, как должен выглядеть человек
        String name;
        String lastname;
        int age;
        Person mother;
        Person father;

        Person(String name, String lastname, int age, Person mother, Person father) {
            this.name = name;
            this.lastname = lastname;
            this.age = age;
            this.mother = mother;
            this.father = father;
        }

        void info() {
            String info = "Привет меня зовут " + this + "\n";

            if (mother != null) { // Проверка существования матери
                info += "Мою маму зовут " + mother + "\n";

                if (mother.father != null) { // Проверка существования отца матери (дедушки по маминой линии)
                    info += "Дедушку по маминой линии зовут " + mother.father + "\n";
                }
                if (mother.mother != null) {
                    info += "Бабушку по маминой линии зовут " + mother.mother + "\n";
                }
            }
            if (father != null) {
                info += "Моего папу зовут " + this.father + "\n";
                if (father.father != null) {
                    info += "Дедушку по папиной линии зовут " + father.father + "\n";
                }
                if (father.mother != null) {
                    info += "Бабушку по маминой линии зовут " + father.mother + "\n";
                }
            }
            System.out.println(info);
        }

        @Override
        public String toString() {
            return name + " " + lastname + ", " + age;
        }


        void sayHi(String name) {
            System.out.println("Привет " + name);
        }
    }
