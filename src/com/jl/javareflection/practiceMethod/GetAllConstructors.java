package com.jl.javareflection.practiceMethod;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @ClassName GetAllConstructors 获取某个类中的全部构造函数
 * @Description TODO 通过反射机制实例化一个类的对象
 * @Author Jiangl
 * @Date 2019/5/7 10:27
 * @Version 1.0
 */
public class GetAllConstructors {
    public static void main(String[] args) throws ClassNotFoundException {
        try {
            Class<?> clazz = null;
            clazz = Class.forName("com.jl.javareflection.practiceMethod.ConUser");
            //第一种方法 实例化默认构造方法调用set方法赋值
            ConUser conUser = (ConUser)clazz.newInstance();
            conUser.setUserName("Jack");
            conUser.setAge("11");
            conUser.setSex("boy");
            System.out.println(conUser);
            //第二种方法取得全部构造函数，
            Constructor<?>[] constructors = clazz.getConstructors();
            for(int i=0;i<=constructors.length-1;i++){
                Class<?> clazzparameters[] = constructors[i].getParameterTypes();
                System.out.print("cons[" + i + "] (");
                for(int j=0;j<=clazzparameters.length-1;j++){
                    if(j == clazzparameters.length-1){
                        System.out.print(clazzparameters[j].getName());
                    }else{
                        System.out.print(clazzparameters[j].getName() + ",");
                    }
                }
                System.out.println(")");
            }
            ConUser conUser1 = (ConUser)constructors[0].newInstance();
            System.out.println(conUser1);
            ConUser conUser2 = (ConUser)constructors[1].newInstance("123","123123","123123");
            System.out.println(conUser2);
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } finally {
        }
    }
}
