import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;

public class ReadAndWrite
{
    void readFile() throws FileNotFoundException
    {
	FileInputStream fis= new FileInputStream("d:/abc.txt");
	
    }

    void writeFile() throws FileNotFoundException
    {
	FileOutputStream fos= new FileOutputStream("d:/xyz.txt");
	
    }
}

class Test
 {
    public static void main(String[] args)
    {
    	ReadAndWrite rw= new ReadAndWrite();
    	try
    	{
    		rw.readFile();
    	}
    	catch(FileNotFoundException e)
    	{
    		e.printStackTrace();
    	}
    	System.out.println("hello");
    	try
    	{
    		rw.writeFile();
    	}
    	catch(FileNotFoundException e)
    	{
    		e.printStackTrace();
    	}
    	System.out.println("hey");
    }
 }

