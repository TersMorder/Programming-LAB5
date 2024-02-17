package exceptions.validateExceptions;

public class EventNameValidateException extends ValidateException {
    public EventNameValidateException(String message) {
        super(message);
        mapPos = 7;
    }
}