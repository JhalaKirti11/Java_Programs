
import java.util.Scanner;
class rectangle{
    int length;
    int breadth;
    int areaR;

// area of rectangular region;
    public void areaOfRect(int length, int breadth){
        this.areaR = length*breadth;
    }
}

    class tiles extends rectangle{
        int length;
        int breadth;
        int areaT;
    tiles(int length,int breadth){
            this.length = length;
            this.breadth = breadth;
        }

// calculate area of tiles;
    public int areaOfTile(){
        this.areaT = length*breadth;
        return this.areaT;
    }

// claculate the quantity of tiles according to the rectangualr region;
    public int tilesQuantity(){
        int tileArea = areaOfTile();
        int tilesNum = areaR/tileArea;
        return tilesNum;
    }
}

public class _19noOfTiles {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length and breadth of the room:");
        int R_length= sc.nextInt();
        int R_breadth = sc.nextInt();

        System.out.println("Enter the length and breadth of a tile:");
        int T_length= sc.nextInt();
        int T_breadth= sc.nextInt();

        
        tiles ti = new tiles(T_length, T_breadth); 
        ti.areaOfRect(R_length,R_breadth); 
        int tilesNumb = ti.tilesQuantity();
        
        System.out.println("number of tiles required for the rectangular region is "+tilesNumb);
        sc.close();
    }
}  
