package com.laca.bl.entity.Package.command.invoker;

import com.laca.bl.entity.Package.command.abstractCommand.Command;

public class CommandInvoker {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void executeCommand() {
        command.execute();
    }
}
