package pl.student;

public class Main {

    public static void main(String[] args) {
        Person person = new Person("Dawid");
        Greeter greeter = new Greeter();
        System.out.println(greeter.greet(person));
    }
}
