
package javastarters;

import java.util.Objects;

class Person{
    int id;
String name;
    
    //Generated Code
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + this.id;
        hash = 29 * hash + Objects.hashCode(this.name);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Person other = (Person) obj;
        if (this.id != other.id) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }
    //Generated Code


    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

public class EqualsMethod {
   
     public static void main(String[]args){
    
    Person person1 = new Person(15,"Bob");
    Person person2 = new Person(15,"Bob");
    
    System.out.println(person1.equals(person2)); //You decide what variables make an object equal in the .equals method
    
    System.out.println(person1 == person2); // == tells you whether the reference is pointing to the same object (think memory)
    //Always use .equals when comparing non primitive data types (Strings,arrays,objects..)
    }

    
    
}
