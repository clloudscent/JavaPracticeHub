package apr7;

import java.util.Scanner;

public class CalendarConsoleExecutor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calendar calendar = new Calendar();
        while(true){
            String inputString = sc.nextLine();
            if(inputString.equals("=")){
                break;
            }
            calendar.addDateAndEvent(inputString);
        }

        while(true){
            String inputString = sc.nextLine();
            if(inputString.equals("=")){
                break;
            }
            String resultString = calendar.searchEvent(inputString);
            System.out.println(resultString);
        }
    }
}
