import java.util.*;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Иван", "Иванов-Петров", 10));
        people.add(new Person("Илья", "Иванов-Петров-Зайцев", 12));
        people.add(new Person("Оля", "Серова-Зайцев", 14));
        people.add(new Person("Ира", "Зайцев", 22));
        people.add(new Person("Ксения", "Львова-Носкова-Нам", 15));

        for (Person person : people) {
            System.out.println(person);
        }

        Predicate<Person> predicate = person -> person.age < 18;

        people.removeIf(predicate);

        System.out.println("==========================");
        for (Person person : people) {
            System.out.println(person);
        }
    }
}