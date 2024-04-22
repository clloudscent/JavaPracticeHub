package feb13;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class DAO {
    Connection conn;

    public DAO(String url, String id, String pw)throws Exception{
        conn = DriverManager.getConnection(url, id, pw);
    }

    public boolean login(String inputId, String inputPw) throws Exception{
        String sql = "select * from user where user_id = ? AND user_pw =?";
        PreparedStatement pstmt = conn.prepareStatement(sql);


        pstmt.setString(1, inputId);
        pstmt.setString(2, inputPw);

        ResultSet rs = pstmt.executeQuery();
        if(rs.next()){
            return true;
        }else{
            return false;
        }
    }


    public void create(PetVO petVO) throws Exception{
        String sql = "insert into animal_hospital(id, name, name_of_disease, enrolled_date, date_of_care, pet_type, doctor) values(?,?,?,?,?,?,?)";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, petVO.getId());
        pstmt.setString(2, petVO.getName());
        pstmt.setString(3, petVO.getNameOfDisease());
        pstmt.setString(4, petVO.getEnrolledDate());
        pstmt.setString(5, petVO.getDateOfCare());
        pstmt.setString(6, petVO.getPetType());
        pstmt.setString(7, petVO.getDoctor());
        pstmt.execute();
    }

    public List<PetVO> read(String doctor) throws Exception{
        List<PetVO> petVOList = new ArrayList<>();
        String sql  = "select * from animal_hospital where doctor = ?";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, doctor);

        ResultSet rs = pstmt.executeQuery();

        while(rs.next()){
            String id = rs.getString("id");
            String name = rs.getString("name");
            String nameOfDisease = rs.getString("name_of_disease");
            String enrolledDate = rs.getString("enrolled_date");
            String dateOfCare = rs.getString("date_of_care");
            String petType = rs.getString("pet_type");
            String vet = rs.getString("doctor");

            PetVO petVO = new PetVO(id, name, nameOfDisease, enrolledDate, dateOfCare, petType, vet);
            petVOList.add(petVO);
        }
        return petVOList;
    }



    public void update(PetVO petVO) throws Exception{
        String sql = "update animal_hostpital set name_of_disease = ?, date_of_care = ? where id =?";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, petVO.getNameOfDisease());
        pstmt.setString(2, petVO.getDateOfCare());
        pstmt.execute();
    }

    public void delete(String deleteId) throws Exception{
        String sql = "delete from animal_hospital where id = ?";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, deleteId);
        pstmt.execute();
    }
}
