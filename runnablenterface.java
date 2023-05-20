 class Capitalthread implements Runnable
 {
public void run()
{
    for(int i=0;i<=26;i++)
    {
        System.out.println((char) (i+65));
        try{
            Thread.sleep(20);    
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
        }
        {
    }
}
 }

public class runnablenterface {
    public static void main(String[] args) {
        Thread t1 =new Thread(new Capitalthread());
        t1.start();
        for(int i=0;i<=26;i++)
        {
            System.out.println((char) (i+97));
        }
    }
    
}
