package com.smart.framework.bean;

import java.lang.reflect.Method;

/**
 * 封装Action信息
 * @author TommyYear
 * @date 2018/11/3
 * @time 2:39 PM
 */
public class Handler {

    /**
     * Controller类
     */
    private Class<?> controllerClass;

    /**
     * Action方法
     */
    private Method actionMethdo;

    public Handler(Class<?> controllerClass, Method actionMethdo) {
        this.controllerClass = controllerClass;
        this.actionMethdo = actionMethdo;
    }

    public Class<?> getControllerClass() {
        return controllerClass;
    }

    public Method getActionMethdo() {
        return actionMethdo;
    }
}
