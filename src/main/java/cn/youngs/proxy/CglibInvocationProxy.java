package cn.youngs.proxy;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @Auther: zhanghao
 * @Date: 2018/8/14 22:28
 * @Description:通过创建代理子类实现动态代理
 * @Version:1.0
 */
public class CglibInvocationProxy implements MethodInterceptor{

    Enhancer enhancer = new Enhancer();

    public Object getProxy(Class clazz){
        enhancer.setSuperclass(clazz);
        enhancer.setCallback(this);
        return enhancer.create();

    }
    @Override
    public Object intercept(Object obj, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        System.out.println("Cglib 代理开始");
        methodProxy.invokeSuper(obj,args);
        System.out.println("Cglib 代理结束");
        return null;
    }

    public static void main(String[] args) {

        CglibInvocationProxy cglibInvocationProxy = new CglibInvocationProxy();
        CglibBaseClass cglibBaseClass = (CglibBaseClass)cglibInvocationProxy.getProxy(CglibBaseClass.class);
        cglibBaseClass.print();

    }
}
