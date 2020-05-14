
package javastarters;

interface Plant{ // Juat a random interface
    public void grow();
}

public class AnonymousClasses {
    
    public static void main (String[]args){
    
        Machine mach1 = new Machine(){
        @Override
        public void start(){ // We have overriden the start method from the Machine class which now means this new mach1 object is now a child class of Machine with no name
            System.out.println("New anonymous class");
        }
        };
        
        mach1.start(); //Mach1 is a child class with no name
        //Amonymous classes should be used when you want to create one/few objects that are abit different to the Parent class
    
        Plant plant1 = new Plant(){ //Ive just created an anonymous class from the Plant interface
            @Override
            public void grow(){
                System.out.println("Plant growing");
            }
        };
        
        plant1.grow();
        
    }
    
    
}
