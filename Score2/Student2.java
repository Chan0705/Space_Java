package Score2;

import Score.Subject;

// 배열 자료 구조 사용
// - 과목 추가 함수 : addSubject() 정의
public class Student2 {
    private int studentId;
    private String studentName;
    private Subject[] subjects; // 과목배열

    public Student2(int studentId, String studentName){
        this.studentId = studentId;
        this.studentName = studentName;
        subjects = new Subject[10];
    }

    // 과목 추가 메서드
    public void addSubject(String name, int score){
        //과목인스턴스 생성 > 배열에 저장
        Subject subject = new Subject();
        subject.setSubjectName(name);
        subject.setScore(score);
        
        for (int i = 0; i < subjects.length; i++) {
            if(subjects[i] == null){ // 배열 공간이 비어있을 때
                subjects[i] = subject; // 인스턴스를 배열에 저장
                break;
            }
        }
    }
    
    // 학생 정보 출력
    public void showInfo(){
        System.out.println(
                "학번: " + studentId +
                "\n이름: " + studentName);
        // 과목 점수 출력
        for (int i = 0; i < subjects.length; i++) {
            if (subjects[i] != null) { // null값 제외
                System.out.println(
                        subjects[i].getSubjectName() +
                                "점수: " + subjects[i].getScore());
            }
        }
        System.out.println("----------------------"); // 구분선
    }
}
