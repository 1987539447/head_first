
package com.github.siemen.command;

/**
 * <b>描述：调用者 invoker</b> <br/>
 *
 * <b>时间：</b>2018-05-21<br/>
 *
 */
public class SimpleRemoteControl {

    private Command slot;

    public SimpleRemoteControl() {}

    public void buttonWasPressed() {
        System.out.println("button was pressed......");
        slot.execute();
    }

    public void setSlot(Command slot) {
        this.slot = slot;
    }
}