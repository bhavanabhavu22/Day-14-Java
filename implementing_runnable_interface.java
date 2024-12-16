
class A implements Runnable
{
    public void run()
    {
        System.out.println("Hello i am Thread");
    }
}
public class implementing_runnable_interface {
    public static void main(String args[])
    {
        A r=new A();
        Thread s=new Thread(r);
        s.run();
    }
}
