package exceptions.commandExceptions;

public class NoSuchCommandException extends CommandException {
    public NoSuchCommandException(String message) {
        super(message);
    }
}