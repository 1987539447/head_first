
package com.github.siemen.compound;


/**
 * <b>描述：obervalbe接口</b> <br/>
 *
 * <b>时间：</b>2018-06-04<br/>
 *
 */
public interface QuackObervable {
    void registerObserver(Observer observer);
    void notifyObservers();
}