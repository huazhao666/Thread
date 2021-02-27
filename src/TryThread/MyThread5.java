package TryThread;

import java.util.Scanner;

/**
 * Created with Intellij IDEA
 * Description:
 * User : 花朝
 * Date : 2020-12-21
 * Time : 11:57
 */
//多线程计算斐波那契数列
public class MyThread5 {
    private static long fib(int n ){
        if(n < 2) return n;
        return fib(n-1) + fib(n-2);
    }
    private static class MyThread0 extends Thread{
        private final int n;
        MyThread0(int n ){
            this.n = n;
        }
        @Override
       public void run(){
            System.out.println(fib(n));
        }
    }
    public static void main (String[] args){
        Scanner s = new Scanner(System.in);
        while (true){
            int n = s.nextInt();
            Thread t = new MyThread0(n);
            t.start();
        }
    }
}
