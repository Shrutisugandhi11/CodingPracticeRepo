package org.example.basic;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {Account<Gold> account=new Account<Gold>();
        account.getAccountType(new Gold());

        System.out.println( "Hello World!" );
    }
}
