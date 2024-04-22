package customerManage;

import Dec21.DiaryProcessor;
import Dec21.DiaryVO;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Process {
    public static void main(String[] args) throws Exception {
        String url  = "jdbc:mysql://localhost:3306/practice";
        String id = "airplane";
        String pw = "airplane1234";

        DAO dao = new DAO(url, id, pw);
        DiaryVO diaryVO = new DiaryVO();
        DiaryProcessor dp = new DiaryProcessor();
        List<DiaryVO> diaryVOList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        String today = LocalDate.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));




        System.out.println("id: ");
        String inputId = sc.nextLine();
        System.out.println("pw: ");
        String inputPw = sc.nextLine();


        if(!dao.logIn(inputId, inputPw)){
            System.exit(0);
        }

        boolean runnable  =true;
        while(runnable) {
            System.out.println("1.회원등록");
            System.out.println("2. 회원목록조회");
            System.out.println("3.회원구매등록");
            System.out.println("4.회원구매액수정");
            System.out.println("5.회원삭제");
            System.out.println("6.exit");
            System.out.println(">>");
            int inputNum = sc.nextInt();
            sc.nextLine();
            switch (inputNum) {
                case 1:
                    System.out.println("고객등록");
                    System.out.print("고객번호: ");
                    String customerId = sc.nextLine();
                    System.out.print("고객명: ");
                    String customerName = sc.nextLine();

                    CustomerVO customerVO = new CustomerVO(customerId, customerName, today, inputId);
                    dao.inputCustomer(customerVO);
                    System.out.println("고객이 등록되었습니다.");
                    break;


                case 2:
                    List<CustomerVO> customerList = dao.viewCustomer(inputId);
                    for(int i =0; i<customerList.size(); i++){
                        System.out.print("회원id: ");
                        System.out.println(customerList.get(i).getId());
                        System.out.print("회원이름: ");
                        System.out.println(customerList.get(i).getName());
                        System.out.print("회원등급: ");
                        System.out.println(customerList.get(i).getGrade());
                        System.out.print("구매금액: ");
                        System.out.println(customerList.get(i).getPurchase());
                        System.out.print("업데이트 날짜: ");
                        System.out.println(customerList.get(i).getUpdatedDate(today));
                        System.out.println("___________________");
                    }
                    break;



                case 3:
                    System.out.println("구매액 등록");
                    System.out.print("구매고객ID: ");
                    String purchaseID = sc.nextLine();
                    System.out.println("구매금액입력:");
                    int purchaseAmount = sc.nextInt();
                    CustomerVO purchase = new CustomerVO(purchaseID, purchaseAmount, today);
                    dao.inputPurchase(purchase, Integer.valueOf(purchaseID));
                    System.out.println("구매 금액 저장완료");
                    break;

                case 4:
                    List<CustomerVO> customerList2 = dao.viewCustomer(inputId);
                    for(int i =0; i<customerList2.size(); i++){
                        System.out.print("회원id: ");
                        System.out.println(customerList2.get(i).getId());
                        System.out.print("회원이름: ");
                        System.out.println(customerList2.get(i).getName());
                        System.out.print("회원등급: ");
                        System.out.println(customerList2.get(i).getGrade());
                        System.out.print("구매금액: ");
                        System.out.println(customerList2.get(i).getPurchase());
                        System.out.print("업데이트 날짜: ");
                        System.out.println(customerList2.get(i).getUpdatedDate(today));
                        System.out.println("___________________");
                    }

                    System.out.println("회원구매액수정");
                    System.out.print("ID: ");
                    String updateInputId = sc.nextLine();
                    System.out.println("<<<<<"+updateInputId+"ID 구매 정보 수정>>>>>");
                    int updateAmountOfPurchase = sc.nextInt();
                    //여기서 날짜 추가할 때, 어제 매개변수 타입 중복으로 생성자가 중복되었을 때 하는 방법
                    CustomerVO update = new CustomerVO(updateInputId, updateAmountOfPurchase);
                    update.getUpdatedDate(today);

                    dao.updateCustomerBalance(update, Integer.valueOf(updateInputId));
                    System.out.println("수정완료!");
                    break;

                case 5:
                    List<CustomerVO> customerList3 = dao.viewCustomer(inputId);
                    for(int i =0; i<customerList3.size(); i++){
                        System.out.print("회원id: ");
                        System.out.println(customerList3.get(i).getId());
                        System.out.print("회원이름: ");
                        System.out.println(customerList3.get(i).getName());
                        System.out.print("회원등급: ");
                        System.out.println(customerList3.get(i).getGrade());
                        System.out.print("구매금액: ");
                        System.out.println(customerList3.get(i).getPurchase());
                        System.out.print("업데이트 날짜: ");
                        System.out.println(customerList3.get(i).getUpdatedDate(today));
                        System.out.println("___________________");
                    }
                    System.out.println("deleteId :");
                    String deleteId = sc.nextLine();

                    dao.delete(deleteId);
                    break;

                case 6:
                    runnable = false;
                    break;

            }
        }
    }
}
