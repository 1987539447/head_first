/*
 * Copyright (c) 2015-2018 www.jd.com All rights reserved.
 * 本软件源代码版权归京东智能集团所有,未经许可不得任意复制与传播.
 */
package com.github.siemen.command.impl;

import com.github.siemen.command.Command;

/**
 * <b>描述：空命令</b> <br/>
 * @author <b>作者：</b> cdzhansihu@jd.com<br/>
 * <b>时间：</b>2018-05-22<br/>
 *
 */
public class NoCommand implements Command {
    @Override
    public void execute() {
        throw new UnsupportedOperationException("不支持的命令");
    }

    @Override
    public void undo() {
        System.out.println("do nothing....");
    }
}