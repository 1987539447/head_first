/*
 * Copyright (c) 2015-2018 www.jd.com All rights reserved.
 * 本软件源代码版权归京东智能集团所有,未经许可不得任意复制与传播.
 */
package com.github.siemen.command.device;

/**
 * <b>描述：接受者 receiver 设备</b> <br/>
 * @author <b>作者：</b> cdzhansihu@jd.com<br/>
 * <b>时间：</b>2018-05-21<br/>
 *
 */
public class Light {

   private String name;

   public Light(String name) {
       this.name = name;
   }

    public void on() {
        System.out.println("Light is on.....");
    }

    public void off()  {
        System.out.println("Light is off......");
    }
}