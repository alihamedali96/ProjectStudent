package javastarters;

public class StringBuilders {
    
    public static void main(String[] args){
        
        StringBuilder sb = new StringBuilder(""); // strings are immutable but stringbuilder just modifys existing string instead of creating a new one
        sb.append("Hi my Name is ");
        sb.append("Bob");
        
        System.out.println(sb.toString());
        
        ////String Formatting////////////////////////
        System.out.println("Here is some new text\tThis is a new tab\nThis is a new line"); // \t = new tab \n = new line
        
        

    }
    
}
