package com.jl.javareflection.practiceMethod;

/**
 * @ClassName GetPackageClassName
 * @Description TODO
 * @Author Jiangl
 * @Date 2019/5/7 9:31
 * @Version 1.0
 */
public class GetPackageClassName {
    public static void main(String[] args){
        ReflectionObject reflectionObject = new ReflectionObject();
        System.out.println(reflectionObject.getClass().getName());
    }
}
