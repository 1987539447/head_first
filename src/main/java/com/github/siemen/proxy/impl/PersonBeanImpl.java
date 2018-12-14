
package com.github.siemen.proxy.impl;

import com.github.siemen.proxy.PersonBean;

/**
 * <b>描述：个人信息bean实现</b> <br/>
 *
 * <b>时间：</b>2018-05-30<br/>
 *
 */
public class PersonBeanImpl implements PersonBean {

    private String name;
    private String gender;
    private String interests;
    private int rating;
    private int ratingCount = 0;

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getGender() {
        return this.gender;
    }

    @Override
    public String getInterests() {
        return this.interests;
    }

    @Override
    public int getHotOrNotRating() {
        if (ratingCount == 0) {
            return 0;
        }
        return rating / ratingCount;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public void setInterests(String interests) {
        this.interests = interests;
    }

    @Override
    public void setHotOrNotRating(int rating) {
        this.rating += rating;
        this.ratingCount++;

    }
}