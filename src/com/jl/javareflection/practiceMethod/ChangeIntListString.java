package com.jl.javareflection.practiceMethod;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName ChangeIntListString
 * @Description TODO
 * @Author Jiangl
 * @Date 2019/5/9 15:32
 * @Version 1.0
 */
public class ChangeIntListString {
    public static void main(String[] args){
        try {
            List<Integer> list = new ArrayList<Integer>();
            Method method = list.getClass().getMethod("add",Object.class);
            method.invoke(list,"dasdfa");
            System.out.println(list.get(0));
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } finally {
        }
    }
}
