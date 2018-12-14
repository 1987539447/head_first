
package com.github.siemen.state;

/**
 * <b>描述：状态接口</b> <br/>
 *
 * <b>时间：</b>2018-05-29<br/>
 *
 */
public interface State {

    void insertQuarter();
    void ejectQuarter();
    void turnCrank();
    void dispense();
}