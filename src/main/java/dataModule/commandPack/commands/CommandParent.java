package dataModule.commandPack.commands;

import dataModule.commandPack.CommandsEnum;
import dataModule.commandPack.Executer;

public class CommandParent implements Executer {
    CommandsEnum name;
    String argument;
    public CommandParent(CommandsEnum name){
        this.name = name;
    }
    @Override
    public void execute() {
        System.out.println("Но никто не пришёл...");
    }
    public CommandsEnum getName() {
        return name;
    }

    public void setArgument(String argument) {
        this.argument = argument;
    }
}
