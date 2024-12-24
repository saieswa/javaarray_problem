import java.util.Scanner;
import java.util.Arrays;
public class MultiDimension {
    public static void main(String[] args) {
        /*`
        int[][] arr = new int[3][];//column size is not necessary

        int[][] arr2D = {
                {1, 2, 3},// 0th index
                {4, 5},//1st index
                {6, 7, 8, 9}//2nd index
        };
        */


        Scanner sai=new Scanner(System.in);
        int [][] arr=new int[3][2];
        System.out.println(arr.length);// no of rows

        // 1. INPUT
        for(int row=0;row< arr.length;row++){
            // for each col in every row
            for(int col=0;col< arr[row].length;col++){
                arr[row][col]=sai.nextInt();
        }
    }
        System.out.print(Arrays.deepToString(arr));
}
}
