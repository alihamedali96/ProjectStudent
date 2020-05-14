//Inner Classes needs work
package javastarters;

 class Robot{
 private int id;

    public Robot(int id) {
        this.id = id;
    }
        //non-static inner classes are used when group together functionality that needs access to instance variables
        private class Brian{ //This is an inner class. An inner class has to be inside the class and can use class variables
 
            public void think(){
                 System.out.println("Robot "+id+ " is thinking");
            }
        }
        //static inner classes doesnt need instance variable but is used you want to group a class with the outer
        public static class Battery{
        
            public void charge(){
                System.out.println("Battery is charging...");
            }
        }
        
    public void start(){
    Brian brian = new Brian();
    brian.think();
    }

}

public class Innerclass {
    
    public static void main(String[]args)
    {
       Robot rob = new Robot(5);
       rob.start();
       
       Robot.Battery battery = new Robot.Battery();
       battery.charge();
       
    }
    
}
