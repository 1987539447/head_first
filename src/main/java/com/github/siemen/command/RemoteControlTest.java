/*
 * Copyright (c) 2015-2018 www.jd.com All rights reserved.
 * 本软件源代码版权归京东智能集团所有,未经许可不得任意复制与传播.
 */
package com.github.siemen.command;

import com.github.siemen.command.device.Light;
import com.github.siemen.command.impl.LightOffCommand;

/**
 * <b>描述：测试类</b> <br/>
 * @author <b>作者：</b> cdzhansihu@jd.com<br/>
 * <b>时间：</b>2018-05-21<br/>
 *
 */
public class RemoteControlTest {

    public static void main(String[] args) {
        SimpleRemoteControl remote = new SimpleRemoteControl();
        Light light = new Light("living room");
        Command lightOn = new LightOffCommand(light);
        remote.setSlot(lightOn);
        remote.buttonWasPressed();
    }
}