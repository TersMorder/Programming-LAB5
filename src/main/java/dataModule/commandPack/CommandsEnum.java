package dataModule.commandPack;

public enum CommandsEnum {
    HELP("HELP","- Вывод справки по доступным командам", false),
    INFO("INFO","- Вывод в стандартный поток вывода информации о коллекции (тип, дата инициализации, количество элементов и т.д.)", false),
    SHOW("SHOW","- Вывод в стандартный поток вывода всех элементов коллекции в строковом представлении", false),
    ADD("ADD","- Добавление нового элемента в коллекцию", false),
    UPDATE("UPDATE","- Обновление значения элемента коллекции, id которого равен заданному", true),
    REMOVE_BY_ID("REMOVE_BY_ID"," - Удалить элемент из коллекции по его id", true),
    CLEAR("CLEAR","- Очистка коллекции", false),
    SAVE("SAVE","- Сохранение коллекции в файл", false),
    EXECUTE_SCRIPT("EXECUTE_SCRIPT","- Считывание и исполнение скрипта из указанного файла. В скрипте содержатся команды в таком же виде, в котором их вводит пользователь в интерактивном режиме.", true),
    EXIT("EXIT","- Завершение программы (без сохранения в файл)", false),
    REORDER("REORDER","- Сортировка коллекции в порядке, обратном нынешнему", false),
    SORT("SORT","- Сортировка коллекции в естественном порядке", false),
    HISTORY("HISTORY","- Вывод последних 12 команд (без их аргументов)", false),
    REMOVE_ALL_BY_PRICE("REMOVE_ALL_BY_PRICE","- Удаление из коллекции всех элементов, значение поля price которого эквивалентно заданному", true),
    MIN_BY_CREATION_DATE("MIN_BY_CREATION_DATE","- Вывод любого объект из коллекции, значение поля creationDate которого является минимальным", false),
    FILTER_STARTS_WITH_NAME("FILTER_STARTS_WITH_NAME","- Вывод элементов, значение поля name которых начинается с заданной подстроки", true);
    private final String description;
    private final String name;
    private final Boolean argumentable;

    CommandsEnum(String name, String description, Boolean argumentable){
        this.name = name;
        this.description = description;
        this.argumentable = argumentable;
    }

    @Override
    public String toString() {
        return name + " " + description;
    }

    public Boolean getArgumentable() {
        return argumentable;
    }
}

