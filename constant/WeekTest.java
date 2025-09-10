package constant;

import java.util.Calendar;

enum Week{
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

public class WeekTest {
    public static void main(String[] args){
        // 오늘이 무슨 요일인지
        Week today = null;
        Calendar cal = Calendar.getInstance();
        int week = cal.get(Calendar.DAY_OF_WEEK);

        switch (week){
            case 1:
                today = Week.SUNDAY;
                break;
            case 2:
                today = Week.MONDAY;
                break;
            case 3:
                today = Week.TUESDAY;
                break;
            case 4:
                today = Week.WEDNESDAY;
                break;
            case 5:
                today = Week.THURSDAY;
                break;
            case 6:
                today = Week.FRIDAY;
                break;
            case 7:
                today = Week.SATURDAY;
                break;
            default:
                System.out.println("요일이 없습니다.");
        }
        System.out.println("Today is " + today);
        
        if (today == Week.SUNDAY){
            System.out.println("휴일");
        }else {
            System.out.println("평일");
        }
    }
}
