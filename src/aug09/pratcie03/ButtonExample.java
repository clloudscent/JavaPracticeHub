package aug09.pratcie03;


public class ButtonExample {
    public static void main(String[] args) {
        //OK 버튼 객체 생성
        Button btnOk = new Button();

        class OKListener implements Button.ClickListener {
            @Override
            public void onClick(){
                System.out.println("OK 버튼이 눌렸습니다.");
            }

            public OKListener(){

            }
        }

//        btnOk.clickListener = new OKListener();
        btnOk.setClickListener(new OKListener());

//        btnOk.clickListener.onClick();
        btnOk.click();
    }
}
