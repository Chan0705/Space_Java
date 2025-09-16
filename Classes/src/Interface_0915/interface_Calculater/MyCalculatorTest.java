package Interface_0915.interface_Calculater;

import java.nio.channels.ScatteringByteChannel;

public class MyCalculatorTest {

    public static void main(String[] args) {
        //MyCalculator 인스턴스 생성
        MyCalculator calc = new MyCalculator();

        try {
            int num1 = 10, num2 = 100;

            System.out.println(calc.add(num1, num2)); // 110
            System.out.println(calc.subtract(num1, num2)); // -90
            System.out.println(calc.multiply(num1, num2)); // 1,000
            System.out.println(calc.divide(num1, num2)); // 0
        } catch(ArithmeticException e){
            System.out.println("예외 발생" + e.getMessage());
        }
    }
}
