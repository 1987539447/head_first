/*
 * Copyright (c) 2015-2018 www.jd.com All rights reserved.
 * 本软件源代码版权归京东智能集团所有,未经许可不得任意复制与传播.
 */
package com.github.siemen.strategy.impl;

import com.github.siemen.strategy.FlyBehavior;

/**
 * <b>描述：飞行实现-用翅膀</b> <br/>
 * @author <b>作者：</b> cdzhansihu@jd.com<br/>
 * <b>时间：</b>2018-05-17<br/>
 *
 */
public class FlyWithWings implements FlyBehavior {
    public void fly() {
        System.out.println("...Fly with wings....");
    }
}