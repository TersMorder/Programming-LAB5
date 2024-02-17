package exceptions.validateExceptions;
public class XCoordinateValidateException extends ValidateException {
    public XCoordinateValidateException(String message) {
        super(message);
        mapPos = 1;
    }
}

