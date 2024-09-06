package lv.rvt;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ievadit savu vardu");
        String vards = scanner.nextLine();
        



        System.out.println("ievadit klase");
        String klase = scanner.nextLine();

        System.out.println("ievadit vecumu");
        String vecums = scanner.nextLine();

        
System.out.println("Sveiki "+vards+" no "+klase+" klase"+" vecuma "+vecums+"!");

    }

}
