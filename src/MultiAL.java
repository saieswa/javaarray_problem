import java.util.ArrayList;
import java.util.Scanner;

public class MultiAL {
    public static void main(String[] args) {
        Scanner sai=new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list= new ArrayList<>();

        //intialisation
        for(int i=0;i<3;i++){
            list.add(new ArrayList<>());
        }

        //ADD Elements
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                list.get(i).add(sai.nextInt());
            }
        }
        System.out.println(list);
    }
}
