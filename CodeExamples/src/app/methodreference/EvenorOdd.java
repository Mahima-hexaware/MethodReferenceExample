package app.methodreference;

public class EvenorOdd
{
  EvenorOdd(int n)
  {
      System.out.println("the value of" + n);
  }
  //Integer n = new Integer(12);
  public static boolean isEven(int n)
  {
    return n % 2 == 0; 
  }
}