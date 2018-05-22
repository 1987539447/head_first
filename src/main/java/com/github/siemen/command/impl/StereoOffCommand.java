/*
 * Copyright (c) 2015-2018 www.jd.com All rights reserved.
 * 本软件源代码版权归京东智能集团所有,未经许可不得任意复制与传播.
 */
package com.github.siemen.command.impl;

import com.github.siemen.command.Command;
import com.github.siemen.command.device.Stereo;

/**
 * <b>描述：关闭</b> <br/>
 * @author <b>作者：</b> cdzhansihu@jd.com<br/>
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