package homework6.task1;

public class Vehicle {
    public class Wheel {
        String color = "black";
     public void printWheelColor(){
         System.out.println("Wheel color: " + color);
     }
    }

    public class Door {
        String color = "Red";
        public void printDoorColor(){
            System.out.println("Door color: " + color);
        }
    }
}
