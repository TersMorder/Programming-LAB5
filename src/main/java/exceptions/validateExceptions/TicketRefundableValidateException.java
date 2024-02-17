package exceptions.validateExceptions;
public class TicketRefundableValidateException extends ValidateException {
    public TicketRefundableValidateException(String message) {
            super(message);
            mapPos = 5;
        }
}

