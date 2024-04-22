package jul10.calendar.gameCharacter;

public enum DayOfWeek {
    MONDAY(1, "월요일"),
    TUESDAY(2, "화요일"),
    WEDNESDAY(3, "수요일"),
    THURSDAY(4, "목요일"),
    FRIDAY(5, "금요일"),
    SATURDAY(6, "토요일"),
    SUNDAY(7, "일요일");

    int intValueOfDay;
    String koreanValueOfDay;

    DayOfWeek(int intValueOfDay, String koreanValueOfDay){
        this.intValueOfDay = intValueOfDay;
        this.koreanValueOfDay = koreanValueOfDay;
    }
}
