
import java.util.Scanner;
class sudoku{
    static int [][] arr=new int [9][9];                         
    public static void mark(int row,int col,int num){
        arr[row][col]=num;
        // check(row, col, num);
    }
    static void check(int row,int col,int num){
        for(int i=col+1;i<arr.length;i++){
            if(num==arr[row][i]){
                System.out.println("GAME OVER[H O R I Z O N T A L L Y] : ");
                break;
            }
        }
        for(int j=col-1;j>=0;j--){
            if(num==arr[row][j]){
                System.out.println("GAME OVER H O R I Z O N T A L L Y");
                break;
            }
        }
        for(int i=row+1;i<arr.length;i++){
            if(arr[row][col]==arr[i][col]){
                System.out.println("GAME OVER [V E R T I C A L L Y ]  ");
                break;
            }
        }
        for(int i=row-1;i>=0;i--){
            if(num==arr[i][col]){
                System.out.println("GAME  OVER VERTICALLY:");
                break;
            }
        }
        // board();
        
    }
    static void board(){
        System.out.println(" --------------------------------------");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
            System.out.print(" | "+arr[i][j]);
            }System.out.println(" |");
            System.out.println(" -------------------------------------");
        }        
    }   
    public static void main(String[] args) {
        mark(0, 0, 1);
        mark(1,1,5);
        mark(0, 1, 9);  

        mark(5, 0, 1); 
        check(0, 6,9 ); 
        board(); 
    }
}
    


    

