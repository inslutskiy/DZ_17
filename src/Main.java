import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Person> map = new ArrayList<>();
        map.add(new Person("Иван", "Иванов-Петров", 10));
        map.add(new Person("Илья", "Иванов-Петров-Зайцев", 12));
        map.add(new Person("Оля", "Серова-Зайцев", 14));
        map.add(new Person("Ира", "Зайцев", 22));
        map.add(new Person("Ксения", "Львова-Носкова-Нам", 15));

        for (Person person : map) {
            System.out.println(person);
        }

        Collections.sort(map);

        System.out.println("==========================");
        for (Person person : map) {
            System.out.println(person);
        }
    }
}