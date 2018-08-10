package cn.youngs.proxy;

import java.lang.reflect.Proxy;

/**
 * @Auther: zhanghao
 * @Date: 2018/8/10 19:25
 * @Description:
 * @Version:1.0
 */
public class InvocationHandlerProxyTest {

    public static void main(String[] args) {
        CarService carService = new CarServiceImpl();
        CarInvocationHandler carInvocationHandler = new CarInvocationHandler(carService);
        carService = (CarService) Proxy.newProxyInstance(carService.getClass().getClassLoader(),
                carService.getClass().getInterfaces(),carInvocationHandler);
        carService.transportPerson(10);
    }
}
