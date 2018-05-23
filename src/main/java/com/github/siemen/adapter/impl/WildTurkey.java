/*
 * Copyright (c) 2015-2018 www.jd.com All rights reserved.
 * 本软件源代码版权归京东智能集团所有,未经许可不得任意复制与传播.
 */
package com.github.siemen.adapter.impl;

import com.github.siemen.adapter.Turkey;

/**
 * <b>描述：火鸡实现</b> <br/>
 * @author <b>作者：</b> cdzhansihu@jd.com<br/>
 * <b>时间：</b>2018-05-23<br/>
 *
 */
public class WildTurkey implements Turkey {
    public void gobble() {
        System.out.println("Gobble...Gobble...");
    }

    public void fly() {

        System.out.println("I'm flying a short distance");

    }
}