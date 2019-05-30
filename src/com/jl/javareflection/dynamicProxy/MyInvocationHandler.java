package com.jl.javareflection.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @ClassName MyInvocationHandler
 * @Description TODO
 * @Author Jiangl
 * @Date 2019/5/9 14:51
 * @Version 1.0
 */
public class MyInvocationHandler implements InvocationHandler {
    public Object subject;

    public MyInvocationHandler() {
    }

    public MyInvocationHandler(Object subject) {
        this.subject = subject;
    }

    public Object bind(Object subject){
        this.subject = subject;
        /**
         * 通过Proxy的newProxyInstance方法来创建我们的代理对象，入参解析
         * 第一个参数subject.getClass().getClassLoader() 这里使用subject的ClassLoader对象来加载代理对象
         * 第二个参数subejct.getClass().getInterface() 对代理对象提供的接口是真实对象所实现的接口，表示要代理改真实对象
         * 这样就能调用这个接口中的方法了
         * 第三个参数Handler 将代理对象关联到InvocationHandler对象中
         */
        return Proxy.newProxyInstance(subject.getClass().getClassLoader(),subject.getClass().getInterfaces(),this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("before");
        System.out.println("Method:" + method);
        method.invoke(subject,args);//　　在代理真实对象后我们也可以添加一些自己的操作
        System.out.println("after rent house");
        return "result";
    }
}
