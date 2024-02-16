package Exceptions;

public class CommandPatternMismatchException extends CommandException{
    public CommandPatternMismatchException(String message) {
        super(message);
    }
}
