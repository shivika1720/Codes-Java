import java.util.Map;
import java.util.TreeMap;

public class FrequencyWord
{
	static void printFrequency(String str)
    {
        Map<String,Integer> fr=new TreeMap<>();
 
         String arr[]=str.split(" ");
 
        for(int i=0;i<arr.length;i++)
        {
            
            if(fr.containsKey(arr[i]))
            {
                 fr.put(arr[i], fr.get(arr[i])+1);
            }
            else
            {
                 fr.put(arr[i],1);
            }
        }
        
        
        for(Map.Entry<String,Integer> entry:fr.entrySet())
        {
            System.out.println(entry.getKey()+ " - "+entry.getValue());
        }
    }
	
    public static void main(String[] args)
    {
    	 System.out.println("Name- Shivika Kejriwal Roll No. R171219048");
         String str = "What are you trying to achieve in this paragraph and in your whole composition? What is your purpose right here? ";
 
         printFrequency(str);
    }
}
