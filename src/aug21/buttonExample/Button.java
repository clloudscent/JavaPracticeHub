package aug21.buttonExample;

public class Button {
    //정적 멤버 인터페이스
    public interface ClickListener{
        //추상메소드
        void onClick();
    }

    //필드
    private ClickListener listener;

    //메소드
    public void setListener(ClickListener listener){
        this.listener = listener;
    }

    public void click(){
        this.listener.onClick();
    }
}
