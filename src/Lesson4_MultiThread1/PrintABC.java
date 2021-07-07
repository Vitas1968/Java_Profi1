package Lesson4_MultiThread1;

public class PrintABC
{
    public static void main(String[] args)
    {
       PtintAll ptintAll=new PtintAll();
       PrintA printA=new PrintA(ptintAll);
       PrintB printB=new PrintB(ptintAll);
       PrintC printC=new PrintC(ptintAll);
        Thread trdPrtA = new Thread(printA);
        Thread trdPrtB = new Thread(printB);
        Thread trdPrtC = new Thread(printC);
        trdPrtA.start();
        trdPrtB.start();
        trdPrtC.start();
        try
        {
            trdPrtA.join();
            trdPrtB.join();
            trdPrtC.join();
        } catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    }
}

class PtintAll
{
    private boolean flagA=false,flagB=false,flagC=false;

    protected synchronized void printA()
    {
        System.out.print("A ");
           flagA = true;
        notifyAll();
        while (!flagC)
        {
            try
            {
                wait();
            } catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }
        flagC=false;


    }
    protected synchronized void printB()
    {
        while (!flagA)
        {
        try
        {
            wait();
        } catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    }
            System.out.print("B ");
        flagB=true;
        flagA=false;
            notifyAll();

    }
    protected synchronized void printC()
    {
        while (!flagB)
        {
            try
            {
                wait();
            } catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }
            System.out.print("C ");
        flagC=true;
        flagB=false;
            notifyAll();
    }
}
class PrintA implements Runnable
{
    private PtintAll printAll;
    protected PrintA(PtintAll printAll)
    {
        this.printAll=printAll;
    }
    @Override
    public void run()
    {
        for (int i = 0; i < 5; i++)
        {
            printAll.printA();
        }
    }
}

class PrintB implements Runnable
{
    private PtintAll printAll;
    protected PrintB(PtintAll printAll)
    {
        this.printAll=printAll;
    }
    @Override
    public void run()
    {
        for (int i = 0; i < 5; i++)
        {
            printAll.printB();
        }
    }
}
class PrintC implements Runnable
{
    private PtintAll printAll;
    protected PrintC(PtintAll printAll)
    {
        this.printAll=printAll;
    }

    @Override
    public void run()
    {
        for (int i = 0; i < 5; i++)
        {
            printAll.printC();
        }
    }
}

