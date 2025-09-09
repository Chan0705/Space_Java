package Score;

public class Main {
    public static void main(String[] args){
        //인스턴스 생성
        Student woo = new Student(1001, "Woo");

        // 과목 입력
        woo.setKoreanSubject("국어", 80);
        woo.setMathSubject("수학", 67);

        //출력
        woo.showInfo();
    }
}
