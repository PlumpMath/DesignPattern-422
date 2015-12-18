/*
 * 文件名：CommandSum.java
 * 版权：Copyright 2007-2015 517na Tech. Co. Ltd. All Rights Reserved. 
 * 描述： CommandSum.java
 * 修改人：yunhai
 * 修改时间：2015年12月10日
 * 修改内容：新增
 */
package CommandPattern;

/**
 * 具体处理行为。
 * 
 * @author yunhai
 */
public class CommandSum extends Command {
    // 声明默认接收者
    public CommandSum() {
        super(new ReceiverSum());
    }

    // 构造函数传递接收者
    public CommandSum(Receiver receiver) {
        super(receiver);
    }

    public void execute(int[] arr) {
        super.receiver.dosomething(arr);
        super.receiver.sayFinish();
    }
}
