package exceptionPractice;

import sep15.WrongPasswordException;

public class WrongAccountException extends Exception{
    public WrongAccountException(){

    }

    public WrongAccountException(String message){
        super(message);
    }
}
