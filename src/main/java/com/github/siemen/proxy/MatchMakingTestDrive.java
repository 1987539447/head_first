
package com.github.siemen.proxy;

import com.github.siemen.proxy.impl.NoOwnerInvocationHandler;
import com.github.siemen.proxy.impl.OwnerInvocationHandler;
import com.github.siemen.proxy.impl.PersonBeanImpl;
import java.lang.reflect.Proxy;
import java.util.HashMap;
import java.util.Map;

/**
 * <b>描述：</b> <br/>
 *
 * <b>时间：</b>2018-05-30<br/>
 *
 */
public class MatchMakingTestDrive {

    private Map<String, PersonBean> persons;

    public static void main(String[] args) {
        MatchMakingTestDrive test = new MatchMakingTestDrive();
        test.drive();
    }

    public MatchMakingTestDrive() {
        initializeDatabase();
    }

    private void initializeDatabase() {
        this.persons = new HashMap<>();
        PersonBean joe = new PersonBeanImpl();
        joe.setName("joe");
        joe.setGender("male");
        this.persons.put("joe", joe);
    }

    private PersonBean getFromDatabase(String name) {
        return this.persons.get(name);
    }

    private void drive() {
        PersonBean joe = getFromDatabase("joe");
        PersonBean ownerProxy = getOwnerProxy(joe);
        System.out.println("Name..." + ownerProxy.getName());
        ownerProxy.setInterests("bowling, Go");
        System.out.println("interests set from owner proxy");
        try {
            ownerProxy.setHotOrNotRating(10);
        } catch (Exception ex) {
            System.out.println("can't set HotOrNotRating from owner proxy");
        }
        System.out.println("Rating is..:" + ownerProxy.getHotOrNotRating());

        PersonBean noOwnerProxy = getNonOwnerProxy(joe);
        System.out.println("Name is.." + noOwnerProxy.getName());
        try {
            noOwnerProxy.setInterests("Bowling, Go");
        } catch (Exception ex) {
            System.out.println("can't set interests from no owner proxy");
        }
        noOwnerProxy.setHotOrNotRating(10);
        System.out.println("rating set from no owner proxy");
        System.out.println("Rating is.." + noOwnerProxy.getHotOrNotRating());
    }

    private PersonBean getNonOwnerProxy(PersonBean person) {
        return (PersonBean) Proxy.newProxyInstance(person.getClass().getClassLoader(), person.getClass().getInterfaces(), new NoOwnerInvocationHandler(person));
    }

    private PersonBean getOwnerProxy(PersonBean person) {
        return (PersonBean) Proxy.newProxyInstance(person.getClass().getClassLoader(), person.getClass().getInterfaces(), new OwnerInvocationHandler(person));
    }
}