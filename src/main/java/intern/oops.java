package intern;


class detail{
    public void student_detail(String name,String roll_number){
        System.out.println("Name of the student is "+name+" and the roll_number of the student "+roll_number);
    }
}
class detail2 extends  detail{
    public float student_cgpa(){
        System.out.println("The cgpa of the student ");
        return 8.12f;
    }
}

///////////////////////////////////////MULTLEVEL  INHERITANCE///////////////////////////////////////////////////////////
        class multi1{
            public void student_detail(){
                System.out.println("Name of the student is bharathi and the roll number is 22CS057");
            }
        }

        class multi2 extends  multi1{
            public void student_address(String place,String TK,String DT){
                System.out.println("Address \n "+ place +" (village)"+"\n "+ TK+ " TK"+ " \n "+DT+" DT");
            }
        }

        class multi3 extends multi2{
            public void student_cgpa(){
                System.out.println("The student CGPA is 8.12");
            }
        }

////////////////////////////////////////hierarchical   inheritance//////////////////////////////////////////////
    class hier1{
        public void student_detail(){
            System.out.println("Name of the student is bharathi and the roll number is 22CS057");
        }
    }

    class  hier2 extends  hier1{
        public void student_address(String place,String TK,String DT){
            System.out.println("Address \n "+ place +" (village)"+"\n "+ TK+ " TK"+ " \n "+DT+" DT");
        }
    }

    class hier3 extends hier1{
        public void student_cgpa(){
            System.out.println("The student CGPA is 8.12");
        }
    }



public class oops {
    public static void main (String[] args){
       /// //single inheritance////////////////////
    //            detail2 obj=new detail2();
    //            obj.student_detail("bharathi","22CS057");
    //            float value=obj.student_cgpa();
    //            System.out.println("cgpa of the student is "+value);
        /////mutilevel inheritance////////////////////
//            multi3 multi_obj=new multi3();
    //            multi_obj.student_detail();
    //            multi_obj.student_address("EMP","Rasipuram","Namakkal");
    //            multi_obj.student_cgpa();
         //hierarchical inheritance ///////////////////
            hier3 hier_obj =new hier3();
//                hier_obj.student_detail();
//                hier_obj.student_cgpa();
             hier2 hier_obj2=new hier2();
                hier_obj2.student_address("EMP","Rasipuram","Namakkal");
                hier_obj2.student_detail();
    }
}




