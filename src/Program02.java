class A
{
    A()
    {
        System.out.println("Calling of parent Constructor : ");
    }
}
class B extends A
{
    B()
    {
        System.out.println("Calling of SubClass Constructor : ");
    }
    {System.out.println("Instance initializer block appear : ");}
}
public class Program02 {
    public static void main(String[] args)
    {
        B b = new B();

    }

}
