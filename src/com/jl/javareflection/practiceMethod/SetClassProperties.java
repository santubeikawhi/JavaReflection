package com.jl.javareflection.practiceMethod;

import java.lang.reflect.Field;

/**
 * @ClassName SetClassProperties 通过反射机制操作某个类的属性
 * @Description TODO
 * @Author Jiangl
 * @Date 2019/5/9 13:28
 * @Version 1.0
 */
public class SetClassProperties {
    private String property = null;
    public static void main(String[] args){
        try {
            Class<?> clazz = Class.forName("com.jl.javareflection.practiceMethod.SetClassProperties");
            SetClassProperties obj = (SetClassProperties)clazz.newInstance();
            Field field = clazz.getDeclaredField("property");
            field.setAccessible(true);
            field.set(obj,"Java反射机制");
            System.out.println(field.get(obj));
            System.out.println(obj.property);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } finally {
        }
    }
}
