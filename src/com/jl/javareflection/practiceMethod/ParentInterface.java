package com.jl.javareflection.practiceMethod;

import java.io.Serializable;

/**
 * @ClassName ParentInterface
 * @Description TODO
 * @Author Jiangl
 * @Date 2019/5/7 10:17
 * @Version 1.0
 */
public class ParentInterface implements Serializable {
    private static final long serialVersionUUID = -2862585049955236662L;
    public static void main(String[] args) throws ClassNotFoundException {
        Class<?> clazz = Class.forName("com.jl.javareflection.practiceMethod.ParentInterface");
        Class<?> parentClass = clazz.getSuperclass();
        System.out.println("parentClass:"+parentClass.getName());
        Class<?>[] intes = clazz.getInterfaces();
        for(Class<?> inte : intes){
            System.out.println("Interface:"+inte.getName());
        }
    }
}
