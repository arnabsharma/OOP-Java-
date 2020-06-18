//Program to add two numbers and display the result

class Sum
{
    //Instance variable
    int a;
    int b;

    Sum()   //Default Constructor
    {
        a=0;
        b=0;
    }

    Sum(int x,int y)   //Parametrized Constructor
    {
        a=x;
        b=y;
    }

    int add()   //Instance method
    {
        return a+b;
    }


}

public class ClassDemo //Class containing main() method should have the same name as that of the file.
{
    public static void main(String[] args)
    {

        Sum s1 =new Sum();  //Invokes Default Constructor
        System.out.println(s1.add());

        Sum s2 =new Sum(10,20);
        System.out.println(s2.add());   //Invokes Parametrized Constructor
    }
}
