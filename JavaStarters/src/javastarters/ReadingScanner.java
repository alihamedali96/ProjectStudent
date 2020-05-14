
package javastarters;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ReadingScanner {

public static void main(String[]args) throws FileNotFoundException{ //You need a exception/try and catch when doing this incase it cant find the file
    
    String Filename = "C:\\Users\\Ali\\Desktop\\JavaStartersTxtFile.txt";
    //String Filename = "JavaStartersTxtFile.txt"; // you can also do it that like if you have the textfile in the root directory of you project (Cant figure out how to do it on Netbeans)
    File textfile = new File(Filename); //Now we created the file object
    
    
        Scanner in = new Scanner(textfile);// The java scanner class reads "input" -- learn more on scanner class
        int value = in.nextInt(); // takes the first int and puts in into value
        System.out.println("Value is " + value);
        in.nextLine(); // if we dont add this then the next line will be an empty line
        
        
        while(in.hasNextLine()){ //until there is no more lines in the textfile
        String line = in.nextLine();//take the line and print it
       
        
        System.out.println(line);
        }
        
        in.close(); //you should always close scanner when done
    

}
    
}
