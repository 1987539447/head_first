
package com.github.siemen.template;

/**
 * <b>描述：测试模版方法</b> <br/>
 *
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