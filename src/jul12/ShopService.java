package jul12;

public class ShopService {
    private static ShopService singleton = new ShopService();

    //외부에서 ShopService클래스의 객체를 아예 못만들도록 생성자를 private으로 만들어둠.
    private ShopService() {

    }

    //정적 필드인 singleton필드에 담겨있는 ShopService객체를 리턴해주는 메소드
    public static ShopService getInstance() {
        return singleton;
    }

}
