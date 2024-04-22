package apr11;

public class AudioPlayer {
    private String[] audioFileNames;
    private int currentTrack;
    private boolean isPlaying;

    public AudioPlayer(String[] audioFileNames) {
        this.audioFileNames = audioFileNames;
        this.currentTrack = 0;
        this.isPlaying = false;
    }

    public void play() {
        if (audioFileNames.length > 0) {
            System.out.println("Now playing: " + audioFileNames[currentTrack]);
            isPlaying = true;
        }
    }

    public void stop() {
        isPlaying = false;
    }

    public void nextTrack() {
        if (audioFileNames.length > 0) {
            currentTrack = (currentTrack + 1) % audioFileNames.length;
            System.out.println("Now playing: " + audioFileNames[currentTrack]);
        }
    }

    public boolean isPlaying() {
        return isPlaying;
    }
}
