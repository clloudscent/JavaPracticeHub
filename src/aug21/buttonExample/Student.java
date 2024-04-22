package aug21.buttonExample;

public class Student {
    private String name;
    private int age;

    private Teacher homeroomTeacher;

    public void introduceYourHomeRoomTeacher(){
        System.out.println("저희 담임 선생님은 "+this.homeroomTeacher.getName()+"선생닙 입니다.");
    }

}
