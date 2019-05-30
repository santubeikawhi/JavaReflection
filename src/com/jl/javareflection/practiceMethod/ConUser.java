package com.jl.javareflection.practiceMethod;

import java.io.Serializable;

/**
 * @ClassName ConUser
 * @Description TODO
 * @Author Jiangl
 * @Date 2019/5/8 23:34
 * @Version 1.0
 */
public class ConUser extends ConUserParent  {
    private String userName;
    private String age;
    private String sex;

    public ConUser() {
        super();
    }

    public ConUser(String userName, String age, String sex) {
        super();
        this.userName = userName;
        this.age = age;
        this.sex = sex;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "["+userName+","+age+","+sex+"]";
    }
}
