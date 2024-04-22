package oct24;

public class StudentLogInfo {
    String name;
    String attendanceDate;
    public StudentLogInfo(){

    }

    public String getName(){
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
}
