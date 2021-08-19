package src.tienphan.example;

public class User {
    public String name;

    public User(String name) {
        this.name = name;
    }

    public void sayHello() {
        System.out.println("Hi every one, my name is\t" + this.name);
    }
}
