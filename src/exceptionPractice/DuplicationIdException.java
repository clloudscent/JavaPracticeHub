package exceptionPractice;

public class DuplicationIdException extends Exception{
    public DuplicationIdException(){

    }
    public DuplicationIdException(String message){
        super(message);
    }
}
