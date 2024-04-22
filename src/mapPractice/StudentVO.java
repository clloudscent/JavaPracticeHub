package mapPractice;

import java.util.ArrayList;
import java.util.List;

public class StudentVO {
    private String name;
    private int score;
    private List<String> nameList = new ArrayList<>();

    public String getName(){return name;}
    public int getScore(){return score;}
    public void setName(String name){this.name = name;}
    public void setScore(int score){this.score = score;}
    public void setNameList(List<String> nameList){this.nameList = nameList;}
}
