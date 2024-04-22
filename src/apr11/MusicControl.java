package apr11;

import java.util.Scanner;

public class MusicControl {
    private AudioPlayer audioPlayer;

    public MusicControl(String[] audioFileNames) {
        this.audioPlayer = new AudioPlayer(audioFileNames);
    }

    public void playMusic() {
        audioPlayer.play();
    }

    public void stopMusic() {
        audioPlayer.stop();
    }

    public void playNextTrack() {
        audioPlayer.nextTrack();
    }

    public boolean isMusicPlaying() {
        return audioPlayer.isPlaying();
    }

    public static void main(String[] args) {
        String[] audioFileNames = {"Jazz.mp3", "BossaNova.mp3", "Classic.mp3"};
        MusicControl musicControl = new MusicControl(audioFileNames);
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("플레이: p");
            System.out.println("정지: s");
            System.out.println("다음: n");
            System.out.println("나가기: q");
            String userInput = scanner.nextLine();

            if (userInput.equals("p")) {
                musicControl.playMusic();
            } else if (userInput.equals("s")) {
                musicControl.stopMusic();
            } else if (userInput.equals("n")) {
                musicControl.playNextTrack();
            } else if (userInput.equals("q")) {
                break;
            } else {
                System.out.println("잘못된 입력");
            }

            if (musicControl.isMusicPlaying()) {
                System.out.println("음악재생중: ");
            } else {
                System.out.println("정지");
            }
        }

        scanner.close();
    }


}
