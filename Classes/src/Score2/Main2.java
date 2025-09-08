package Score2;

public class Main2 {
    public static void main(String[] args){
        //인스턴스 생성
        Score2.Student2 Ash = new Student2(1003, "Ash");

        // 과목 입력
        Ash.addSubject("국어", 80);
        Ash.addSubject("수학", 67);
        Ash.addSubject("과학", 28);

        //출력
        Ash.showInfo();
    }
}
