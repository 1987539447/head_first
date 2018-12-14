
package com.github.siemen.command.device;

/**
 * <b>描述：接受者 receiver 设备</b> <br/>
 *
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