package sep05.practice;

public class Student {
    String name;
    int mathScore;
    int koreanScore;
    int englishScore;


    public Student(String name, int mathScore, int koreanScore, int englishScore){
        this.name = name;
        this.mathScore = mathScore;
        this.koreanScore = koreanScore;
        this.englishScore = englishScore;
    }

    public String toString(){
        return "[name: "+name+", mathScore: "+mathScore+", koreanScore: "+koreanScore+", englishScore: "+englishScore+"]";
    }
}
