package cn.youngs.proxy;

/**
 * @Auther: zhanghao
 * @Date: 2018/8/10 19:16
 * @Description:
 * @Version:1.0
 */
public class CarServiceImpl implements  CarService {
    public void transportPerson(int count) {
        System.out.println("车上有100人");
    }
}
