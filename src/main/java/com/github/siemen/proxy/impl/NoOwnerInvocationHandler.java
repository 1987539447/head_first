/*
 * Copyright (c) 2015-2018 www.jd.com All rights reserved.
 * 本软件源代码版权归京东智能集团所有,未经许可不得任意复制与传播.
 */
package com.github.siemen.proxy.impl;

import com.github.siemen.proxy.PersonBean;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * <b>描述：非拥有者代理调用handler</b> <br/>
 * @author <b>作者：</b> cdzhansihu@jd.com<br/>
 * <b>时间：</b>2018-05-30<br/>
 *
 */
public class NoOwnerInvocationHandler implements InvocationHandler{

    private PersonBean personBean;

    public NoOwnerInvocationHandler(PersonBean personBean) {
        this.personBean = personBean;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if (method.getName().startsWith("get")) {
            return method.invoke(personBean, args);
        } else if (method.getName().equals("setHotOrNotRating")) {
            return method.invoke(personBean, args);
        } else {
            throw new IllegalAccessException();
        }
    }
}