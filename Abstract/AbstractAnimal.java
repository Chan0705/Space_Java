package Abstract;

// 추상메서드 - 공통적인 특성 선언 클래스
// 추상메서드 선언 후, 상속받는 클래스에서 반드시 사용해야함

public abstract class AbstractAnimal {

    public void breath(){
        System.out.println("숨");
    }

    // 추상메서드, 구현부 없음
    public abstract void cry();
    
}
