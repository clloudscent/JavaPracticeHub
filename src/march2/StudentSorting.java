package march2;

import java.util.*;

public class StudentSorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Map<Integer, String> inputStudentMap = new HashMap<>();
        StudentInfo studentInfo = new StudentInfo();
        for(int i=0; i<5; i++){
            System.out.println("학생번호: ");
            int num = sc.nextInt();
            sc.nextLine();
            System.out.println("학생이름: ");
            String name = sc.nextLine();

            inputStudentMap.put(num, name);

        }

        List<String> studentList = new ArrayList<>();
        List<Integer> numList = new ArrayList<>();

        for(Integer currentStudentNum : inputStudentMap.keySet()){
            numList.add(currentStudentNum);
        }

        for(int i =0; i<numList.size()-1; i++){
            for(int j=i+1; j<numList.size(); j++){
                if(numList.get(i)>numList.get(j)){
                    int temp = numList.get(i);
                    numList.set(i,numList.get(j));
                    numList.set(j, temp);
                }
            }
        }

        for(int i=0; i<numList.size(); i++){
//            studentList.add(numList.get(i));
        }
    }
}
