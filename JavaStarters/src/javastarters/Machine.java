
package javastarters;

public class Machine implements InterFace {
    String Something2; // no modifier has access to same package
    public String Something; // a public variable has access to all
    private String Name = ("Machine type1 ");  //a private variable cannot be accessed by child class or any other class
    protected int ID; // a protected variable can be accessed by a child class and package for the objects of the Parent/sub classes
    
    public void start(){
     
        System.out.println("Machine Started");
    }
    
    public void stop(){
    
        System.out.println("Machine Stopped");
    }

    @Override
    public void showInfo() { // Interface - needs more work!!
        System.out.println("This is the info");
    }
    
}
