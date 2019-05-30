package com.jl.javareflection.dynamicProxy;

/**
 * @ClassName UserDynamicProxy 反射机制的动态代理
 * @Description TODO
 * @Author Jiangl
 * @Date 2019/5/9 15:10
 * @Version 1.0
 */
public class UserDynamicProxy {
    public static void main(String[] args){
        MyInvocationHandler myInvocationHandler = new MyInvocationHandler();
        Subject subject = (Subject)myInvocationHandler.bind(new SubjectImpl());
        System.out.println(subject.getClass().getName());
        String a = subject.testMethod();
        System.out.println(a);
    }
}
