/*
 * Copyright (c) 2015-2018 www.jd.com All rights reserved.
 * 本软件源代码版权归京东智能集团所有,未经许可不得任意复制与传播.
 */
package com.github.siemen.factory.simple;

/**
 * <b>描述：pizza抽象类 提供基础功能</b> <br/>
 * @author <b>作者：</b> cdzhansihu@jd.com<br/>
 * <b>时间：</b>2018-05-18<br/>
 *
 */
public abstract class Pizza {

    public abstract void  prepare();
    public abstract void bake();
    public abstract void cut();
    public abstract void box();
}