package jul28;

public class MySqlDao implements DataAccessObject{
    @Override
    public void select(){
        System.out.println("MySql DB 에서 검색");
    }
    public void insert(){
        System.out.println("MySql DB 에서 삽입");
    }
    public void update(){
        System.out.println("MySql DB 에서 수정");
    }
    public void delete(){
        System.out.println("Mysql DB 에서 삭제");
    }
}
