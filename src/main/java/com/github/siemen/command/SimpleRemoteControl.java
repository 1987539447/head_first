/*
 * Copyright (c) 2015-2018 www.jd.com All rights reserved.
 * 本软件源代码版权归京东智能集团所有,未经许可不得任意复制与传播.
 */
package com.github.siemen.command;

/**
 * <b>描述：调用者 invoker</b> <br/>
 * @author <b>作者：</b> cdzhansihu@jd.com<br/>
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