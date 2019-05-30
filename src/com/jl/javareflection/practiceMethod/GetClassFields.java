package com.jl.javareflection.practiceMethod;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/**
 * @ClassName GetClassFields 获取某个类的全部属性
 * @Description TODO
 * @Author Jiangl
 * @Date 2019/5/9 10:13
 * @Version 1.0
 */
public class GetClassFields {
    public static void main(String[] args){
        try {
            Class<?> clazz = Class.forName("com.jl.javareflection.practiceMethod.ConUser");
            Field[] declaredFields = clazz.getDeclaredFields();
            System.out.println("===============本类属性===============");
            for(int fi=0;fi<=declaredFields.length-1;fi++){
                //修饰符
                int modifiers = declaredFields[fi].getModifiers();
                String mv = Modifier.toString(modifiers);
                //属性名称
                String name = declaredFields[fi].getName();
                //属性类型
                Class<?> type = declaredFields[fi].getType();
                Class<?> decClass = declaredFields[fi].getDeclaringClass();

                System.out.println(mv+" "+type+" "+ name);
                System.out.println(mv+" "+decClass+" "+ name);
            }

            System.out.println("==========实现的接口或者父类的属性==========");
            Field[] fields = clazz.getFields();//无法获取 私有属性 private
            for(int fi=0;fi<=fields.length-1;fi++){
                //修饰符
                int modifiers = fields[fi].getModifiers();
                String mv = Modifier.toString(modifiers);
                //属性名称
                String name = fields[fi].getName();
                //属性类型
                Class<?> type = fields[fi].getType();

                System.out.println(mv+" "+type+" "+ name);
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
        }
    }
}
