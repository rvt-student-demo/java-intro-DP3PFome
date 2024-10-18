package lv.rvt;

public class Stars {

    public static void printStars(int number) {
        for(int i=0; i<number; i++){
            System.out.print("*");
        }
    }

    public static void printSquare(int size){
        for(int i=0; i<size; i++){
            printStars(size);
            System.out.println();
        }
    }

    public static void printRectangle(int width, int height){
        for(int i=0; i<height; i++){
            printStars(width);
            System.out.println();

        }
    }

    public static void printTriangle(int size){
        int m=size*(-1);
        for(int x=size-1; x>m;x--){
            printSpaces(x);
        
            printStars(size-x);
            System.out.println();
            
            
            
        }
    }

    public static void printSpaces(int number){
        for(int i=0;i<number;i++){
            System.out.print(" ");
        }
        
    }
    public static void christmasTree(int height){
        for (int i = 0; i<height;i++){
            printSpaces(height-i);
            printStars(i*2+1);
            System.out.println();
        }
        for (int i = 0;i<2;i++){
            printSpaces(height-1);
            printStars(3);
            System.out.println();
        }
    }

 
}
