package Easy;

public class Human {
    String name;
    int age;
    int weight;
    String address;
    String work;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
        this.weight = 70;
        this.address = null;
        this.work = null;
    }

    public Human(String name, String address) {
        this.name = name;
        this.age = 25;
        this.address = address;
        this.weight = 70;
        this.work = null;
    }

    public Human(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.address = null;
        this.work = null;
    }

    public Human(int age, int weight, String address, String work) {
        this.name = "Vasia";
        this.age = age;
        this.weight = weight;
        this.address = address;
        this.work = work;
    }

    public Human(String name, int age, String work) {
        this.name = name;
        this.age = age;
        this.weight = 70;
        this.address = null;
        this.work = work;
    }
}
