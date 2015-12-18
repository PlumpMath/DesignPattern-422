/*
 * 文件名：ReceiverSum.java
 * 版权：Copyright 2007-2015 517na Tech. Co. Ltd. All Rights Reserved. 
 * 描述： ReceiverSum.java
 * 修改人：yunhai
 * 修改时间：2015年12月14日
 * 修改内容：新增
 */
package CommandPattern;

/**
 * 每个接收者都必须处理一定的业务逻辑。
 * 
 * @author yunhai
 */
public class ReceiverSum extends Receiver {

    public void dosomething(int[] arr) {
        System.out.println("ReceiverSum--实现【数组sum操作】！");
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        System.out.println("求和Method：sum=" + sum);
    }

    @Override
    public void sayFinish() {
        System.out.println("我的【求和】工作已经完成了！");
        System.out.println();
    }
}
