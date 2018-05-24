/*
 * Copyright (c) 2015-2018 www.jd.com All rights reserved.
 * 本软件源代码版权归京东智能集团所有,未经许可不得任意复制与传播.
 */
package com.github.siemen.template;

/**
 * <b>描述：饮料实现 - 茶</b> <br/>
 * @author <b>作者：</b> cdzhansihu@jd.com<br/>
 * <b>时间：</b>2018-05-24<br/>
 *
 */
public class Tea extends CaffeineBeverage {

    // 钩子方法实现 决定模版处理中流程走向
    @Override
    protected boolean customerWantsCondiments() {
        return true;
    }

    @Override
    protected void addCondiments() {
        System.out.println("Steeping the tea....");
    }

    @Override
    protected void brew() {
        System.out.println("Adding lemon...");

    }
}