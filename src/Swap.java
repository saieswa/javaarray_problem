import java.util.Arrays;
public class Swap {
    public static void main(String[]args){
        int[] arr={1,5,6,7};
        swap(arr,0,3 );
        //swap 0-->1 ,
        // 4-->7 so,1 will go to place of 7 and vice versa

        System.out.println(Arrays.toString(arr));
    }
    static void swap(int[]arr,int index1,int index2){
        int temp=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;

    }
}
