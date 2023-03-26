package entity.util.exceptions;

public class InvalidAuthenticationException extends Exception{
    public InvalidAuthenticationException(String message){
        super(message);
        System.out.println("Invalid login information!");
    }
    public InvalidAuthenticationException(){
        super();
        System.out.println("Invalid login information!");
    }
}
