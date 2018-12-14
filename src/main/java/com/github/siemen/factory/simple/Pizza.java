
package com.github.siemen.factory.simple;

/**
 * <b>描述：pizza抽象类 提供基础功能</b> <br/>
 *
 * <b>时间：</b>2018-05-18<br/>
 *
 */
public abstract class Pizza {

    public abstract void  prepare();
    public abstract void bake();
    public abstract void cut();
    public abstract void box();
}