package controlModule;

import dataModule.commandPack.CommandsEnum;
import exceptions.commandExceptions.CommandPatternMismatchException;
import exceptions.commandExceptions.NoSuchCommandException;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class InputChecker {
    StringBuilder regexBuilder = new StringBuilder();
    String commandArgument;
    public InputChecker(){
        regexBuilder.append("\\b(");
        CommandsEnum[] enumValues = CommandsEnum.values();
        for (int i = 0; i < enumValues.length; i++) {
            regexBuilder.append(enumValues[i].name());
            if (i < enumValues.length - 1) {
                regexBuilder.append("|");
            }
        }
        regexBuilder.append(")");
    }
    public CommandsEnum checkCommandExistence(String input){
        String toCheck;
        Pattern firstInputPattern = Pattern.compile("^.*?(?= )");
        Pattern commandPattern = Pattern.compile(regexBuilder.toString(), Pattern.CASE_INSENSITIVE);
        Matcher matcher = firstInputPattern.matcher(input);
        if(matcher.find()){
            toCheck = matcher.group();
            matcher = commandPattern.matcher(toCheck);
            if (matcher.find()) {
                CommandsEnum foundCommand = CommandsEnum.valueOf(matcher.group().toUpperCase());
                if(foundCommand.getArgumentable()) {
                    String[] splittedInput = input.split(" ");
                    if (splittedInput.length == 1 || splittedInput.length > 2) {
                        throw new CommandPatternMismatchException("Команда введена неверно");
                    } else {
                        commandArgument = splittedInput[1];
                    }
                }
                else {
                    throw new CommandPatternMismatchException("У " + foundCommand.name() + " нет аргументов");
                }
                return foundCommand;
            } else {
                throw new NoSuchCommandException("Данной команды не существует");
            }
        }
        else {
            throw new NoSuchCommandException("Данной команды не существует");
        }
    }



}
