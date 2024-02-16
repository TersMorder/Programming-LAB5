package ClientModule;

import ControlModule.InputChecker;
import DataModule.CommandPack.CommandsEnum;
import Exceptions.CommandException;
import Exceptions.CommandPatternMismatchException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Client {
    private CommandsEnum command;
    InputChecker inputChecker = new InputChecker();
    public CommandsEnum readCommand(){

        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader (System.in));
            while (this.command ==null) {
                String input = reader.readLine();
                try {
                    this.command = CommandsEnum.valueOf(input.toUpperCase());
                    return command;
                } catch (IllegalArgumentException illegalArgumentException) {
                    try {
                        command = inputChecker.checkCommandExistence(input);
                        return command;
                    }
                    catch (CommandException commandException){
                        System.out.println(commandException.getMessage());
                    }
                }
            }
            command = null;
        }
        catch (IOException e) {
            System.out.println("Что-то пошло не так в процессе чтения команды");
            return null;
        }
        return null;
    }
}
