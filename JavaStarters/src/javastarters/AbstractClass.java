
package javastarters;


public abstract class AbstractClass { //Abstract classes mean we cannot create an object of it and only the child classes can create objects
    
    private int id; 

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
    
    public abstract void start(); // This is an abstract method means that child classes need to override this method just like an interface
}
