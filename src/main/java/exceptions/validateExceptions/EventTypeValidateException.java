package exceptions.validateExceptions;
public class EventTypeValidateException extends ValidateException {
    public EventTypeValidateException(String message) {
        super(message);
        mapPos = 9;
    }
}
