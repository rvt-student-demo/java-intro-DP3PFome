
package lv.rvt;
import java.util.ArrayList;
import java.util.Scanner;
public class App 

{
    public static void main( String[] args )
    {
        Scanner reader = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        int length =0;
        String word;
        String name = "";
        while (true) {
            String input = reader.nextLine();
            if (input.equals("")) {
                break;
            }
            word=input;
        
            String[] parts = input.split(",");
            sum = sum + Integer.valueOf(parts[1]);
            count = count + 1;
            if (length <word.length()) {
                length = word.length();
                name = word;
            }
        }
        
        if (count > 0) {
            System.out.println("Longest name: " + name);
            System.out.println("Age average: " + (1.0 * sum / count));
        } else {
            System.out.println("No input.");
        }
    }

    
    


}



