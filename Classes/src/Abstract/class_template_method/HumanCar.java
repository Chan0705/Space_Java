package Abstract.class_template_method;

public class HumanCar extends Car {

    @Override
    public void accel() {
        System.out.println("accelerate");
    }

    @Override
    public void stop() {
        System.out.println("stop");
    }
}
