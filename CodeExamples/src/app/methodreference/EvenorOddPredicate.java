package app.methodreference;

@FunctionalInterface
interface EvenorOddPredicate
{
  boolean test(int n);
}