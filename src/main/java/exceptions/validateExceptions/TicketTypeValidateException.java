package exceptions.validateExceptions;

public class TicketTypeValidateException extends ValidateException {
    public TicketTypeValidateException(String message) {
        super(message);
        mapPos = 6;
    }
}