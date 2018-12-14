
package com.github.siemen.proxy;

/**
 * <b>描述：个人信息接口</b> <br/>
 *
 * <b>时间：</b>2018-05-30<br/>
 *
 */
public interface PersonBean {
    String getName();
    String getGender();
    String getInterests();
    int getHotOrNotRating();


    void setName(String name);
    void setGender(String gender);
    void setInterests(String interests);
    void setHotOrNotRating(int rating);
}