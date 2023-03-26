package entity.util.exceptions;

public class InvalidTypeException extends Exception{
    public InvalidTypeException(String message){
        super(message);
        System.out.println("Invalid type!");
    }
    public InvalidTypeException(){
        super();
        System.out.println("Invalid type!");
    }
}
