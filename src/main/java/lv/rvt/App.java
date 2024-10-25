
package lv.rvt;
import java.util.ArrayList;
import java.util.Scanner;
public class App 

{
    public static void main( String[] args )
    {
        
        Scanner scanner = new Scanner(System.in);
        
        int x=2;
        ArrayList<Integer> numbers= new ArrayList();


        System.out.println("Input numbers: ");
        while (x!=-1) {
            Integer i = Integer.valueOf(scanner.nextLine());
            x=i;
            numbers.add(i);
            
            
        }

        Integer start;
        Integer end;

        while (true) {
            System.out.print("From where? ");
            start = Integer.valueOf(scanner.nextLine());
        
            
            System.out.print("To where? ");
            end = Integer.valueOf(scanner.nextLine());
    
            if (start < 0 || start > numbers.size() - 1) {
                System.out.println("Invalid start index");
                
            } 
            else if (start > end) {
                System.out.println("Start index can not be greater then end index");
               
            }
            else if (end <= 0 || end > numbers.size() - 1) {
                System.out.println("Invalid end index");
            }
            else
            { break; }
            
        }
        

        // Tas mums izpildas kad visi indeksi ir pareizi
        for (int i = start;i < end ;i++ ){
            System.out.println(numbers.get(i));

        }

        


    }

    
    


}



