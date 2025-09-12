package Abstract;

public class AnimalTest {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.breath();
        cat.cry();

        System.out.println("--------------");

        Dog dog = new Dog();
        dog.breath();
        dog.cry();
    }
}
