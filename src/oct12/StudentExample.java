package oct12;

public class StudentExample {
    public static void main(String[] args) {
        Student std = new Student();


        std.setId("20231012");
        std.setName("신짱구");
        std.setAge("20");
        std.setMajor("Computer Science");
        std.setAddress("도쿄도 네리마구");

        System.out.println(std);

        Student std2 = new Student()
                .id("20231013")
                .name("홍길동")
                .age("23")
                .major("Computer Science")
                .address("서울시 강남구");

        Student std3 = new Student()
                .id("20231014")
                .name("임꺽정");

        Student std4 = new Student()
                .id("20231015")
                .address("인천시 연수구");
    }
}
