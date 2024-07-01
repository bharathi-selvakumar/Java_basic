package oops;
abstract class Abstract{
    public void SpeedOfCar(){
        System.out.println("The car can be reach 280km/h ");
    }
    abstract void colorOfCar();           ///using the abstract class we can create a duplicate object and overwrite using the other class method
    abstract void modal();               ///
    }

 class car1 extends Abstract{
//    public void SpeedOfCar(){
//        System.out.println("The car can be reach 190km/h ");
//    }

     @Override
     void colorOfCar() {
         System.out.println("Blue");
     }

     @Override
     void modal() {
         System.out.println("Ferrari F8");
     }

 }


class car2 extends Abstract{
    public void SpeedOfCar(){
        System.out.println();
    }

    @Override
    void colorOfCar() {
        System.out.println("Blue");
    }

    @Override
    void modal() {
        System.out.println("Ferrari F8");
    }

}
 public class Abstraction{
    public static void main(String[] args){
            car1 obj1=new car1();
            obj1.SpeedOfCar();
            obj1.colorOfCar();
            obj1.modal();
    }
 }
