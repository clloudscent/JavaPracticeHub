package aug22;

import aug21.buttonExample.Button;

public class ButtonExample {
    public static void main(String[] args) {
        //Ok 버튼 객체 생성
        Button btnOk = new Button();

        //OK 버튼 객체에 ClickListener 구현 객체 주입
        btnOk.setListener(new Button.ClickListener(){
            @Override
            public void onClick(){
                System.out.println("OK 버튼을 클릭했습니다.");
            }
        });

        //Cancel 버튼 객체 생성
        Button btnCancel = new Button();

        //Cancel 버튼 객체에 ClickListener 구현 객체 주입
        btnCancel.setListener(new Button.ClickListener(){
            @Override
            public void onClick(){
                System.out.println("Cancel 버튼을 클릭했습니다.");
            }
        });

        //Cancel 버튼 클릭하기
        btnCancel.click();
    }
}
