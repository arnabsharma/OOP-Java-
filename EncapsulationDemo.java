//Program to set a value and retrieve that value.
import java.util.Scanner;   //importing an in built package 'java.util'

class Wrap
{
    private int n;  //Instance variable is generally 'private' so that it cannot be accessed directly outside that class.

    Wrap()
    {
        n=0;
    }

    //Getter and Setter methods help to implement Encapsulation.They are kept 'public'
    public void setValue(int x)
    {
        System.out.println("Setting Value");
        n=x;
    }

    public int getValue()
    {
        System.out.println("Getting Value");
        return n;
    }
}


public class EncapsulationDemo //Class containing main() method should have the same name as that of the file.
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the number");
        int x=sc.nextInt();

        Wrap w=new Wrap();  //Creating an object of class 'Wrap'
        w.setValue(50);
        System.out.println(w.getValue());
    }
}
