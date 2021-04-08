public class Frequency
{
	public static void main(String[] args)
	{  
		String str = "water pollution is the contamination of water bodies usullay by the action of human activities water pollution happens when toxic substances enter in the water";
		int[] fre = new int[str.length()];  
		int a, b;  
  
		char string[] = str.toCharArray();  

		for(a = 0; a <str.length(); a++)
		
		{  
			fre[a] = 1;  
			for(b = a+1; b <str.length(); b++)
			{  
				if(string[a] == string[b])
				{  
					fre[a]++;  

					
					string[b] = '0';  
				}  
			}  
		}  

