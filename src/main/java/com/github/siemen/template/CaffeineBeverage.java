/*
 * Copyright (c) 2015-2018 www.jd.com All rights reserved.
 * 本软件源代码版权归京东智能集团所有,未经许可不得任意复制与传播.
 */
package com.github.siemen.template;

/**
 * <b>描述：咖啡因饮料</b> <br/>
 * @author <b>作者：</b> cdzhansihu@jd.com<br/>
 * <b>时间：</b>2018-05-24<br/>
 *
 */
public abstract class CaffeineBeverage {

    /**
     *
     * <b>描述：模版方法 定义饮料冲调的基本步骤 留出brew 和 addCondiments 供子类实现具体细节</b> <br/>
     * @author <b>创建人：</b> cdzhansihu@jd.com<br/>
     * <b>创建时间：</b> 2018-05-24 <br/>
     * <b>修改人：</b> cdzhansihu@jd.com<br/>
     * <b>时间：</b> 2018-05-24 <br/>
     * <b>修改内容：</b>  <br/>
     */
    final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        if (customerWantsCondiments()) {
            addCondiments();
        }
    }

    protected abstract boolean customerWantsCondiments();

    protected abstract void addCondiments();

    private void pourInCup() {
        System.out.println("Pouring into cup...");
    }

    protected abstract void brew();

    private void boilWater() {
        System.out.println("Boiling water....");
    }
}