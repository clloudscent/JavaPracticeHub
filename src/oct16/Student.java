package oct16;

public class Student {
    private String name;
    private String attendanceDate;

    public String  getName(){
        return name;
    }
    public String getAttendanceDate(){
        return attendanceDate;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setAttendanceDate(String attendanceDate){
        this.attendanceDate = attendanceDate;
    }

    public Student(String name, String attendanceDate){
        this.name = name;
        this.attendanceDate = attendanceDate;
    }
}
