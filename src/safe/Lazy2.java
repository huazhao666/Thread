package safe;

/**
 * Created with Intellij IDEA
 * Description:
 * User : 花朝
 * Date : 2020-12-31
 * Time : 11:23
 */
//线程安全;
public class Lazy2 {
    private static Lazy2 instance = null;
    public static Lazy2 getInstance(){
        synchronized (Lazy2.class){
            if(instance == null)  instance = new Lazy2();
            return  instance;
        }

    }
}
