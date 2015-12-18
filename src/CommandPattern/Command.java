/*
 * 文件名：Command.java
 * 版权：Copyright 2007-2015 517na Tech. Co. Ltd. All Rights Reserved. 
 * 描述： Command.java
 * 修改人：yunhai
 * 修改时间：2015年12月10日
 * 修改内容：新增
 */
package CommandPattern;

/**
 * 行为接口。抽象命令类，定义了每个具体命令被执行的入口方法execute().
 * 
 * 每个命令类都只有一个执行命令的方法execute，作用就是无条件执行命令。
 * 
 * @author yunhai
 */
public abstract class Command {
    // 定义之类全局共享变量
    protected final Receiver receiver;

    // 实现类必须定义接收者
    public Command(Receiver receiver) {
        this.receiver = receiver;
    }

    abstract void execute(int[] arr);
}
