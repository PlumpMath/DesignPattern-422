/*
 * 文件名：CommandPrint.java
 * 版权：Copyright 2007-2015 517na Tech. Co. Ltd. All Rights Reserved. 
 * 描述： CommandPrint.java
 * 修改人：yunhai
 * 修改时间：2015年12月10日
 * 修改内容：新增
 */
package CommandPattern;

/**
 * 具体行为，具体怎么做。
 * 
 * CommandA使用super.receiverA，可不传入Receiver
 * 
 * @author yunhai
 */
public class CommandMultiply extends Command {
    // 声明默认接收者
    public CommandMultiply() {
        super(new ReceiverMultiply());
    }

    // 设置新的接收者
    public CommandMultiply(Receiver receiver) {
        super(receiver);
    }

    public void execute(int[] arr) {
        super.receiver.dosomething(arr);
        super.receiver.sayFinish();
    }
}
