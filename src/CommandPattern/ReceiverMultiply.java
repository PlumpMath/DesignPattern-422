/*
 * 文件名：ReceiverB.java
 * 版权：Copyright 2007-2015 517na Tech. Co. Ltd. All Rights Reserved. 
 * 描述： ReceiverB.java
 * 修改人：yunhai
 * 修改时间：2015年12月14日
 * 修改内容：新增
 */
package CommandPattern;

/**
 * 
 * @author yunhai
 */
public class ReceiverMultiply extends Receiver {

    public void dosomething(int[] arr) {
        System.out.println("ReceiverMultiply--实现【数组Multiply操作】！");
        int multiply = 1;
        for (int i : arr) {
            multiply *= i;
        }
        System.out.println("乘积Method：multiply=" + multiply);
    }

    // @Override
    // public void sayFinish() {
    // System.out.println("我的【乘积】工作已经完成了！");
    // System.out.println();
    // }
}
