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
public class Lazy3 {
    private static Lazy3 instance = null;
    public static Lazy3 getInstance(){
        if(instance == null) {
            synchronized (Lazy3.class){
                if(instance == null){
                    instance = new Lazy3();
                }
            }
        }
        return  instance;
    }
}
