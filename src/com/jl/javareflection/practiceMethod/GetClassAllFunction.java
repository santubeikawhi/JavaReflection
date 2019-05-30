package com.jl.javareflection.practiceMethod;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Parameter;

/**
 * @ClassName GetClassAllFunction 获取某个类的全部方法
 * @Description TODO
 * @Author Jiangl
 * @Date 2019/5/9 10:32
 * @Version 1.0
 */
public class GetClassAllFunction {
    private static String testString(String test,int Name){
        byte[] a = null ;
        String b = null;
        try {
            b = "";
            if(a != null){

                b= String.valueOf(a);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return b;
    }
    public static void main(String[] args){
        try {
            Class<?> clazz = Class.forName("com.jl.javareflection.practiceMethod.GetClassAllFunction");
            Method[] declaredMethods =clazz.getDeclaredMethods();
            for(int mi=0;mi<=declaredMethods.length-1;mi++){
                Method m = declaredMethods[mi];
                String mv = Modifier.toString(m.getModifiers());
                Class<?> returnType = m.getReturnType();
                Parameter[] parameters = m.getParameters();
                System.out.print(mv+" "+returnType.getName()+" "+m.getName());
                System.out.print("(");
                for(int pi=0;pi<=parameters.length-1;pi++){
                    System.out.print(parameters[pi].getType()+" "+parameters[pi].getName());
                    if (pi < parameters.length - 1) {
                        System.out.print(",");
                    }
                }
                System.out.print(")");
                Class<?> exce[] = declaredMethods[mi].getExceptionTypes();
                if(exce.length > 0) {
                    System.out.print(" throws ");
                    for (int k = 0; k < exce.length; ++k) {
                        System.out.print(exce[k].getName() + " ");
                        if (k < exce.length - 1) {
                            System.out.print(",");
                        }
                    }
                }
                System.out.println("");
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
        }
    }
}
