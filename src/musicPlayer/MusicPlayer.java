package musicPlayer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MusicPlayer {
    private int volume;
    private String currentSong;
    private List<String> songList;
    private int button;


    public List<String> inputSong(String songName){
        System.out.println("곡추가하기");
        System.out.print("추가할 곡: "+songName);
        List<String> songList = new ArrayList<>();
        songList.add(songName);
        System.out.println("곡이 추가되었습니다.");
        return songList;
    }

    public void playerView(){
        System.out.print("현재곡: ");
        System.out.println(currentSong);
        System.out.println("이전(3) 일시정지() 정지() 다음(4)");

    }



    public int controlVolume(int button){
        if(button==2){
            volume++;
        }else if(button==1){
            volume--;
        }else if(button==0){
            volume=0;
        }
        return volume;
    }

    public int controlPlayer(int button){
        int counter = songList.size();
        int currentPlaylistCount = 0;
        String currentSong = "";
        if(button==3){
            //button 3번은 << 이전곡
            //플레이리스트 첫곡에서 이전 곡을 누르면 가장 마지막 플레이리스트에 있는 곡이 재생 (3곡) ...1>2>3>1>2>3...
            if(currentPlaylistCount==0){
                currentPlaylistCount = counter;
            }
        }else if(button==4){
            if(currentPlaylistCount==counter){
                currentPlaylistCount=1;
            }else{
                currentPlaylistCount++;
            }
        }else if(button==5){
            System.out.println("일시정지");
        }else if(button==6){
            currentPlaylistCount=0;
        }
        return currentPlaylistCount;
    }


}

