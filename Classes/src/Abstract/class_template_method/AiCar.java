package Abstract.class_template_method;

public class AiCar extends Car {

    @Override
    public void accel() {
        System.out.println("AI accelerate");
    }

    @Override
    public void stop() {
        System.out.println("AI stop");
    }
}
