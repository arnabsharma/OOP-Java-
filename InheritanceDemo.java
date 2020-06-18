/*            A
            /   \
           B     C
          /
         D

*/

class A
{
    int a;
    A() //Default Constructor
    {
        a=0;
    }

    A(int a)    //Parametrized Constructor
    {
        this.a=a;
    }

    public void printValue()
    {

        System.out.println("a : "+a);
    }
}

class B extends A
{
    int b;
    B()
    {
        super();    //Invokes A's Default Constructor
        b=0;
    }
    B(int a,int b)
    {
        super(a);   //Invokes A's Parametrized Constructor
        this.b=b;
    }

    public void printValue()
    {
        super.printValue(); //invokes A's printValue()
        System.out.println("b : "+b);
    }
}

class C extends A
{
    int c;
    C(int a,int c)
    {
        super(a);   //Invokes A's Parametrized Constructor
        this.c=c;
    }

    public void printValue()
    {
        super.printValue(); //invokes A's printValue()
        System.out.println("c : "+c);
    }
}

class D extends B
{
    int d;
    D(int a,int b,int d)
    {
        super(a,b); //Invokes B's Constructor
        this.d=d;
    }

    public void printValue()
    {
        super.printValue(); //invokes B's printValue()
        System.out.println("d : "+d);
    }

}

public class InheritanceDemo //Class containing main() method should have the same name as that of the file.
{
    public static void main(String[] args)
    {
        D objD=new D(10,20,40);

        objD.printValue();  //Invokes D's printValue() as objD is an object of  D

    }
}
