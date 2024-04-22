package jul11.human;

import jul11.human.Korean;

public class Student extends Korean {
    private static Teacher teacher = new Teacher();

    String grade;

    int age;

   public static Teacher getHomeRoomTeacher(){
       return teacher;
   }
}
