package controlModule;
import clientModule.Client;
import dataModule.commandPack.CommandInvoker;
import dataModule.commandPack.CommandMill;
import dataModule.commandPack.CommandsEnum;

public class Controller {
    Client ClientModule;
    CommandInvoker invoker;
    CommandMill mill;
    public void start() {
        invoker = new CommandInvoker();
        mill = new CommandMill();
        CommandsEnum commandName;
        while (true) {
            ClientModule = new Client();
                System.out.println();
                System.out.println("Введите команду");
                commandName = ClientModule.readCommand();
                if (commandName == CommandsEnum.HISTORY) {
                    System.out.println("Последние выполненные команды");
                    int i = 1;
                    for (CommandsEnum el: invoker.getLast12Commands()) {
                        System.out.println(i + " - " + el.toString());
                        i++;
                    }
                    invoker.insertElementInLastCommands(CommandsEnum.HISTORY, 0);
                }
                else if (commandName != CommandsEnum.EXIT) {
                    invoker.setCurrentCommand(mill.createCommand(commandName));
                    invoker.execute();
                }
                else {
                    System.out.println("Выход");
                    break;
                }

        }
    }




}


