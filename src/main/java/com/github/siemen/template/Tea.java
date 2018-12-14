
package com.github.siemen.template;

/**
 * <b>描述：饮料实现 - 茶</b> <br/>
 *
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