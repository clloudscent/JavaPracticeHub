package jul26.practice07;

public interface RemoteControl {
    int sum();
    default void setMute(boolean mute){
        if(mute){
            System.out.println("무음 처리 합니다.");
        }
    }
}
