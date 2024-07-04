package array;


import java.util.Arrays;
import java.util.Scanner;


/////////////////////// for-each loop////////////////////////////////////////////////////////////////////

class Insert {
    public  void InsertArray(){
        String[] id={"EvilJack","DevilCrime","kingJD","KingOfDevil"};
        for(String new_id:id) {
            System.out.println("newID : " + new_id);
        }
    }
}

////////////////////////////////print a array using for loop //////////////////////////////////////////////
class Forloop extends Insert{
    public void for_loop(){
        int[] array={1,2,3,4,5};
        System.out.println(array[2]);
        array[2]=10;
        System.out.println(array[2]);

        for(int i=0;i< array.length;i++){
            System.out.println("the array "+array[i]);
        }
    }
}

//////////////////print array using the tostring (to use the tostring mean wa can use the Arrays and import it)///// ////////////////////////////


class TOstring extends Forloop{
    public void TOString(){
        int[] newArray={12,323,455,6667};
        System.out.println("The NewArray"+ Arrays.toString(newArray));
    }
}



class SCanner extends TOstring{
    public void sCANNER(){
        int[] array=  new int[10];
        Scanner scan=new Scanner(System.in);

        System.out.println("Enter the number to inserting into the array");
        for(int i=0;i<array.length;i++){
            array[i]= scan.nextInt();
        }

        for (int new_array:array){
            System.out.println("the array is "+new_array);
        }
    }
}


class UPdate extends SCanner{
    public void Update(){
        String[] Name={"EJ","DevilCrime","kingJD","KingOfDevil"};
        Scanner scan =new Scanner(System.in);
        System.out.println(Arrays.toString(Name));
        System.out.println("Enter the position or Index which you want to update ");
        int Index=scan.nextInt();
        scan.nextLine();
        System.out.println("Enter the name do you want to update");
        String New_name=scan.nextLine();

        Name[Index]=New_name;

        System.out.println("The updated array of Name are "+Arrays.toString(Name));


    }
}


public class array {
    public  static void main(String[] args){
        UPdate obj=new UPdate();
        obj.InsertArray();
        obj.TOString();
        obj.for_loop();
//        obj.sCANNER();
        obj.Update();
    }
}


