<<<<<<< HEAD
import java.util.Scanner;
import java.util.Arrays;
public class Array {
    public static void main(String[] args) {
       /*
       int[]rnos={2,3,5,6,8};
       System.out.println(rnos);
        */

        Scanner sai=new Scanner(System.in);
        //array of primitive
        /*int[] rnos=new int[5];
        rnos[0]=1;
        rnos[1]=4;
*/

       /* int[]arr=new int[5];
        for(int i=0;i<arr.length;i++){
            arr[i]=sai.nextInt();
        }
*/

        //array of objects
        String[]str=new String[4];
        for(int i=0;i<str.length;i++){
            str[i]=sai.next();
        }
        System.out.println(Arrays.toString(str));
//modify
        str[1]="sai";
        System.out.println(Arrays.toString(str));

    }
}
=======
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}
>>>>>>> 0aa01bc4a1c6280a87b25be0d87d767bf9d8531b
