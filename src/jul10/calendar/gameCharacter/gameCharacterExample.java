package jul10.calendar.gameCharacter;

import assignment.Student;

import java.util.Scanner;

public class gameCharacterExample {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("캐릭터 명:");
        String name = sc.nextLine();
        Character character = new Character(name);

        System.out.println(character.name);
        Student std = new Student("홍길동", 13, 6);
        Student std2 = new Student("Gildong Hong", 13, 6);

        while(true) {
            System.out.print("이동방향:");
            String directionString = sc.nextLine();
            Direction direction;
            try {
                direction = Direction.valueOf(directionString);
            }catch(Exception e){
                continue;
            }
            character.move(direction);
            System.out.println(name + "님의 현재 위치:" + "(x,y)" + "(" + character.x + "," + character.y + ")");
        }


    }
}
