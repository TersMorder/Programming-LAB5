package exceptions.validateExceptions;
//todo добавить аннотацию для проверки, что это исключение нигде не выбрасывается, переименовать mapPos, сделать автоматическое выставление связанное с мапой
public class ValidateException extends IllegalArgumentException{
    protected int mapPos;
    public ValidateException(String massage){
        super(massage);
    }

    public int getMapPos() {
        return mapPos;
    }
}
