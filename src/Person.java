public class Person {
    public String name;
    public String surname;
    public int age;
    public String[] surnamel;
    public int surnameLength;

    public Person(String name, String surname, int age){
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.surnamel = surname.split("-");
        this.surnameLength = surnamel.length;
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
    public int getSurnameLength() {
        return surnameLength;
    }
    @Override
    public String toString() {
        return name + " " + surname + " " + age + " лет";
    }
}
