//Multiple inheritance is not supported by abstract class,whereas it is supported by interface.


/*
        Smartphone(abstract class)                  Smartphone(abstract class)   Phone(interface)
            |                                                   \                   /
        Samsung                                                  \                /
                                                                  \             /
                                                                   \          /
                                                                    \       /
                                                                      Apple

*/


abstract class Smartphone   //Abstract Class
{
    abstract void os(); //abstract method

    abstract void camera(); //abstract method

    void display()  //concrete method(method with a defined body)
    {
        System.out.println("Hey Smartphone can be used for photography too.");
    }
}

class Samsung extends Smartphone    //All abstract methods must be overridden by its subclass.else the subclass itself will become an abstract class.
{


    void os()
    {
        System.out.println("Android.");
    }

    void camera()
    {
        System.out.println("Primary Camera Resolution: above 12MP.");
    }

}






interface Phone     //Interface
{
    void call();    //abstract method

    void message(); //abstract method

}
//all methods of an interface must be overridden by the class that implements the interface.
//All abstract methods of an abstract class must be overridden by the class that extends the abstract class.
class Apple extends Smartphone implements Phone     //Multiple Inheritance
{
    void os()
    {
        System.out.println("iOS.");
    }

    void camera()
    {
        System.out.println("Primary Camera Resolution: above 8MP.");
    }

    public void call()  //always specify the overridden methods of an interface as public.
    {
        System.out.println("Calling...");
    }

    public void message()   //always specify the overridden methods of an interface as public.
    {
        System.out.println("Messaging...");
    }
}


public class AbstractionDemo //Class containing main() method should have the same name as that of the file.
{
    public static void main(String[] args)
    {

        //We cannot instantiate(create an object of) an abstract class,interface.Although we can create object reference variables of them.
        Smartphone s=new Samsung();

        Apple a=new Apple();

        s.display();
        s.os();


        System.out.println("\n\n\n");
        a.display();
        a.os();
        a.call();

    }
}
