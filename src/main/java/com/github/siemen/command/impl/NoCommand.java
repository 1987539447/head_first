
package com.github.siemen.command.impl;

import com.github.siemen.command.Command;

/**
 * <b>描述：空命令</b> <br/>
 *
 * <b>时间：</b>2018-05-22<br/>
 *
 */
public class NoCommand implements Command {
    @Override
    public void execute() {
        throw new UnsupportedOperationException("不支持的命令");
    }

    @Override
    public void undo() {
        System.out.println("do nothing....");
    }
}