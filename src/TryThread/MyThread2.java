package TryThread;

/**
 * Created with Intellij IDEA
 * Description:
 * User : 花朝
 * Date : 2020-12-21
 * Time : 11:24
 */
public class MyThread2 {
    static class MyTread extends Thread{
        @Override
        public void run(){
            System.out.println("子线程");
            while (true){

            }
        }
    }
    public static void main (String[] args){
        Thread thread = new MyTread();
        thread.start(); //获得就绪状态
        System.out.println("父线程"); //这个先打印
        while (true){
        }
    }
}
