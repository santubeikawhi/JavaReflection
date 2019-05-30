package com.jl.javareflection.dynamicProxy;

/**
 * @ClassName SubjectImpl
 * @Description TODO
 * @Author Jiangl
 * @Date 2019/5/9 14:50
 * @Version 1.0
 */
public class SubjectImpl implements Subject {
    @Override
    public String testMethod() {
        System.out.println("aaaa");
        return "dfasdfsaf";
    }
}
