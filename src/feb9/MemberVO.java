package feb9;

public class MemberVO {
    private String telId;
    private String name;
    private int currentPoint;
    private int totalPoint;
    private String grade;
    private String adminId;

    public MemberVO(String telId, String name, int currentPoint, int totalPoint, String grade, String admin) {
        this.telId = telId;
        this.name = name;
        this.currentPoint = currentPoint;
        this.totalPoint = totalPoint;
        this.grade = grade;
        this.adminId = admin;
    }

    public MemberVO() {

    }

    public MemberVO(String telId, String name, String inputId) {
        this.telId = telId;
        this.name = name;
        this.adminId = inputId;
    }

    public MemberVO(String updateTelId, String updateName) {
        this.telId = updateTelId;
        this.name = updateName;
    }


    public String getTelId() {
        return telId;
    }

    public String getName() {
        return name;
    }

    public int getCurrentPoint() {
        return currentPoint;
    }

    public int getTotalPoint() {
        return totalPoint;
    }

    public String getGrade() {
        return grade;
    }

    public String getAdminId() {
        return adminId;
    }

    public void setTelId(String telId) {
        this.telId = telId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCurrentPoint(int currentPoint) {
        this.currentPoint = currentPoint;
    }

    public void setTotalPoint(int totalPoint) {
        this.totalPoint = totalPoint;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public void setAdminId(String adminId) {
        this.adminId = adminId;
    }

    @Override
    public String toString() {
        return "MemberVO{" +
                "telId='" + telId + '\'' +
                ", name='" + name + '\'' +
                ", currentPoint=" + currentPoint +
                ", totalPoint=" + totalPoint +
                ", grade='" + grade + '\'' +
                ", adminId='" + adminId + '\'' +
                '}';
    }
}

