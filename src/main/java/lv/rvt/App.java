package lv.rvt;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )

    {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Give points [0-100]:");
        int points = Integer.valueOf(scanner.nextLine());
        if (points<0) {
                System.out.println("Grade: impossible!");
                
        } else if (points > 100 ){
                System.out.println("Grade: impossible!");
            } else if (points<49) {
                System.out.println("Grade: failed");
            } else if (/*50<*/ points<= 59) {
                System.out.println("Grade: 1");
            } else if (/*60 <*/ points <= 69) {
                System.out.println("Grade: 2");
            } else if (/*70 <*/ points <= 79 ){
                System.out.println("Grade: 3");
            } else if (/*80 < */points <= 89 ){
                System.out.println("Grade: 4");
            } else if (/*90 < */points <= 100 ){
                System.out.println("Grade: 5");
            }

/*

        System.out.println("Give speed: ");
        int speed = Integer.valueOf(scanner.nextLine());
        if (speed>120) {
                System.out.println("Speeding ticket!");
                
        }
*/

        //Scanner scanner = new Scanner(System.in);
     //   System.out.println("Give the first number: ");
     //   int sk1 = Integer.valueOf(scanner.nextLine());
     //   
     //   System.out.println("Give the second number: ");
     //   int sk2 = Integer.valueOf(scanner.nextLine());
//
     //   int result = sk1 + sk2;
     //   System.out.println( sk1+"+"+sk2+"="+result);
//
     //   int atnem = sk1 - sk2;
     //   System.out.println( sk1+"-"+sk2+"="+atnem);
//
     //   int reiz = sk1 * sk2;
     //   System.out.println( sk1+"*"+sk2+"="+reiz);
//
     //   double dal = (double) sk1 / sk2;
     //   System.out.println( sk1+"/"+sk2+"="+dal);





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
