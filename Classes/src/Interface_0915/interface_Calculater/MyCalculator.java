package Interface_0915.interface_Calculater;

// Interface 구현

public class MyCalculator implements Calculator {

    // +
    @Override
    public int add(int n1, int n2) {
        return n1 + n2;
    }

    // -
    @Override
    public int subtract(int n1, int n2) {
        return n1 - n2;
    }

    // *
    @Override
    public int multiply(int n1, int n2) {
        return n1 * n2;
    }

    // ÷
    @Override
    public int divide(int n1, int n2) {
        if(n2 == 0)
            throw new ArithmeticException("0으로 나눌수가 없습니다");
        return n1 / n2;
    }

}
