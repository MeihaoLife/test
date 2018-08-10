package cn.youngs.concurrent.research;

import java.util.List;
import java.util.concurrent.CountDownLatch;

/**
 * @Auther: zhanghao
 * @Date: 2018/8/10 17:06
 * @Description:
 * @Version:1.0
 */
public class OperateListThread implements Runnable{
    private List list;
    private CountDownLatch threadSignal;
    public OperateListThread(CountDownLatch threadSignal,List list){
        this.threadSignal = threadSignal;
        this.list = list;
    }

    public void run() {
        for(int j = 0;j < 1000;j++) {
            list.add("String");
        }
        threadSignal.countDown();
    }
}
