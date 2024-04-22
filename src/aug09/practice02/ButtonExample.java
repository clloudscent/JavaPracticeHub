package aug09.practice02;



public class ButtonExample {
    public static void main(String[] args) {
        //OK 버튼 객체 생성
        Button btnOk = new Button();

//        btnOk.clickListener = new OKListener();
        btnOk.setClickListener(new OKListener());

//        btnOk.clickListener.onClick();
        btnOk.click();
    }
}
