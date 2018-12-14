
package com.github.siemen.command.impl;

import com.github.siemen.command.Command;

/**
 * <b>描述：宏命令 同时执行多个命令的命令</b> <br/>
 *
 * <b>时间：</b>2018-05-22<br/>
 *
 */
public class MacroCommand implements Command {

    private Command[] commands;

    public MacroCommand(Command[] commands) {
        this.commands = commands;
    }
    @Override
    public void execute() {
        for (Command command : commands) {
            command.execute();
        }
    }

    @Override
    public void undo() {
        for (int i = commands.length - 1; i > 0 ; i--) {
            commands[i].undo();
        }
    }
}