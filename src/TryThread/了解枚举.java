package TryThread;

/**
 * Created with Intellij IDEA
 * Description:
 * User : 花朝
 * Date : 2020-12-23
 * Time : 11:14
 */
public class 了解枚举 {
    enum Gender{
        FEMALE,MALE;
    }
    Gender gender;

    public static void main(String[] args) {
        Gender[] values = Gender.values();
        for (Gender value : values) {
            System.out.println(value);
        }
    }
}
