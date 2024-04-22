package feb13;

import Dec21.DiaryVO;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Process {
    public static void main(String[] args) throws Exception {


        String url = "jdbc:mysql://localhost:3306/practice";
        String id = "airplane";
        String pw = "airplane1234";

        DAO dao = new DAO(url, id, pw);
        List<PetVO> petVOList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("id: ");
        String inputId = sc.nextLine();
        System.out.println("pw: ");
        String inputPw = sc.nextLine();


        if (!dao.login(inputId, inputPw)) {
            System.exit(0);
        }

        boolean runnable = true;

        while (runnable) {
            System.out.println("1.반려동물등록");
            System.out.println("2.진료기록표불러오기");
            System.out.println("3.진료기록표수정");
            System.out.println("4.진료기록표삭제");
            System.out.println("5.exit");
            System.out.println(">>");
            int inputNum = sc.nextInt();
            sc.nextLine();


            switch (inputNum) {
                case 1:
                    System.out.println("id: ");
                    String petId = sc.nextLine();
                    System.out.println("반려동물이름: ");
                    String name = sc.nextLine();
                    System.out.println("병명: ");
                    String nameOfDisease = sc.nextLine();
                    String today = LocalDate.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
                    System.out.println("반려동물종류: ");
                    String petType = sc.nextLine();
                    System.out.println("담당의사: ");
                    String doctor = sc.nextLine();
                    PetVO petVO = new PetVO(petId, name, nameOfDisease, today, today, petType, doctor);
                    dao.create(petVO);
                    break;

                case 2:
                    List<PetVO> readList = dao.read(inputId);
                    for(PetVO currentPetVO : readList){
                        System.out.print("id: ");
                        System.out.println(currentPetVO.getId());
                        System.out.print("반려동물이름: ");
                        System.out.println(currentPetVO.getName());
                        System.out.print("병명");
                        System.out.println(currentPetVO.getNameOfDisease());
                        System.out.print("등록일: ");
                        System.out.println(currentPetVO.getEnrolledDate());
                        System.out.print("진료일: ");
                        System.out.println(currentPetVO.getDateOfCare());
                        System.out.print("종류: ");
                        System.out.println(currentPetVO.getPetType());
                        System.out.print("담당의: ");
                        System.out.println(currentPetVO.getDoctor());
                        System.out.println("___________________");
                    }
                    break;

                case 3:
                List<PetVO> readListForUpdate = new ArrayList<>();

                for(PetVO currentPetVO : readListForUpdate){
                    System.out.print("id: ");
                    System.out.println(currentPetVO.getId());
                    System.out.print("반려동물이름: ");
                    System.out.println(currentPetVO.getName());
                    System.out.print("병명");
                    System.out.println(currentPetVO.getNameOfDisease());
                    System.out.print("등록일: ");
                    System.out.println(currentPetVO.getEnrolledDate());
                    System.out.print("진료일: ");
                    System.out.println(currentPetVO.getDateOfCare());
                    System.out.print("종류: ");
                    System.out.println(currentPetVO.getPetType());
                    System.out.print("담당의: ");
                    System.out.println(currentPetVO.getDoctor());
                    System.out.println("___________________");
                }

                System.out.println("수정할 id:");
                String updateId = sc.nextLine();
                System.out.println("병명수정(혹은 완치) :");
                String updateDisease = sc.nextLine();
                String updateDate = LocalDate.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));

                PetVO petVO1 = new PetVO(updateId, updateDisease, updateDate);
                dao.update(petVO1);
                break;
            }
        }
    }
}
