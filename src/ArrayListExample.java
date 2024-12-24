import java.util.ArrayList;
import java.util.Scanner;
public class ArrayListExample {
    public static void main(String[]args){
         //syntax
       ArrayList<Integer> list=new ArrayList<>();
     /*   list.add(1);
        list.add(34);
        list.add(78);
        list.add(17);
        list.add(334);
        list.add(748);
        System.out.println(list);
        System.out.println(list.contains(12));//if 12 is contain or not (t/F)
        list.set(0,99);//replace index 0 to 99
        list.remove(2);
        System.out.println(list);

      */
/// ---->1.

        Scanner sai=new Scanner(System.in);
        //input
        for(int i=0;i<5;i++){
            list.add(sai.nextInt());
        }
        System.out.println(list);



    }
}
