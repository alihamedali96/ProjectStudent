
package javastarters;

 enum Animal{
     Cat, Dog, Mouse; //these are public static final variables objects of type animal
     
     
}
public class Enum {
    
    public static void main(String[]args){
    
    Animal animal = Animal.Cat;
    
    switch(animal){
            case Cat:
                System.out.println("Cat");
                break;
            case Dog:
                break;
            case Mouse:
                break;
            default:
                throw new AssertionError(animal.name());}

    
    }
    }
