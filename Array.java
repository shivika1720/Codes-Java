class Array
{
   public static void main(String args[])
   {
        int[] array = {11, 62, 35, 14, 20, 37};
        int sum = 0;
        for( int num : array)
      {
         sum = sum+num;
      }
        System.out.println("Sum of array elements is:"+sum);
   }
}
