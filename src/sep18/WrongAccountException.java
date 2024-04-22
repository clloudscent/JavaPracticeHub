package sep18;


public class WrongAccountException extends Exception{
    public WrongAccountException(){

    }

    public WrongAccountException(String message){
        super(message);
    }
}
