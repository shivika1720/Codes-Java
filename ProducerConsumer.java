import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ProducerConsumer
{

    public static void main(String args[])
    {
        Vector vec = new Vector();
        int size = 4;
        Thread pT = new Thread(new Producers(vec, size), "Producer");
        Thread cT = new Thread(new Consumers(vec, size), "Consumer");
        pT.start();
        cT.start();
    }
}

class Producers implements Runnable
{

    private final Vector vec;
    private final int SIZE;

    public Producers(Vector vec, int size)
    {
       this.vec = vec;
       this.SIZE = size;
    }

    @Override
    public void run()
    {
        for (int i = 0; i < 7; i++)
        {
            System.out.println("Produced: " + i);
            try
            {
               produces(i);
            }  catch (InterruptedException ex)
            {
                Logger.getLogger(Producers.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }

    private void produces(int i) throws InterruptedException
    {

        while (vec.size() == SIZE)
        {
            synchronized (vec)
            {
                System.out.println("Queue is full " + Thread.currentThread().getName()
                                    + " is waiting , size: " + vec.size());

                vec.wait();
            }
        }

        
        synchronized (vec)
        {
            vec.add(i);
            vec.notifyAll();
        }
    }
}

class Consumers implements Runnable
{

    private final Vector vec;
    private final int SIZE;

    public Consumers(Vector vec, int size)
    {
        this.vec = vec;
        this.SIZE = size;
    }

    @Override
    public void run()
    {
        while (true)
        {
            try
            {
                System.out.println("Consumed: " + consumes());
                Thread.sleep(50);
            } 
           catch (InterruptedException ex)
            {
                Logger.getLogger(Consumers.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }

    private int consumes() throws InterruptedException
    {
       
        while (vec.isEmpty())
        {
            synchronized (vec)
            {
                System.out.println("Queue is empty " + Thread.currentThread().getName()
                                    + " is waiting , size: " + vec.size());

                vec.wait();
            }
        }

      
        synchronized (vec)
        {
            vec.notifyAll();
            return (Integer) vec.remove(0);
        }
    }
}
