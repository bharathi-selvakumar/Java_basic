package Multiple_inheritance;

public class Hotel extends Meals implements Lunch,Morningtiffen,NightDinner {

    @Override
    public void lunch() {
        System.out.println("briyani is available Lunch");
    }

    @Override
    public void morningtiffen() {
        System.out.println("Dosa and idly is availabe for morning_Tiffen");
    }
    @Override
    public void dinnner() {
        System.out.println("chapathi and Barotta is available for Dinner");

    }

    public static void main (String[] args){
        Hotel obj=new Hotel();
        obj.dinnner();
        obj.morningtiffen();
        obj.meals();
        obj.lunch();
    }
}
