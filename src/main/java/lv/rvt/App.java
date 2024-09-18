package lv.rvt;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        //Scanner scanner = new Scanner(System.in);
        System.out.println("Give the first number: ");
        int sk1 = Integer.valueOf(scanner.nextLine());
        
        System.out.println("Give the second number: ");
        int sk2 = Integer.valueOf(scanner.nextLine());

        int result = sk1 + sk2;
        System.out.println( sk1+"+"+sk2+"="+result);

        int atnem = sk1 - sk2;
        System.out.println( sk1+"-"+sk2+"="+atnem);

        int reiz = sk1 * sk2;
        System.out.println( sk1+"*"+sk2+"="+reiz);

        double dal = (double) sk1 / sk2;
        System.out.println( sk1+"/"+sk2+"="+dal);





//
//
//
        //System.out.println("ievadit klase");
        //String klase = scanner.nextLine();
//
        //System.out.println("ievadit vecumu");
        //String vecums = scanner.nextLine();

        
//System.out.println("Sveiki "+vards+" no "+klase+" klase"+" vecuma "+vecums+"!");

    }

}
