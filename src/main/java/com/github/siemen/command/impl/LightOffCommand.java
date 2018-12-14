
package com.github.siemen.command.impl;

import com.github.siemen.command.Command;
import com.github.siemen.command.device.Light;

/**
 * <b>描述：打开灯命令</b> <br/>
 *
 * <b>时间：</b>2018-05-21<br/>
 *
 */
public class LightOffCommand implements Command {

    private Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }

    @Override
    public void undo() {
        light.on();
    }
}