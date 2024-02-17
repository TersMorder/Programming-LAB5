package exceptions.validateExceptions;

    public class TicketPriceValidateException extends ValidateException {
        public TicketPriceValidateException(String message) {
            super(message);
            mapPos = 3;
        }
    }

