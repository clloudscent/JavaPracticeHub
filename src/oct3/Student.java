package oct3;

public class Student extends Object{
    private int no;
    private String name;

    public Student(int no, String name){
        this.no = no;
        this.name = name;
    }

    public int getNo(){return no;}
    public String getName(){return name;}

    @Override
    public int hashCode(){
        int hashCode = no+name.hashCode();
        return hashCode;
    }


    @Override
    public boolean equals(Object obj){
        if(obj instanceof Student){
            Student target = (Student)obj;
            if(no == target.getNo() && name.equals(target.getName())){
                return true;
            }
        }
        return false;
    }
}