package safe;

/**
 * Created with Intellij IDEA
 * Description:
 * User : 花朝
 * Date : 2020-12-31
 * Time : 11:23
 */
public class Lazy1 {
    private static Lazy1 instance = null;
    public static Lazy1 getInstance(){
        if(instance == null) instance = new Lazy1();
        return  instance;
    }
}
