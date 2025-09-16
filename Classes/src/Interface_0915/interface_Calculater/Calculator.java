package Interface_0915.interface_Calculater;

// Interface => 설계도 역할을 하는 추상 자료형(data type)
// Interface의 모든 메서드는 추상형 메서드 => 선언만 존재, 구현은 미존재

public interface Calculator {

    // 추상 메서드 선언
    int add(int n1, int n2);
    int subtract(int n1, int n2);
    int multiply(int n1, int n2);
    int divide(int n1, int n2);

}
