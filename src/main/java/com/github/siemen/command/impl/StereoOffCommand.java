
package com.github.siemen.command.impl;

import com.github.siemen.command.Command;
import com.github.siemen.command.device.Stereo;

/**
 * <b>描述：关闭</b> <br/>
 *
 * <b>时间：</b>2018-05-22<br/>
 *
 */
public class StereoOffCommand implements Command{

    private Stereo stereo;

    public StereoOffCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {

        this.stereo.off();

    }

    @Override
    public void undo() {
        this.stereo.on();
        this.stereo.setCD();
        this.stereo.setVolume(20);
    }
}