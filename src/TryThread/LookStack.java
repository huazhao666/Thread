package TryThread;

/**
 * Created with Intellij IDEA
 * Description:
 * User : 花朝
 * Date : 2020-12-23
 * Time : 9:50
 */
public class LookStack {
    public static void a(){
    }
    public static void b(){
        a();
    }
    public static void c(){
        b();
    }
    public static void d(){
        c();
    }
    private static class MyThread extends Thread{
        @Override
        public void run() {
            h();
        }
    }
    public static void h(){

    }
    public static void main(String[] args) {
        d();
    }
}
