package dataModule.commandPack.commands;

import dataModule.commandPack.CommandsEnum;
import dataModule.commandPack.Executer;

import java.util.EnumSet;
import java.util.Vector;

public class Help extends CommandParent implements Executer {
    public Help(){
        super(CommandsEnum.HELP);
        this.name = CommandsEnum.HELP;
    }
    Vector<CommandsEnum> allCommands = new Vector<>(EnumSet.allOf(CommandsEnum.class));
    @Override
    public void execute() {
        for (CommandsEnum el: allCommands) {
            System.out.println(el.toString());
        }
    }
}
