package sep15;

public class WrongPasswordException extends Exception{
   public WrongPasswordException(){

   }
   public WrongPasswordException(String alert){
      super(alert);
   }
}
