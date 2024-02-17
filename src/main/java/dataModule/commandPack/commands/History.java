package dataModule.commandPack.commands;

import dataModule.commandPack.CommandsEnum;
import dataModule.commandPack.Executer;

public class History extends CommandParent implements Executer {
    public History(){
        super(CommandsEnum.HISTORY);
        this.name = CommandsEnum.HISTORY;
    }


    @Override
    public void execute() {

    }
}
