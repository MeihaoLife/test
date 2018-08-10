package cn.youngs.concurrent.research;

import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CountDownLatch;

/**
 * @Auther: zhanghao
 * @Date: 2018/8/10 16:46
 * @Description:线程安全ArrayList
 * @Version:1.0
 */
public class CopyOnWriteArrayListTest {
    public static void main(String[] args) {

        int threadCount = 10;
        CountDownLatch threadSignal = new CountDownLatch(threadCount);
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        ArrayList list = new ArrayList();

     /*   for(int i = 0;i < 10;i++){
            new Thread(new OperateListThread(threadSignal,copyOnWriteArrayList)).start();
        }*/
        for(int i = 0;i < threadCount;i++){
            new Thread(new OperateListThread(threadSignal,list)).start();
        }
        try {
            threadSignal.await();
            System.out.println("线程："+Thread.currentThread().getName()+"等待结束！");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("CopyOnWriteArrayList插入1000条数据后size:"+copyOnWriteArrayList.size());
        System.out.println("ArrayList插入1000条数据后size:"+list.size());
    }

}
