
package com.github.siemen.command;

/**
 * <b>描述：命令接口</b> <br/>
 *
 * <b>时间：</b>2018-05-21<br/>
 *
 */
public interface Command {
    void execute();
    void undo();
}