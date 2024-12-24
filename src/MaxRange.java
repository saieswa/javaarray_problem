// find the max value in range
public class MaxRange {
    public static void main(String[]args){
        int[]arr={1,22,33,44,6,7};
        System.out.println(max(arr,0,3));
    }
    static int max(int[]arr,int start,int end){
        int maxVal=arr[0];
        for(int i= start;i<=end;i++){
            if(arr[i]>maxVal){
                maxVal=arr[i];
            }
        }
        return maxVal;
    }
}
