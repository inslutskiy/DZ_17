public class Person implements Comparable<Person>{
    private String name;
    private String surname;
    private int age;
    private int surnameLength;

    public Person(String name, String surname, int age){
        this.name = name;
        this.surname = surname;
        this.age = age;
        String[] surname_Length = surname.split("-");
        this.surnameLength = surname_Length.length;
    }

    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }
    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return name + " " + surname + " " + age + " лет";
    }

    @Override
    public int compareTo(Person o) {
        if (surnameLength > o.surnameLength) {
            return -1;
        } else if (surnameLength < o.surnameLength) {
            return 1;
        } else {
            return o.age - age;
        }
    }
}
