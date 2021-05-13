import java.util.Scanner;

public class EncodingJava {
    public static void main(String[] args)
    {
        
    	String info;
        String s;
        Scanner sc = new Scanner(System.in);
        Scanner sca = new Scanner(System.in);
        
        System.out.println("Name- Shivika Kejriwal Roll No. R171219048");
        System.out.println("Input String here: ");
        info = sc.next();
        
        int ValueEncode;
        System.out.println("Write the Encounter Value here: ");
        ValueEncode = sca.nextInt();
        //For changing the string using encounter value
        for(int i=0 ; i<info.length(); i++)
        {
             int ascii = info.charAt(i);
             ascii = ascii+ValueEncode;
              if(ascii>122)
            {
                 ascii = ascii - 122;
                 ascii = ascii + 96;
            }
            char asciii = (char)ascii;
            System.out.println("Output String here: "+asciii);
            
        }
    }
}
