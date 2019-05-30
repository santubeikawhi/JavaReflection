package com.jl.javareflection.practiceMethod;

/**
 * @ClassName InstanceClass
 * @Description TODO
 * @Author Jiangl
 * @Date 2019/5/7 9:33
 * @Version 1.0
 */
public class InstanceClass {
    public static void main(String[] args) throws ClassNotFoundException {
        Class<?> class1 = null;
        Class<?> class2 = null;
        Class<?> class3 = null;

        class1 = Class.forName("com.jl.javareflection.practiceMethod.GetPackageClassName");
        class2 = new GetPackageClassName().getClass();
        class3 = GetPackageClassName.class;

        System.out.println("类名称："+class1.getName());
        System.out.println("类名称："+class2.getName());
        System.out.println("类名称："+class3.getName());
    }
}
