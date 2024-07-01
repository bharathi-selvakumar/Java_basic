package intern;

import java.lang.reflect.Method;

public class day2 {

    public void rwfirst() {
        System.out.println("Without return and without argument ");
    }


    public void rwsecond( String name, long age){
        System.out.println(name+" and the age"+age);
    }

    public String rwthree(){
        System.out.println("return type and without argument");
        return "Rasipuram";
    }
    public static void main(String[] args){
        day2 obj= new day2();
        obj.rwfirst();
        obj.rwsecond("bharathi",19);
        String place = obj.rwthree();
        System.out.println("Mukilan from "+ place);
    }
}
