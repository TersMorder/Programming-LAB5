package exceptions.validateExceptions;
public class TicketDiscountValidateException extends ValidateException {
    public TicketDiscountValidateException(String message) {
        super(message);
        mapPos = 4;
    }
}

