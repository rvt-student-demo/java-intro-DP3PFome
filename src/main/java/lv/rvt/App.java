
package lv.rvt;
import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main( String[] args )
    {
        int x=0;
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books2 = new ArrayList<>();
        while(true){
            System.out.print("Title: ");
            String Title = String.valueOf(scanner.nextLine());
            if (Title=="") {
               break;
            }
            System.out.print("Pages: ");
            int Page = Integer.valueOf(scanner.nextLine());
            System.out.print("Publication year: ");
            int Year = Integer.valueOf(scanner.nextLine());


            


            Book book1 = new Book(Title, Page, Year);
            books2.add(book1);
            x++;

        }
        System.out.println("What information will be printed?");
        String information = String.valueOf(scanner.nextLine());
        if (information=="everything"){
            for (int i=0;i<x;i++){
                System.out.println(books2.get(i));
            }
        }
        
    }

    
    


}



