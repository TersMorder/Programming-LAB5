package DataModule.CommandPack;

import DataModule.CommandPack.Commands.*;

public class CommandMill {
    private CommandsEnum command = null;
    public CommandParent createCommand(CommandsEnum command){
        this.command = command;
        switch (command){
            case HELP -> {
                return new Help();
            }
            case ADD -> {
                return new Add();
            }
            case SHOW -> {

            }
        }
        return null;
    }

    public CommandsEnum getCommand() {
        return command;
    }
}
