package jul6;

public class CarExample {
    public static void main(String[] args) {
        CarOriginal myCarOriginal = new CarOriginal();

        System.out.println("제작회사: "+ myCarOriginal.company);
        System.out.println("모델명: "+ myCarOriginal.model);
        System.out.println("색깔: "+ myCarOriginal.color);
        System.out.println("최고속도: "+ myCarOriginal.maxSpeed);
        System.out.println("현재속도: "+ myCarOriginal.speed);

        //car 객체의 필드값 변경
        myCarOriginal.speed = 60;
        System.out.println("수정된 속도: "+ myCarOriginal.speed);
    }
}
