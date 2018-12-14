
package com.github.siemen.command;

import com.github.siemen.command.device.Light;
import com.github.siemen.command.impl.LightOffCommand;

/**
 * <b>描述：测试类</b> <br/>
 *
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