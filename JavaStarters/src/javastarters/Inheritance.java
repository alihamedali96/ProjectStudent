
package javastarters;

public class Inheritance {
    
    public static void main(String[] args){
    
        Machine mach1 = new Machine();
        Car car1 = new Car();
        
        mach1.start();
        car1.start(); //you can only use machine methods when it car extends the Machine class
        
       // InterF inter1 = new Machine();
       // inter1.showInfo();
        
       //Upcasting
        Machine mach2 = car1; // This is called upcasting because we made car1 now a parent class
       // mach2.car(); // you cannot access child classes methods even though its pointing to car1 object
        mach2.start(); // This still uses the car method of start
        
        //Downcasting
        Machine mach3 = new Car(); 
        Car car2 = (Car)mach3; // This is downcasting - be careful with downcasting
        car2.car();
        car2.start();
    
    }
    
}
