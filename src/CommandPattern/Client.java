/*
 * 文件名：Client.java
 * 版权：Copyright 2007-2015 517na Tech. Co. Ltd. All Rights Reserved. 
 * 描述： Client.java
 * 修改人：yunhai
 * 修改时间：2015年12月10日
 * 修改内容：新增
 */
package CommandPattern;

import org.junit.Test;

/**
 * 客户端调用类。客户发出命令，计算数组乘积或数组和。
 * 
 * @author yunhai
 */
public class Client {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        // 声明调用者
        Invoker invoker = new Invoker();
        // 定义一个发给接收者的命令,如果我们需要修改命令，只需要更改下面一行的操作。
        Command command = new CommandMultiply();
        // Command command = new CommandSum();
        invoker.setCommand(command);
        invoker.action(arr);

        invoker.action(arr, new CommandSum());// 更简洁
    }

    /**
     * 其他调用方式.
     * 
     */
    @Test
    public void test() {
        int[] arr = {1, 2, 3, 4};
        // 声明调用者
        Invoker invoker = new Invoker();

        // 定义新的接收者，虽同样的效果，但违反命令模式Client只需发布命令的原则，不推荐
        Receiver receiver = new ReceiverMultiply();
        // ReceiverMultiply执行sum命令，可以看到输出为乘积，即Receiver为事件的实际处理者。
        invoker.action(arr, new CommandSum(receiver));
    }
}
