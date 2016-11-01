import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Козак on 28.10.2016.
 */
public class ThreadOne {
    public static void main(String args[]) {
        ArrayList<String> list = new ArrayList<String>(Arrays.asList("January","February","March","April","May"
        ,"June","July","August","September","October","November","December"));
        Thread t = Thread.currentThread();
        System.out.println("current thread ==> "+t);
        t.setName("My New Thread");
        System.out.println("after name change ==> "+t);
        try {
            for(String x: list) {
                System.out.println(x);
                t.sleep(1000);
            }
        } catch(InterruptedException ex) {
            System.out.println(t+" is interrupted!");
        }
        System.out.println(t.getName()+" is finished");
    }
}
