import java.util.Arrays;
public class PassinginFunction {
    public static void main(String[]args){
        int[]nums={1,3,4,5};
        System.out.println(Arrays.toString(nums));

        //function
        change(nums);
        System.out.println(Arrays.toString(nums));

    }
    static void change(int[]arr){
        arr[0]=9;
    }
}
