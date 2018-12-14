
package com.github.siemen.command.impl;

import com.github.siemen.command.Command;
import com.github.siemen.command.device.Light;

/**
 * <b>描述：开灯命令</b> <br/>
 *
 * <b>时间：</b>2018-05-22<br/>
 *
 */
public class LightOnCommand implements Command {


    private Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        this.light.on();
    }

    @Override
    public void undo() {
        this.light.off();
    }
}