package com.jl.javareflection.practiceMethod;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @ClassName InvokeClassMethod 通过反射机制调用某个类的方法
 * @Description TODO
 * @Author Jiangl
 * @Date 2019/5/9 11:30
 * @Version 1.0
 */
public class InvokeClassMethod {
    private void TestPrint(){
        System.out.println("asdfasdf");
    }
    private static String TestPrint2(String b,int c){
        String a ="dasdf";
        System.out.println(a);
        System.out.println(b);
        System.out.println(""+c);
        return  a;
    }

    public static void main(String[] args){
        try {
            Class<?> clazz = Class.forName("com.jl.javareflection.practiceMethod.InvokeClassMethod");
            Method declaredMethods = clazz.getDeclaredMethod("TestPrint");
            declaredMethods.invoke(clazz.newInstance());
            Method method2 = clazz.getDeclaredMethod("TestPrint2",String.class,int.class);
            Object t = method2.invoke(clazz.newInstance(),"sdfasdfa",123);
            System.out.println(t.toString());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } finally {
        }
    }
}
