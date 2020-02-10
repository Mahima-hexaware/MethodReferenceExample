package app.methodreference;

import java.util.function.BiConsumer;

public class CallUsingMethodReference
{
  public static void main(String[] args) {
    
    //testing isEven method of EvenorOdd using EvenorOddPredicate interface method test
    EvenorOddPredicate predicate1 = EvenorOdd::isEven;
    /* referencing instance method of EvenorOdd to test 
    whether the number is passed is even or odd */
    System.out.println(predicate1.test(25));

    //Refering the constructor of EvenorOdd class using method reference

    ConstructorTest result1 = EvenorOdd::new;
    result1.test1(50);


    //Refering the non Static method using MethodReference
    ReadString str = new ReadString();
    CheckString cks = str::readString;
    String s = cks.test("this is a String");
    System.out.println(s);

  }
}
