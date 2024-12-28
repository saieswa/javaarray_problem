// reverse a array in another method using for loop
import java.util.Arrays;

public class Revanother {
    public static void main(String[]args){
        int[]a={10,20,30,40};
        int l=a.length;
        int[]b=new int[l];
        int j=l;
        System.out.println("before"+Arrays.toString(a));
        for(int i=0;i<a.length;i++){
            b[j-1]=a[i];
            j--;
        }
        System.out.println("After"+Arrays.toString(b));


    }
}
