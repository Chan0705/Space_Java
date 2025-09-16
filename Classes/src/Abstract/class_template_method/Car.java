package Abstract.class_template_method;

public abstract class Car {

    public abstract void accel(); // 선언만 진행 => 추상메서드
    public abstract void stop(); // 선언만 진행 => 추상메서드

    public void startDrive(){
        System.out.println("주행 시작");
    }

    // 실체메서드
    public void turnOff(){
        System.out.println("주행 종료");
    }

    // 템플릿 메서드 - 일련의 과정(시나리오)을 정의하는 메서드
    public final void drive(){
        startDrive();
        accel();
        stop();
        turnOff();
    }

    public abstract class AiCar {
        public abstract void accel();

        public abstract void stop();

        public void startDrive() {
            System.out.println("주행 시작");
        }

        // 실체메서드
        public void turnOff() {
            System.out.println("주행 종료");
        }

        // 템플릿 메서드 - 일련의 과정(시나리오)을 정의하는 메서드
        public final void drive() {
            startDrive();
            accel();
            stop();
            turnOff();

        }
    }
}
