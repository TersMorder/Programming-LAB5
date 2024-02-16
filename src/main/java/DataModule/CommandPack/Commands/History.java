package DataModule.CommandPack.Commands;

import DataModule.CommandPack.CommandInvoker;
import DataModule.CommandPack.CommandsEnum;
import DataModule.CommandPack.Executer;
import java.util.Vector;

public class History extends CommandParent implements Executer {
    public History(){
        super(CommandsEnum.HISTORY);
        this.name = CommandsEnum.HISTORY;
    }


    @Override
    public void execute() {

    }
}
