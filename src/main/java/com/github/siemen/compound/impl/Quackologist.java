/*
 * Copyright (c) 2015-2018 www.jd.com All rights reserved.
 * 本软件源代码版权归京东智能集团所有,未经许可不得任意复制与传播.
 */
package com.github.siemen.compound.impl;

import com.github.siemen.compound.Observer;
import com.github.siemen.compound.Quackable;

/**
 * <b>描述：观察者实现 - 叫声日志</b> <br/>
 * @author <b>作者：</b> cdzhansihu@jd.com<br/>
 * <b>时间：</b>2018-06-04<br/>
 *
 */
public class Quackologist implements Observer {
    @Override
    public void update(Quackable duck) {
        System.out.println("Quackologist .." + duck + " just quacked");
    }
}