
package Student;

public class Student {
    // 멤버 변수

    int studentId; // 학번
    String studentName; // 아룸
    int studentAge; // 학년

    //생성자 오버라이딩(이름이 같고 매개 변수가 다름)
    //기본 생성자 - 컴파일러 자동 생성
    Student(){}

    // 멤버 변수를 모두 가진 생성자
    Student(int studentId, String studentName, int studentAge) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentAge = studentAge;
    }


    // 학생 정보 출력 메서드
    void displayInfo() {
        System.out.println("학번 " + studentId);
        System.out.println("이름 " + studentName);
        System.out.println("나이 " + studentAge);
    }

}

