package com.smart.framework.helper;

import com.smart.framework.annotation.Controller;
import com.smart.framework.util.ClassUtil;

import java.util.HashSet;
import java.util.Set;

/**
 * 获取应用包名下的所有类、应用包名下所有Service类、应用包名下所有Controller类。此外，我们可以将带有
 * Controller注解与Service注解的类所产生的对象，理解为由Smart框架所管理的Bean，所以有必要在ClassHelper
 * 类中增加一个获取应用包名下所有Bean类的方法
 *
 * @author TommyYear
 * @date 2018/11/3
 * @time 3:30 PM
 */
public class ClassHelper {

    private static final Set<Class<?>> CLASS_SET;

    static {
        String basePackage = ConfigHelper.getAppBasePackage();
        CLASS_SET = ClassUtil.getClassSet(basePackage);
    }

    /**
     * 获取应用包名下所有类
     * @return
     */
    public static Set<Class<?>> getClassSet(){
        return CLASS_SET;
    }

    /**
     * 获取应用包下所有Controller类
     * @return
     */
    public static Set<Class<?>> getControllerClassSet(){
        Set<Class<?>> classSet = new HashSet<Class<?>>();
        for (Class<?> cls : CLASS_SET){
            if (cls.isAnnotationPresent(Controller.class)){
                classSet.add(cls);
            }
        }
        return classSet;
    }

}
