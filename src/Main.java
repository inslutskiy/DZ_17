import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Иван", "Иванов-Петров", 10));
        people.add(new Person("Илья", "Иванов-Петров-Зайцев", 12));
        people.add(new Person("Оля", "Серова-Зайцев", 14));
        people.add(new Person("Ира", "Зайцев", 22));
        people.add(new Person("Ксения", "Львова-Носкова-Нам", 15));

        for (int i = 0; i < people.size(); i++) {
            System.out.println(people.get(i));
        }



        Comparator<Person> comparator = (Person o1 , Person o2) -> {
            if (o1.surnameLength > o2.surnameLength) {
                return -1;
            } else if (o2.surnameLength < o1.surnameLength) {
                return 1;
            } else {
                return o2.age - o1.age;
            }
        };

        Collections.sort(people, comparator);

        System.out.println("==========================");
        for (int i = 0; i < people.size(); i++) {
            System.out.println(people.get(i));
        }
    }

}