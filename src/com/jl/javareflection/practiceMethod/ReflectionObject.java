package com.jl.javareflection.practiceMethod;

/**
 * @ClassName ReflectionObject
 * @Description TODO
 * @Author Jiangl
 * @Date 2019/5/7 9:28
 * @Version 1.0
 */
public class ReflectionObject {
    private String name;
    private String sex;

    public ReflectionObject() {
    }

    public ReflectionObject(String name, String sex) {
        this.name = name;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
