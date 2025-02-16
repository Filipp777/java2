package domain;

public class Main {
    public static void main(String[] args) {
        Role role = new Role(1L, "Manager");
        Person person = new Person(1L, "John", "Doe", "123456789", "john.doe@example.com", 1L, role);

        System.out.println(role);
        System.out.println(person);
    }
}