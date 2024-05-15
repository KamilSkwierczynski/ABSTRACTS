public class Cat extends Animal implements Moveable {
    String name;

    public Cat(String name) {
        this.name = name;
    }

    @Override
    String getType() {
        return "Cat";
    }

    @Override
    String getName() {
        return name;
    }

    @Override
    public void start() {
        System.out.println("Cat starts!");
    }

    @Override
    public void stop() {
        System.out.println("Cat stopped!");
    }
}