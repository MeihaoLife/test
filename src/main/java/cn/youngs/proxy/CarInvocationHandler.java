package cn.youngs.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Auther: zhanghao
 * @Date: 2018/8/10 19:17
 * @Description:
 * @Version:1.0
 */
public class CarInvocationHandler implements InvocationHandler{
    private Object target;
    public CarInvocationHandler(Object object){
        super();
        this.target = object;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

            System.out.println("------before--------");
            Object result = method.invoke(target, args);
            System.out.println("------after--------");

        return result;
    }

}
