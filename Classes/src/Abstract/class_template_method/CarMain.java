package Abstract.class_template_method;

public class CarMain {
    public static void main(String[] args) {
        System.out.println("riding duel acceleration");
        Car hisCar = new HumanCar();
        hisCar.drive();

        System.out.println("--------------");

        System.out.println("AI Car is going");
        Car myCar = new AiCar();
        myCar.drive();

    }
}
