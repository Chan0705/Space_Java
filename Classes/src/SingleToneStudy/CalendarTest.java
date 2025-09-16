package SingleToneStudy;

// Java util 패키지(import 필수)에 잇는 Calender
//  Calender -> 날짜 및 시간 관련 메서드를 자체적으로 갖고 있음
// Static 메서드기 때문에 new가 아니라 class 이름으로 직접 접근해야함

import java.util.Calendar;

public class CalendarTest {

    public static void main(String[] args) {
        // Calender 인스턴스 생성
        Calendar cal = Calendar.getInstance();

        System.out.println(cal); // 객체 정보를 문자열로 표현

        System.out.println("----------------");

        // 현재 날짜와 시간을 출력하기 - getTime()
        System.out.println(cal.getTime()); // Tue Sep 09 12:16:02 KST 2025 ; 2025-09-09 12:16:02 화요일

        System.out.println("----------------");

        // 날짜 - 년 월 일 - get();
        int year = cal.get(Calendar.YEAR); // 상수 표기 - final static int YEAR
        System.out.println(year);

        int month = cal.get(Calendar.MONTH) +1; // month는 배열이기 때문에 +1을 해야 됨
        System.out.println(month);

        int date = cal.get(Calendar.DATE);
        System.out.println(date);

        System.out.println("----------------");

        System.out.println(year + "년 " +  month + "월 " + date + "일 ");

        System.out.println("----------------");

        //시간
        int hour = cal.get(Calendar.HOUR_OF_DAY); // 24시간 형식으로 시간을 가져옴
        int minute = cal.get(Calendar.MINUTE);
        int second = cal.get(Calendar.SECOND);

        System.out.println(hour + ": " + minute + ": " + second);

        System.out.println("----------------");

        // 요일
        int day = cal.get(Calendar.DAY_OF_WEEK);
        // DAY_OF_WEEK는 1(일요일)부터 시작함
        // 1 일 2 월 3 화 4 수 5 목 6 금 7 토
        System.out.println(day); // 3(수)

        String[] days = {
                "일요일", "월요일", "화요일", "수요일", "목요일", "금요일", "토요일"
        };
        System.out.println("오늘은 " + days[day-1] + "요일이다.");

    }
}
