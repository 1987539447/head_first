/*
 * Copyright (c) 2015-2018 www.jd.com All rights reserved.
 * 本软件源代码版权归京东智能集团所有,未经许可不得任意复制与传播.
 */
package com.github.siemen.singleton;

/**
 * <b>描述：单例类 巧克力熔化炉</b> <br/>
 * @author <b>作者：</b> cdzhansihu@jd.com<br/>
 * <b>时间：</b>2018-05-21<br/>
 *
 */
public class ChocolateBoiler {

    private volatile static  ChocolateBoiler instance;
    private boolean boiled;
    private boolean empty;

    private ChocolateBoiler(){
        this.boiled = false;
        this.empty = true;
    }

    public static ChocolateBoiler getInstance(){
        if (instance == null) {
            synchronized (ChocolateBoiler.class) {
                instance = new ChocolateBoiler();
            }
        }
        return instance;
    }

/*
//通过静态变量初始化来保证唯一性
private static ChocolateBoiler instance = new ChocolateBoiler();

    public static ChocolateBoiler getInstance() {
        return instance;
    }

    */


    public void fill() {
        if (empty) {
            empty = false;
            boiled = false;
        }
    }
}