//Method overloading : ping()
//Method Overriding : display()

class Parent
{

    void display()
    {
        System.out.println("Don't get bored...with regards- Parent");
    }
}

class Child extends Parent
{
    void ping()
    {
        System.out.println("Pinged... Nothing to display");
    }

    void ping(String s)
    {
        System.out.println("Pinged... "+s);
    }

    void display()
    {
        System.out.println("Don't get bored...with regards- Child");
    }
}


public class PolymorphismDemo //Class containing main() method should have the same name as that of the file.
{
    public static void main(String[] args)
    {
        //Creating one object each of Parent and Child.
        Parent p=new Parent();
        Child c=new Child();

        //method overloading
        c.ping();
        c.ping("Hey Everyone!");
        System.out.println("\n\n\n");


        //method overriding
        c.display();    //Child display() is invoked.Child display() shadows(overrides) Parent display()
        System.out.println("\n\n\n");


        // Another Application of Dynamic Method Dispatch : Upcasting
        Parent ref;   //Creating only reference variable of Parent Class
        ref=p;  //ref nows stores 'p' object's reference address.So ref behaves like p.
        ref.display(); //Invokes Parent's display()
        ref=c;  //ref nows stores 'c' object's reference address.So ref behaves like c.
        ref.display(); //Invokes Child's display()



    }
}
