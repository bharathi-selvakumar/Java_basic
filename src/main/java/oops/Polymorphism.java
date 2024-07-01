package oops;
///polymorphism mean there is the  methode have the many shape and
            //overloding mean that the  methode have the same name but the parameter is different
            //overriding mean that the method have the same name and same parameter
class overloding {
            public void method1(){
                System.out.println("This method is work without parameter in same method name");
            }

            public void method1(String name){
                System.out.println("This method have the parameter which was created by "+name);

            }
}
public class Polymorphism {
    public static void main(String[] args){
        overloding obj=new overloding();
        obj.method1();
        obj.method1("bharathi");
    }
}


//class overriding{
//    public void ridingMethod(String name1 ,String name2){
//        if(name1== name2){
//            System.out.println("The two name are equal");
//        }
//        else {
//            System.out.println("That is not equal");
//        }
//    }
//}
//
//class overriding2{
//    public void ridingMethod(String name1 ,String name2){
//        if(name1== name2){
//            System.out.println("The two name are equal");
//        }
//        else {
//            System.out.println("That is not equal");
//        }
//    }
//}
