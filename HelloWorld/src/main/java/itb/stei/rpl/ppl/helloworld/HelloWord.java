package itb.stei.rpl.ppl.helloworld;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class HelloWord 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        System.out.println("Nama : ");
        Scanner in = new Scanner(System.in);
        String nama = in.nextLine();
        System.out.println("\n\n");
        System.out.println("============================");
        System.out.println( "Hello, " + nama);
        
    }
}
