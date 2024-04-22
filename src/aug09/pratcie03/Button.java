package aug09.pratcie03;


public class Button {

    private ClickListener clickListener;

    public void setClickListener(ClickListener clickListener){
        this.clickListener = clickListener;
    }

    public void click(){
        this.clickListener.onClick();
    }

    public interface ClickListener {
        void onClick();
    }
}
