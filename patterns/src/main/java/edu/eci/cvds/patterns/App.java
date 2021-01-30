package edu.eci.cvds.patterns;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        String text = "World";
        if (args[0]!=null){
            text = args[0];
        }
        System.out.println( "Hello "+text+"!" );
    }
}
