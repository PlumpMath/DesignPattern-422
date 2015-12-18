/*
 * 文件名：Invoker.java
 * 版权：Copyright 2007-2015 517na Tech. Co. Ltd. All Rights Reserved. 
 * 描述： Invoker.java
 * 修改人：yunhai
 * 修改时间：2015年12月10日
 * 修改内容：新增
 */
package CommandPattern;

/**
 * 调用者：任何传入的命令都要接收执行。没得选啊，真悲催
 * 
 * @author yunhai
 */
public class Invoker {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void action(int[] arr) {
        this.command.execute(arr);
    }

    // 定义两种传参方式，实际只需任意一种即可，这种更简洁
    public void action(int[] arr, Command command) {
        command.execute(arr);
    }
}
