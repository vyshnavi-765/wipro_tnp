public class Fruit {
    String name, taste, size;

    // Constructor
    Fruit(String name, String taste, String size) {
        this.name = name;
        this.taste = taste;
        this.size = size;
    }

    void eat() {
        System.out.println(name + " tastes " + taste);
    }

    // Main Method
    public static void main(String[] args) {

        Apple a = new Apple();
        Orange o = new Orange();

        a.eat();
        o.eat();
    }
}

class Apple extends Fruit {

    Apple() {
        super("Apple", "Sweet", "Medium");
    }

    @Override
    void eat() {
        System.out.println(name + " tastes Sweet");
    }
}

class Orange extends Fruit {

    Orange() {
        super("Orange", "Sour", "Medium");
    }

    @Override
    void eat() {
        System.out.println(name + " tastes Sour");
    }
}