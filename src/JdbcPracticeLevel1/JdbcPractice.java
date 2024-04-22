package JdbcPracticeLevel1;

import jdbcPractice01.DiaryVO;
import jdbcPractice01.UserVO;

import javax.management.relation.RelationSupport;
import java.sql.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class JdbcPractice {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/practice";
        String id = "airplane";
        String pw = "airplane1234";

        try(Connection conn = DriverManager.getConnection(url, id, pw)) {
            Scanner sc = new Scanner(System.in);
            System.out.println("DB접속성공");
            //DAO dao = new DAO(url, id, pw);

            System.out.print("아이디: ");
            String username  = sc.nextLine();
            System.out.print("비밀번호: ");
            String password = sc.nextLine();

            //로그인
            boolean isLogIn = false;
            Statement stmt = conn.createStatement();
            //userList돌려서 아이디 비번 확인
            ArrayList<UserVO> userList = new ArrayList<>();
            String dbSql = "select * from user";
            ResultSet rs = stmt.executeQuery(dbSql);
            while(rs.next()){
                String dbUsername = rs.getString("user_id");
                String dbPassword = rs.getString("user_pw");
                UserVO userVO = new UserVO(dbUsername,dbPassword);
                userList.add(userVO);

                for(int i=0; i<userList.size(); i++){
                    if(username.equals(userList.get(i).getUsername()) && password.equals(userList.get(i).getPassword())){
                        isLogIn = true;
                        break;
                    }else{
                        System.out.println("로그인 실패");
                        System.out.println("username: "+username + " password: " + password);
                        System.exit(0);
                    }
                }
            }

            //로그인 완료
            if(isLogIn == true){
                boolean runnable = true;

                while(runnable) {


                    System.out.println("번호를 입력해주세요");
                    System.out.println("1. 일기쓰기");
                    System.out.println("2. 일기조회");
                    System.out.println("3. 일기수정");
                    System.out.println("4. 일기삭제");
                    System.out.println("5. 시스템종료");
                    System.out.print("번호입력: ");

                    int inputNum = sc.nextInt();
                    sc.nextLine();
                    switch (inputNum) {
                        case 1:
                            System.out.println("일기쓰기");
                            System.out.print("제목: ");
                            String inputTitle = sc.nextLine();
                            System.out.print("내용: ");
                            String inputContent = sc.nextLine();
                            String InsertQuery = "insert into diary (title, content, created_date, updated_date, user_id) values (?,?,?,?,?)";
                            String today = LocalDate.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
                            PreparedStatement pstmt1 = conn.prepareStatement(InsertQuery);
                            pstmt1.setString(1, inputTitle);
                            pstmt1.setString(2, inputContent);
                            pstmt1.setString(3, today);
                            pstmt1.setString(4, today);
                            pstmt1.setString(5, username);
                            pstmt1.execute();
                            break;
                        case 2:
                            String selectQuery = "select * from diary where user_id = ?";
                            PreparedStatement pstmt2 = conn.prepareStatement(selectQuery);
                            pstmt2.setString(1, username);

                            ResultSet rs2 = pstmt2.executeQuery();


                            while (rs2.next()) {
                                String temp1 = rs2.getString("id");
                                String temp2 = rs2.getString("title");
                                String temp3 = rs2.getString("content");
                                String temp4 = rs2.getString("created_date");
                                String temp5 = rs2.getString("updated_date");
                                String temp6 = rs2.getString("user_id");
                                ArrayList<DiaryVO> diaryList = new ArrayList<>();
                                DiaryVO diaryVO = new DiaryVO(temp1, temp2, temp3, temp4, temp5, temp6);
                                diaryList.add(diaryVO);
                                for (int i = 0; i < diaryList.size(); i++) {
                                    System.out.print("ID: ");
                                    System.out.println(diaryList.get(i).getId());
                                    System.out.print("제목: ");
                                    System.out.println(diaryList.get(i).getTitle());
                                    System.out.print("내용: ");
                                    System.out.println(diaryList.get(i).getContent());
                                    System.out.print("작성일: ");
                                    System.out.println(diaryList.get(i).getCreatedDate());
                                    System.out.print("수정일: ");
                                    System.out.println(diaryList.get(i).getUpdatedDate());
                                    System.out.print("작성자: ");
                                    System.out.println(diaryList.get(i).getWriter());
                                    System.out.println("===============================");
                                }
                            }
                            break;
                        case 3:
                            //일기조회
                            String case3Query = "select * from diary where user_id = ?";
                            PreparedStatement case3pstmt = conn.prepareStatement(case3Query);
                            case3pstmt.setString(1, username);

                            ResultSet case3Rs = case3pstmt.executeQuery(case3Query);


                            while (case3Rs.next()) {
                                String temp1 = rs.getString("id");
                                String temp2 = rs.getString("title");
                                String temp3 = rs.getString("content");
                                String temp4 = rs.getString("created_date");
                                String temp5 = rs.getString("updated_date");
                                String temp6 = rs.getString("user_id");
                                ArrayList<DiaryVO> diaryList = new ArrayList<>();
                                DiaryVO diaryVO = new DiaryVO(temp1, temp2, temp3, temp4, temp5, temp6);
                                diaryList.add(diaryVO);
                                for (int i = 0; i < diaryList.size(); i++) {
                                    System.out.print("ID: ");
                                    System.out.println(diaryList.get(i).getId());
                                    System.out.print("제목: ");
                                    System.out.println(diaryList.get(i).getTitle());
                                    System.out.print("내용: ");
                                    System.out.println(diaryList.get(i).getContent());
                                    System.out.print("작성일: ");
                                    System.out.println(diaryList.get(i).getCreatedDate());
                                    System.out.print("수정일: ");
                                    System.out.println(diaryList.get(i).getUpdatedDate());
                                    System.out.print("작성자: ");
                                    System.out.println(diaryList.get(i).getWriter());
                                    System.out.println("===============================");
                                }
                            }
                            //update
                            System.out.println("====수정하기====");
                            System.out.print("게시물 id: ");
                            String selectUpdateId = sc.nextLine();
                            System.out.print("수정할 제목: ");
                            String updateTitle = sc.nextLine();
                            System.out.print("수정할 내용: ");
                            String updateContent = sc.nextLine();
                            String now = LocalDate.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));

                            String sql = "update diary set title = ?, content = ?, updated_date = ? where id = ?";
                            PreparedStatement pstmt3 = conn.prepareStatement(sql);
                            pstmt3.setString(1, updateTitle);
                            pstmt3.setString(2, updateContent);
                            pstmt3.setString(3, now);
                            pstmt3.setString(4, selectUpdateId);

                            break;
                        case 4:
                            //일기조회
                            String case4Query = "select * from diary where user_id = ?";
                            PreparedStatement case4pstmt = conn.prepareStatement(case4Query);
                            case4pstmt.setString(1, username);

                            ResultSet case4Rs = case4pstmt.executeQuery(case4Query);


                            while (case4Rs.next()) {
                                String temp1 = rs.getString("id");
                                String temp2 = rs.getString("title");
                                String temp3 = rs.getString("content");
                                String temp4 = rs.getString("created_date");
                                String temp5 = rs.getString("updated_date");
                                String temp6 = rs.getString("user_id");
                                ArrayList<DiaryVO> diaryList = new ArrayList<>();
                                DiaryVO diaryVO = new DiaryVO(temp1, temp2, temp3, temp4, temp5, temp6);
                                diaryList.add(diaryVO);
                                for (int i = 0; i < diaryList.size(); i++) {
                                    System.out.print("ID: ");
                                    System.out.println(diaryList.get(i).getId());
                                    System.out.print("제목: ");
                                    System.out.println(diaryList.get(i).getTitle());
                                    System.out.print("내용: ");
                                    System.out.println(diaryList.get(i).getContent());
                                    System.out.print("작성일: ");
                                    System.out.println(diaryList.get(i).getCreatedDate());
                                    System.out.print("수정일: ");
                                    System.out.println(diaryList.get(i).getUpdatedDate());
                                    System.out.print("작성자: ");
                                    System.out.println(diaryList.get(i).getWriter());
                                    System.out.println("===============================");
                                }
                            }
                            System.out.println("=====삭제하기====");
                            System.out.print("게시물 id: ");
                            String deleteId = sc.nextLine();
                            String deleteSql = "delete from diary where id = ?";
                            PreparedStatement pstmt4 = conn.prepareStatement(deleteSql);
                            pstmt4.setString(1, deleteId);


                            break;
                        case 5:
                            System.out.println("종료합니다.");
                            runnable = false;
                            break;
                    }
                }
            }




        }catch (Exception e){
            System.out.println("DB접속실패");
            e.printStackTrace();
        }

    }

}
