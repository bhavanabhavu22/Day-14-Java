
public class thread_sleep {
    public static void main(String args[])
    {
        try{
            Thread.sleep(5000);
        }
        catch(InterruptedException e)
        {
            System.out.println("Interrupted");
        }
        System.out.println("Thread resumed");
    }
}
