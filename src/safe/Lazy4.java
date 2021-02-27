package safe;

/**
 * Created with Intellij IDEA
 * Description:
 * User : 花朝
 * Date : 2020-12-31
 * Time : 11:23
 */
//线程安全;
//二次判段;
// instance = new Lazy3();也可能发生重排序;
public class Lazy4 {
    //volatile 保护instance = new Lazy4()一定是1，2，3；
    //保证出现的instance 实例化结束了；
    private static volatile Lazy4 instance = null;
    public static Lazy4 getInstance(){
        if(instance == null) {
            synchronized (Lazy4.class){ //每个对象都是一把锁；
                if(instance == null){
                    instance = new Lazy4();
                }
            }
        }
        return  instance;
    }
}
