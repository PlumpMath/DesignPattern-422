/*
 * 文件名：Recever.java
 * 版权：Copyright 2007-2015 517na Tech. Co. Ltd. All Rights Reserved. 
 * 描述： Recever.java
 * 修改人：yunhai
 * 修改时间：2015年12月10日
 * 修改内容：新增
 */
package CommandPattern;

/**
 * Receiver类： 抽象接收者，定义【每个】接收者【都必须】完成的业务。
 * 
 * 可以定义多个，但都必须是所有接收者都必须做的。
 * 
 * 建议用抽象方法，结合模板方法减少Command之类。
 * 
 * Receiver接收者：Receiver的2个实现类。在实际应用中一般都会被封装掉（除非非常必要， 例如撤销处理）。
 * 
 * abstract而不是implements：定义直接调用的方法。
 * 
 * @author yunhai
 */
public abstract class Receiver {
    public abstract void dosomething(int[] arr);

    public void sayFinish() {
        System.out.println("我的【】工作已经完成了！");
        System.out.println();
    }
}
