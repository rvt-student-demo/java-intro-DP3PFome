package lv.rvt;
import java.util.Scanner;
public class App 
{
    public static void main( String[] args )
    {
        divisibleByThreeInRange(2, 10);



    }

    public static void divisibleByThreeInRange(int beginning, int end){
        int i=beginning;
        while (i <= end) {
            if (i%3==0) {
                System.out.println(i);
            }
            i++;
            
        }
        
    }


}

/*

System.out.println("Give numbers:");
        Scanner scanner = new Scanner(System.in);
        int sk = Integer.valueOf(scanner.nextLine());
        int i=0;
        while (i<sk) {
            printText();
            i++;
        }


      
        
       
    }
    public static void printText() {
        System.out.println("In a hole in the ground there lived a method");
    }












  Scanner scanner = new Scanner(System.in);
        System.out.print("Last number? ");

        
        
        int i=0;
        int sum=0;
        int odd=0;
        System.out.println("Give numbers:");

    while (true) {
        
        int sk = Integer.valueOf(scanner.nextLine());
        
        
        if (sk==-1) {
            System.out.println("Thx! Bye!");
            break;
        }
        if (sk%2!=0) {
            odd++;
        }
        i++;
        sum=sum+sk;
        continue;
    }
    double vid = (double)sum / i;
    System.out.println("Sum: "+ sum);
    System.out.println("Numbers: " + i);
    System.out.println("Average:" + vid);
    System.out.println("Odd: " + odd);

 */



/*
        int sm =0 ;
        int s =1 ;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Give a number:");
            int sk = Integer.valueOf(scanner.nextLine());
            
    
            if (sk == 0) {
                break;
            }
            sm=sm+sk ;
            s=s+1 ;
            
    
            
        }
        System.out.println("Number of numbers:" + s);
        System.out.println("Sum of the numbers:"+ sm);
        




    }
        */

/*
Scanner scanner = new Scanner(System.in);
        System.out.println("Value of the gift?");
        double naud = Integer.valueOf(scanner.nextLine());
        if (naud<5000){
            System.out.println("No tax!");
        } else if (naud >= 5000 && naud <= 25000){
            if (naud*0.08/100>100){
                System.out.println("Tax: "+ naud*0.08/100);
            } else {
                System.out.println("Tax: 100.0");
            }
        } else if (naud>=25000 && naud<=55000) {
            System.out.println("Tax: "+ naud*0.1/100);
            
        } else if (naud>=55000 && naud<=200000) {
            System.out.println("Tax: "+ naud*0.12/100);
            
        } else if (naud>=200000 && naud<=1000000) {
            System.out.println("Tax: "+ naud*0.15/100);
            
        } else if (naud>=1000000 ) {
            System.out.println("Tax: "+ naud*0.17/100);
            
        }


        


System.out.println("Give points [0-100]:");
        int points = Integer.valueOf(scanner.nextLine());
        if (points<0) {
                System.out.println("Grade: impossible!");
                
        } else if (points > 100 ){
                System.out.println("Grade: impossible!");
            } else if (points<49) {
                System.out.println("Grade: failed");
            } else if ( points<= 59) {
                System.out.println("Grade: 1");
            } else if ( points <= 69) {
                System.out.println("Grade: 2");
            } else if ( points <= 79 ){
                System.out.println("Grade: 3");
            } else if (points <= 89 ){
                System.out.println("Grade: 4");
            } else if (points <= 100 ){
                System.out.println("Grade: 5");
            }



---------------------------------------
        System.out.println("Give speed: ");
        int speed = Integer.valueOf(scanner.nextLine());
        if (speed>120) {
                System.out.println("Speeding ticket!");
                
        }


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

*/