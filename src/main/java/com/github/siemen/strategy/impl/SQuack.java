/*
 * Copyright (c) 2015-2018 www.jd.com All rights reserved.
 * 本软件源代码版权归京东智能集团所有,未经许可不得任意复制与传播.
 */
package com.github.siemen.strategy.impl;

import com.github.siemen.strategy.QuackBehavior;

/**
 * <b>描述：叫声行为实现-橡皮鸭</b> <br/>
 * @author <b>作者：</b> cdzhansihu@jd.com<br/>
 * <b>时间：</b>2018-05-17<br/>
 *
 */
public class SQuack implements QuackBehavior {
    public void quack() {
        System.out.println("....toy duck : zhi. zhi. zhi....");
    }
}