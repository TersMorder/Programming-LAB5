package DataModule.CommandPack.Commands;

import DataModule.CommandPack.CommandsEnum;
import DataModule.CommandPack.Executer;

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
