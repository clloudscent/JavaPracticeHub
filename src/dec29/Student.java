package dec29;

class Student {
    private int id;
    private String name;
    private int mathScore;
    private int koreanScore;
    private int englishScore;

    public Student(int id, String name, int mathScore, int koreanScore, int englishScore){
        this.id = id;
        this.name =name;
        this.mathScore = mathScore;
        this.koreanScore = koreanScore;
        this.englishScore = englishScore;
    }
    public Student(){}

    public int getId(){return id;}
    public String getName(){return name;}
    public int getMathScore(){return mathScore;}
    public int getKoreanScore(){return koreanScore;}
    public int getEnglishScore(){return englishScore;}
    public void setId(int id){this.id = id;}
    public void setName(String name){this.name = name;}
    public void setMathScore(int mathScore){this.mathScore = mathScore;}
    public void setKoreanScore(int koreanScore){this.koreanScore = koreanScore;}
    public void setEnglishScore(int englishScore){this.englishScore = englishScore;}

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", mathScore=" + mathScore +
                ", koreanScore=" + koreanScore +
                ", englishScore=" + englishScore +
                '}';
    }
}
