package com.smart.framework;


import com.smart.framework.helper.ClassHelper;
import com.smart.framework.helper.ConfigHelper;
import com.smart.framework.helper.ControllerHelper;
import com.smart.framework.util.ClassUtil;

/**
 * 加载相应的Helper类
 * 实际上，当我们在第一次访问类时，就会加载static块，这里只是为了让加载更加集中
 */
public final class HelperLoader {
    public static void init(){
        Class<?>[] classList = {
                ControllerHelper.class,
                ClassHelper.class,
                ConfigHelper.class
        };
        for (Class<?> cls:classList){
            ClassUtil.loadClass(cls.getName());
        }
    }
}
