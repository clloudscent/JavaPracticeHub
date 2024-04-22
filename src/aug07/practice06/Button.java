package aug07.practice06;

public class Button {
    //정적 중첩 인터페이스
    public static interface ClickListener{
        //추상메소드
        void onClick();
    }
    //필드
    private ClickListener clickListener;

    //메소드
    public void setClickListener(ClickListener clickListener){
        this.clickListener = clickListener;
    }
}
