package dataModule.commandPack;

import dataModule.commandPack.commands.CommandParent;

import java.util.Vector;

public class CommandInvoker {
    private CommandParent currentCommand;
    private String argument;
    public CommandInvoker(){}


    private Vector<CommandsEnum> last12Commands = new Vector<>(12);
    public void setCurrentCommand(CommandParent command){
        this.currentCommand = command;
    }
    public void execute(){
        if (last12Commands.size()<12){
            last12Commands.insertElementAt(currentCommand.getName(), 0);
        }
        else{
            last12Commands.removeElementAt(11);
            last12Commands.insertElementAt(currentCommand.getName(), 0);
        }
        currentCommand.execute();
    }

    public Vector<CommandsEnum> getLast12Commands() {
        return last12Commands;
    }
    public void insertElementInLastCommands(CommandsEnum commandsEnum, int index){
        last12Commands.insertElementAt(commandsEnum, index);
    }

}

