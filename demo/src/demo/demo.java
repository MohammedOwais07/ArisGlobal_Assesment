package demo;


public class demo{


	public static void main(String[] args) {
       cars car=new cars();
       car.setDoor("open");
       car.getDoor();
       car.setDriver("MOhammed");
       car.getDriver();
       car.setEngine("petrol");
       car.getEngine();
       car.setSpeed(100);
       car.getSpeed();
       var c=car.toString();
      
       System.out.println(c);

    }
	}
