package mapPractice;

import java.util.*;

public class SortStudentScore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<StudentVO> sortedList = new ArrayList<>();
        for(int i=0; i<5; i++){
            System.out.print("학생이름: ");
            String name = sc.nextLine();
            System.out.print("학생점수: ");
            int score = sc.nextInt();
            sc.nextLine();
            StudentVO studentVO = new StudentVO();
            studentVO.setScore(score);
            studentVO.setName(name);
            sortedList.add(studentVO);
        }



        /*for(String currentName : tempMap.keySet()){
            StudentVO studentVO = new StudentVO();
            Integer currentScore = tempMap.get(currentName);
            studentVO.setName(currentName);
            studentVO.setScore(currentScore);
            sortedList.add(studentVO);
        }*/

        for(int i=0; i<sortedList.size()-1; i++){
            for(int j=i+1; j<sortedList.size(); j++){
                if(sortedList.get(i).getScore()<sortedList.get(j).getScore()){
                    StudentVO temp = sortedList.get(i);
                    sortedList.set(i, sortedList.get(j));
                    sortedList.set(j, temp);
                }

            }
        }

        for(int i =0; i<sortedList.size(); i++){
//            System.out.println("______________");
            System.out.println(sortedList.get(i).getName()+", "+sortedList.get(i).getScore());
        }

    }
}
