package TryThread;

import java.util.Random;

/**
 * Created with Intellij IDEA
 * Description:
 * User : 花朝
 * Date : 2020-12-23
 * Time : 9:18
 */
public class ThreadSortDemo {
    private static final Random ran = new Random(202012333);
    private static  long[] crateRandom(int n ){
        long[] array = new long[n];
        for (int i = 0; i < n ; i++) {
            array[i] = ran.nextInt(2 * n);
        }
        return array;
    }

    private static void MyThreadSortS() {
        long[] a1 = crateRandom(40000);
        long[] a2 = crateRandom(40000);
        long[] a3 = crateRandom(40000);
        long[] a4 = crateRandom(40000);
        long[] a5 = crateRandom(40000);
        System.out.println("开始");
        long s = System.currentTimeMillis();
        bubbleSort(a1);
        bubbleSort(a2);
        bubbleSort(a3);
        bubbleSort(a4);
        bubbleSort(a5);
        long e = System.currentTimeMillis();
        double sec = (e-s) / 1000.0;
        System.out.println("单线程"+ sec);
    }
    private static class SortThread extends Thread{
        private final long[] array;
        private SortThread(long[] array) {

            this.array = array;
        }
        @Override
        public void run() {
            bubbleSort(array);
        }
    }
    private static void MyThreadSort() throws InterruptedException {
        long[] a1 = crateRandom(40000);
        long[] a2 = crateRandom(40000);
        long[] a3 = crateRandom(40000);
        long[] a4 = crateRandom(40000);
        long[] a5 = crateRandom(40000);
        System.out.println("开始");
        long s = System.currentTimeMillis();
        Thread t1 = new SortThread(a1);
        Thread t2 = new SortThread(a2);
        Thread t3 = new SortThread(a3);
        Thread t4 = new SortThread(a4);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        bubbleSort(a5);
        t1.join();
        t2.join();
        t3.join();
        t4.join();
        long e = System.currentTimeMillis();
        double sec = (e-s) / 1000.0;
        System.out.println("多线程一共耗时" + sec );
    }
    public static void main (String[] args) throws InterruptedException {
        MyThreadSort();
       // MyThreadSortS();
    }
    public static void bubbleSort(long[] array){
        for (int i = 1; i <= array.length; i++) {
            for(int j = 0;j < array.length-i;j++){
                if(array[j] > array[j+1]){
                    long tmp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tmp;
                }
            }
        }
    }
}
