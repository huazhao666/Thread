package safe;

/**
 * Created with Intellij IDEA
 * Description:
 * User : 花朝
 * Date : 2020-12-31
 * Time : 10:00
 */
public class MySynchronized {
    //对this枷锁；
    synchronized int add(int a,int b){
        return 0;
    }
    //类得反射对象加锁
    synchronized static void sayH(){

    }
    static void app(){
        Object object1 = new Object();
        synchronized (object1){
        }

    }
}
