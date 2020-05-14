
package javastarters;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ReadingFileReader {
    
    public static void main(String[]args){
    
    String Filename = "C:\\Users\\Ali\\Desktop\\JavaStartersTxtFile.txt";
    File file = new File(Filename);
    BufferedReader br = null;
    
        try {
            FileReader fr = new FileReader(file);
             br = new BufferedReader(fr); // When you want to read a file bit by bit, you use bufferedreader
            
            String line;
            
        try {
           while( (line= br.readLine()) != null){ // how to print the whole text file
            System.out.println(line);
            
           }
            
            
            
        } catch (IOException ex) {
            Logger.getLogger(ReadingFileReader.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        } catch (FileNotFoundException ex) {
            System.out.println("File not found: " + file.toString());
        }
        
        try {
            br.close();
        } catch (IOException ex) {
            Logger.getLogger(ReadingFileReader.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        finally{ // a method that runs whether the try or catch methods get run
        
        }
    }
}
