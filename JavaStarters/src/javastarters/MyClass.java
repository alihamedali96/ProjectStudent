package javastarters;

public class MyClass {
    public static void main(String[]args){
        
    Student student1 = new Student(); 
    Student student2 = new Student(15, "James"); // proof of second constructor running
    Student student3 = new Student(16, "Reece");
    
    
    student1.setId(1);
    student1.setName("Mark"); 
    student1.setAge(15);
    int yearleft = student1.CalculateTimeTillRetirement();
   
   // String date2 = "21st"; // I could use date2 to pass as the parameter for String below (might work different for ints because of how memory works for ints (storage space)
    student1.speed(2.3, "21st"); //Paremeter passing needs to be in order of the types you declared (double then String)
    
    Student.showYear(); //static methods can only be referred to by class and not instance variable/new obj because its the same for the whole class
    
    System.out.println(student1.getName() + " is " + student1.getAge() );
    System.out.println(yearleft);
    System.out.println(student2); // student2 object will now be called by id and name because of toString method ( useful for debugging)
    
    }
    
}
