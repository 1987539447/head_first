
package com.github.siemen.proxy.impl;

import com.github.siemen.proxy.PersonBean;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * <b>描述：拥有者代理调用handler</b> <br/>
 *
 * <b>时间：</b>2018-05-30<br/>
 *
 */
public class OwnerInvocationHandler implements InvocationHandler {

    private PersonBean personBean;

    public OwnerInvocationHandler(PersonBean personBean) {
        this.personBean = personBean;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if (method.getName().startsWith("get")) {
            return method.invoke(personBean, args);
        } else if (method.getName().equals("setHotOrNotRating")){
            throw new IllegalAccessException();
        } else if (method.getName().startsWith("set")) {
            return method.invoke(personBean, args);
        }
        return null;
    }
}