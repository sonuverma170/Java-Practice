 class Mythread extends Thread{
    public void run()
    {
for(int i=1;i<=100;i++)
{
    if(i%2!=0)
    {
        System.out.println("odd number"+i);
        System.out.println(Thread.currentThread());
    }
}
try{
Thread.sleep(3000);
}
catch(InterruptedException e)
{
    e.printStackTrace();
}
    }
}
public class threadeception {
    public static void main(String[] args) {
        Mythread t= new Mythread();
        t.start();
        for(int i=1;i<=100;i++)
        {
            if(i%2==0)
            {
                System.out.println("even number"+i);
            }
        }



    }
    
}
