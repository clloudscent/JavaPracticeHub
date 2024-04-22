package jul10.calendar.gameCharacter;

public class Character {
    int x;
    int y;
    String name;

    public Character(String name){
        this.name = name;
    }


    void move(Direction direction) {
        switch (direction) {
            case 동:
                this.x += 1;
                break;

            case 서:
                this.x -= 1;
                break;

            case 남:
                this.y -= 1;
                break;

            case 북:
                this.y += 1;
                break;
        }
    }
     void move(String direction){
        switch (direction){
            case "동":
                this.x += 1;
                break;

            case "서":
                this.x -= 1;
                break;

            case "남":
                this.y -= 1;
                break;

            case "북":
                this.y +=1;
                break;
        }
    }


}
