
package javastarters;

public class Student implements InterFace{
    private int id; // Instance variable - a variable defined in a class **(I think that a instance is an object so instance variable is object variable(changes with each different object)
    private String name;
    private int age; // We use private so no other classs can use it and use getters and setters to access it
    static String year = ("Year 5");  // Static variable ( same for the whole class) - cannot be different for different instance variables
    public static int count = 0; // will count how many objects are being created in counter (a use of static variables)
    
    //CONSTRUCTOR METHODS
    public Student(){ // A constructor method runs everytime you create a new instance variable
        System.out.println("new student created");
        id = count++;
    }
    
    public Student(int age, String name){ //You can have multiple constructors as long as they all have different parameters so java knows which one to run
        this(); // You can call another constructor in an constructor but it needs to be on the first line
        System.out.println(name + " has been created with id " + id + " and age" + age);
        this.name = name;
        this.age = age;
        
    }
    
    public static void showYear(){ //can only access static variables
        System.out.println(year);
        //System.out.println(id); //wont work because its trying to access non-static variable
    }
    
    
    
    //GETTER AND SETTER METHODS
    public void setId(int id) { //getters and setters (Encapsulation) is used so we dont give access to our variables/objects in the code
        this.id = id; //  "this" refers to Instance variable instead of the parameter(local variable)
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    //GETTER AND SETTER METHODS END
    
    int CalculateTimeTillRetirement(){
        int  yearsLeft = 65 - age;
        
       
        return yearsLeft;
    }

    //PASSING PAREMETER METHOD EXAMPLE
    public void speed (double number, String date){ //This is passing paremeters...used for things that change ('number' can be anything)
        System.out.println("Speed: " + number + " on the " + date);
    }
    
    //toString method to name your object
    public String toString(){
    StringBuilder sb = new StringBuilder("");
    sb.append(id); sb.append(" : "); sb.append(name); //effecient way of appending strings instead of concatanating with +
       
    return sb.toString();
    
    }

    @Override
    public void showInfo() { //Interface - needs work!!
       System.out.println("This is could be anything but the method name + parameters has to be the same as the Interface");
    }
    
}
