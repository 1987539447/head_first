
package com.github.siemen.template;

import java.util.Scanner;

/**
 * <b>描述：饮料实现 - 咖啡</b> <br/>
 *
 * <b>时间：</b>2018-05-24<br/>
 *
 */
public class Coffee extends CaffeineBeverage{

    // 钩子方法实现 决定模版处理中流程走向
    @Override
    protected boolean customerWantsCondiments() {
        String answer = getUserInput();
        if (answer.toLowerCase().startsWith("y")) {
            return true;
        }
        return false;
    }

    private String getUserInput() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Would you like milk and sugar with your coffee (y/n)");
        String answer = scanner.nextLine();
        return answer == null ? "no" : answer;
    }

    @Override
    protected void addCondiments() {
        System.out.println("Adding Sugar and Milk....");
    }

    @Override
    protected void brew() {
        System.out.println("Dripping Coffee though filter...");

    }
}