package dataModule.commandPack;

import dataModule.commandPack.commands.*;

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

        }
        return null;
    }

    public CommandsEnum getCommand() {
        return command;
    }
}
