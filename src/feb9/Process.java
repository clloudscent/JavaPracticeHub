package feb9;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Process {
    public static void main(String[] args) throws Exception {
        String url  = "jdbc:mysql://localhost:3306/practice";
        String id = "airplane";
        String pw = "airplane1234";

        DAO dao = new DAO(url, id, pw);
        MemberVO memberVO = new MemberVO();
        List<MemberVO> memberVOList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

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
            System.out.println("2. 회원정보수정");
            System.out.println("3. 회원정보 불러오기");
            System.out.println("4. 포인트적립하기");
            System.out.println("5. 포인트사용하기");
            System.out.println("6. 회원삭제");
            System.out.println("7. 종료");
            System.out.println(">>");
            int inputNum = sc.nextInt();
            sc.nextLine();
            switch (inputNum) {

                case 1:
                    //1.회원등록
                    System.out.print("전화번호: ");
                    String telId = sc.nextLine();
                    System.out.print("이름: ");
                    String name = sc.nextLine();
                    MemberVO joiner = new MemberVO(telId, name, inputId);
                    dao.joinMember(joiner);
                    System.out.println("회원이 등록되었습니다.");
                    break;
                    //질문: 회원등록이 되지않습니다
                    // -> pstms 쿼리에서 insert 쿼리문의 입력 value 값에 대한 placeholder(?) 가 실제 입력하는 컬럼값과 일치하지 않음



                case 2:
                    //2.회원정보수정

                    System.out.println("전화번호: ");
                    String updateTelId = sc.nextLine();
                    System.out.println("이름: ");
                    String updateName = sc.nextLine();
                    MemberVO updateMember = new MemberVO(updateTelId, updateName, inputId);
                    dao.updateMember(updateMember);
                    break;

                case 3:
                    //3.회원정보불러오기

                    List<MemberVO> viewMemberList = dao.viewMember(inputId);

                    //read
                    for(int i = 0; i<viewMemberList.size(); i++){
                        System.out.println("전화번호: ");
                        System.out.println(viewMemberList.get(i).getTelId());
                        System.out.println("이름: ");
                        System.out.println(viewMemberList.get(i).getName());
                        System.out.println("현재 보유 포인트: ");
                        System.out.println(viewMemberList.get(i).getCurrentPoint());
                        System.out.println("회원 누적 포인트: ");
                        System.out.println(viewMemberList.get(i).getTotalPoint());
                        System.out.println("등급: ");
                        System.out.println(viewMemberList.get(i).getGrade());
                        System.out.println("관리자: ");
                        System.out.println(viewMemberList.get(i).getAdminId());
                        System.out.println("=========================");
                    }
                    break;

                case 4:
                    //4. 포인트 적립하기
                    //적립할 대상 회원 확인
                    System.out.print("적립할 대상 회원의 번호 입력: ");
                    String userNum = sc.nextLine();
                    MemberVO member = dao.readMemberById(userNum);
                    if(member==null){
                        System.out.println("해당 번호의 회원은 존재하지 않습니다.");
                        break;
                    }
                    System.out.println(member);
                    //적립할 포인트 입력 받기
                    System.out.print("증가시킬 포인트를 입력해주세요: ");
                    int pointToIncrease = sc.nextInt();
                    sc.nextLine();

                    //입력받은 포인트만큼 현재포인트와 누적포인트 증가시키기
                    member.setCurrentPoint(member.getCurrentPoint()+pointToIncrease);
                    member.setTotalPoint(member.getTotalPoint()+pointToIncrease);

                    //포인트 증가처리가 완료된 회원정보를 db에 반영
                    dao.updatePoint(member);

                    break;

                case 5:
                    //5. 포인트 사용하기

                    //회원정보불러오기
                    System.out.print("회원번호 입력:");
                    String telIdForPointUse = sc.nextLine();

                    //회원이 존재하는지 확인
                    MemberVO memberToPointUse = dao.readMemberById(telIdForPointUse);
                    if(memberToPointUse==null){
                        System.out.println("해당 번호의 회원은 존재하지 않습니다.");
                        break;
                    }
                    System.out.println(memberToPointUse);


                    System.out.print("사용하려는 포인트를 입력해주세요(사용가능 포인트: "+memberToPointUse.getCurrentPoint()+"): ");
                    //사용할 포인트 입력
                    int usingPoint = sc.nextInt();
                    sc.nextLine();

                    if(usingPoint<0){
                        System.out.println("사용 포인트는 0보다 크거나 같아야 합니다.");
                        break;
                    }
                    //현재포인트에서 차감시키기
                    if(memberToPointUse.getCurrentPoint()<usingPoint){
                        System.out.println("보유한 포인트보다 더 큰 포인트를 입력하셨습니다.");
                        break;
                    }

                    memberToPointUse.setCurrentPoint(memberToPointUse.getCurrentPoint()-usingPoint);
                    dao.updatePoint(memberToPointUse);

                    break;

                case 6:
                    //6.회원삭제
                    System.out.println("deleteId: ");
                    String deleteId = sc.nextLine();
                    dao.deleteMember(deleteId);
                    break;

                case 7:
                    runnable = false;
                    break;

            }
        }
    }
}
