package Abstract;

public class AnimalTest {
    public static void main(String[] args) {
//        Cat cat = new Cat();
//        cat.breath();
//        cat.cry();
//
//        System.out.println("--------------");
//
//        Dog dog = new Dog();
//        dog.breath();
//        dog.cry();

        // 부모형으로 인스턴스 생성 - 다형성
        AbstractAnimal cat = new Cat();
        AbstractAnimal dog = new Dog();

        cat.cry();
        dog.cry();

        System.out.println("--------------");

        // 메서드의 다형성
        animalCry(new Cat());
        animalCry(new Dog());

    }
    public static void animalCry(AbstractAnimal animal){
        animal.cry();
    }
}
