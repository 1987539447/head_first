
package com.github.siemen.command;

import com.github.siemen.command.device.Light;
import com.github.siemen.command.device.Stereo;
import com.github.siemen.command.impl.LightOffCommand;
import com.github.siemen.command.impl.LightOnCommand;
import com.github.siemen.command.impl.MacroCommand;
import com.github.siemen.command.impl.StereoOffCommand;
import com.github.siemen.command.impl.StereoOnWithCDCommand;

/**
 * <b>描述：命令加载测试</b> <br/>
 *
 * <b>时间：</b>2018-05-22<br/>
 *
 */
public class RemoteLoader {

    public static void main(String[] args) {
        //create device
        Light light = new Light("living room light");
        Stereo stereo = new Stereo("living room stereo");

        //create command
        LightOnCommand lightOnCommand = new LightOnCommand(light);
        LightOffCommand lightOffCommand = new LightOffCommand(light);
        StereoOnWithCDCommand stereoOnWithCDCommand = new StereoOnWithCDCommand(stereo);
        StereoOffCommand stereoOffCommand = new StereoOffCommand(stereo);
        Command[] onCommands = {lightOnCommand, stereoOnWithCDCommand};
        Command[] offCommands = {lightOffCommand, stereoOffCommand};

        MacroCommand macroOnCommand = new MacroCommand(onCommands);
        MacroCommand macroOffCommand = new MacroCommand(offCommands);

        //control
        RemoteControl remoteControl = new RemoteControl();
        remoteControl.setCommand(0, lightOnCommand, lightOffCommand);
        remoteControl.setCommand(1, stereoOnWithCDCommand, stereoOffCommand);
        remoteControl.setCommand(2, macroOnCommand, macroOffCommand);

        remoteControl.onButtonWasPressed(0);
        remoteControl.undoButtonWasPressed();
        remoteControl.offButtonWasPressed(0);
        remoteControl.onButtonWasPressed(1);
        remoteControl.offButtonWasPressed(1);
        remoteControl.undoButtonWasPressed();
        System.out.println("macro command button ......");
        remoteControl.onButtonWasPressed(2);
        remoteControl.offButtonWasPressed(2);
    }
}