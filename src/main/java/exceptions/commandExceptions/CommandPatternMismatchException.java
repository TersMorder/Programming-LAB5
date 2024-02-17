package exceptions.commandExceptions;

public class CommandPatternMismatchException extends CommandException {
    public CommandPatternMismatchException(String message) {
        super(message);
    }
}
