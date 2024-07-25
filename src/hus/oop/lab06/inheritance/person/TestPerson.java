package hus.oop.lab06.inheritance.person;

public class TestPerson {
    public static void main(String[] args) {
        Person person1 = new Student("Hoang", "Ha Noi", "Toan tin", 2004, 2.7);
        System.out.println(person1);

        Person person2 = new Staff("Cao", "Ha Noi", "HUS", 200);
        System.out.println(person2);
    }
}
