
package lv.rvt;
import java.util.ArrayList;
import java.util.Scanner;
public class App 

{
    public static void main( String[] args )
    {
        
        Scanner scanner = new Scanner(System.in);
        int sum = 0 ;
        int x=2;
        ArrayList<Integer> wordList= new ArrayList();

        while (x!=-1) {
            Integer i = Integer.valueOf(scanner.nextLine());
            x=i;
            wordList.add(i);
            
            
        }

        
        System.out.print("From where? ");
        Integer fr = Integer.valueOf(scanner.nextLine());
    
        
        System.out.print("To where? ");
        Integer  to = Integer.valueOf(scanner.nextLine());
        

        for (int i = fr;i <to;i++ ){
            System.out.println(wordList.get(i));

        }

        


    }

    
    


}



