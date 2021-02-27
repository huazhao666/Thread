package safe;

/**
 * Created with Intellij IDEA
 * Description:
 * User : 花朝
 * Date : 2020-12-31
 * Time : 11:17
 */
public class HungryMan {
    private HungryMan(){}
    private static HungryMan x = new HungryMan();

    public  static HungryMan getInstance(){
        return x;
    }
}
