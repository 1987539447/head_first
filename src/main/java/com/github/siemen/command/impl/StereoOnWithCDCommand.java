
package com.github.siemen.command.impl;

import com.github.siemen.command.Command;
import com.github.siemen.command.device.Stereo;

/**
 * <b>描述：播放CD命令</b> <br/>
 *
 * <b>时间：</b>2018-05-22<br/>
 *
 */
public class StereoOnWithCDCommand implements Command {

    private Stereo stereo;

    public StereoOnWithCDCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {

        this.stereo.on();
        this.stereo.setCD();
        this.stereo.setVolume(20);

    }

    @Override
    public void undo() {
        this.stereo.off();
    }

}