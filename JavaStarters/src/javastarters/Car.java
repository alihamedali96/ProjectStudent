
package javastarters;

public class Car extends Machine {
    
    @Override // this override annotation ensures and checks the parent class to see if the method names match therefore overriding an existing method
    public void start(){ //you can override methods from the parent class
     
        System.out.println("Car Started");
    }
    
    public void car(){
        
    System.out.println("Car");
    }
    
}
