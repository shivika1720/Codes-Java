class Fruits
{
  int no_of_fruits= 10;
  
  class Apple extends Fruits
  {
    int no_of_fruits=5;
    void count()
    {
      System.out.println(no_of_fruits);   // output- 10
      System.out.println(this.no_of_fruits); // output- 5
      System.out.println(super.no_of_fruits); // output- 15
    }
    public static void main(String[] args)
    {
      Apple a=new Apple();
      a.count(15);
    }
  }
