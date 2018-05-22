/*
 * Copyright (c) 2015-2018 www.jd.com All rights reserved.
 * 本软件源代码版权归京东智能集团所有,未经许可不得任意复制与传播.
 */
package com.github.siemen.command.impl;

import com.github.siemen.command.Command;

/**
 * <b>描述：宏命令 同时执行多个命令的命令</b> <br/>
 * @author <b>作者：</b> cdzhansihu@jd.com<br/>
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