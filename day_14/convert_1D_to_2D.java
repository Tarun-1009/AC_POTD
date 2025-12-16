package day_14;

public class convert_1D_to_2D {
     public int[][] construct2DArray(int[] original, int m, int n) {
        if(m*n!=original.length){
            int[][] arr=new int[0][0];
            return arr;
        }
        int[][] arr =new int[m][n];
        int row,col;
        for(int i=0;i<original.length;i++){
            row=i/n;
            col=i%n;
            arr[row][col]=original[i];
        }
        return arr;
    }
    
}
