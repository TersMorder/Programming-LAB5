package exceptions.validateExceptions;

public class EventDateValidateException extends ValidateException {
    public EventDateValidateException(String massage){
        super(massage);
        mapPos = 8;
    }
}
