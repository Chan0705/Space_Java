package Score;

public class Student {
    private int studentId;
    private String studentName;
    Subject math;
    Subject korean;

    // 멤버변수 가진 생성자
    Student(int studentId, String studentName){
        this.studentId = studentId;
        this.studentName = studentName;
        math = new Subject();
        korean = new Subject();
    }
    
    // 국어점수 설정 메서드
    public void setKoreanSubject(String name, int score) {
        korean.setSubjectName(name);
        korean.setScore(score);
    }

    // 학생 정보 출력 메서드
    public void showInfo(){
        System.out.println(
                "학번: " + studentId +
                "\n이름: " + studentName +
                "\n국어 점수: " + korean.getScore() +
                "\n수학 점수: " + math.getScore()
        );
    }

}
