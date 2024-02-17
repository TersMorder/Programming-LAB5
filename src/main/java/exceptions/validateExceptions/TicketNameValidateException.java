package exceptions.validateExceptions;

public class TicketNameValidateException extends ValidateException {
    public TicketNameValidateException(String message) {
        super(message);
        mapPos = 0;
    }
}
