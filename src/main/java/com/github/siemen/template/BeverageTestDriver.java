/*
 * Copyright (c) 2015-2018 www.jd.com All rights reserved.
 * 本软件源代码版权归京东智能集团所有,未经许可不得任意复制与传播.
 */
package com.github.siemen.template;

/**
 * <b>描述：测试模版方法</b> <br/>
 * @author <b>作者：</b> cdzhansihu@jd.com<br/>
 * <b>时间：</b>2018-05-24<br/>
 *
 */
public class BeverageTestDriver {

    public static void main(String[] args) {
        Tea tea = new Tea();
        Coffee coffee = new Coffee();
        System.out.println("prepare tea.....");
        tea.prepareRecipe();
        System.out.println("prepare coffee....");
        coffee.prepareRecipe();
    }
}