package cn.youngs.concurrent.research;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @Auther: zhanghao
 * @Date: 2018/8/13 22:57
 * @Description:获取实例私有属性值
 * @Version:1.0
 */
public class SetPrivateFields {

    public static void main(String[] args) {
        User u = new User();
        Method[] methods = User.class.getMethods();
        Field[] fields = User.class.getDeclaredFields();

        for (int i = 0; i < fields.length; i++)
            try {

                fields[i].setAccessible(true);
                if ("username".equals(fields[i].getName())) {
                    fields[i].set(u, "lisi");
                } else if ("userid".equals(fields[i].getName())) {
                    fields[i].set(u, "002");
                }

            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }

        System.out.println(u);
    }

}
