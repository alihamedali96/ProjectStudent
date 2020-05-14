package javastarters;
import java.util.Scanner; 
public class JavaStarters {

    public static void main(String[] args) {
        //WhileLoop();    
        //ForLoop();
        //IfStatement(); 
        //Scanner();
        //Do();
        //Switch();
       // Arrays();
       //MultiDimentionalArrays(); // *
       //mess();
       System.out.println(recursionFactorial(3));
    }
    
    public static void WhileLoop(){
        int value = 0;
        
            while(value< 10){
                System.out.println("Hello World" + value);
                value++;
                
                if(value == 5 )
                        break;
            
            }
    }
    
    public static void ForLoop(){
        
            for(int i =0; i < 5; i++){
                System.out.printf("The value of i is: %d ", i); 
                //printf is is a print type which allows formatting
                // %d is replaced with argument after (i)
               
             
            }
    }
    
    public static void IfStatement(){
        
        int value = 15;
        
        if(value < 10){
        }
            
           
    }
    
    public static void Scanner(){
        Scanner input = new Scanner(System.in); 
        
        System.out.println("Enter a word");
        
        String word = input.nextLine();
        
        System.out.println("You Entered " + word);
        
             if("abc".equals(word)){
                
                System.out.println("well done");
             }
    }
    
    public static void Do(){
        Scanner input = new Scanner(System.in); 
        String word;
        
            do{
                System.out.println("Enter a word");
                word = input.nextLine();
               }
        
            while(!"abc".equals(word));
                
        System.out.println("well done");
        }
    
     public static void Switch(){
        Scanner input = new Scanner(System.in); 
        
        System.out.println("Enter a command");
        
        String command = input.nextLine();
        
        switch(command){
            
            case "start":
                System.out.println("machine started");
                break;
            
            case "stop":
                System.out.println("machine stopped");
                break;
                
            default:
                System.out.println("Command not found");
                break;
        
        }
     }
    
     public static void Arrays(){
         int[] numbers;
         numbers = new int[3];
         numbers[0]= 15;
         numbers[1]= 1999;
         numbers[2]= 103;
         
            for( int i=0; i<numbers.length;i++){
            System.out.println(numbers[i]);
            }
         
    }
     
      public static void MultiDimentionalArrays(){
       int [][] grid = { //[][] is always row first then column
           {3, 5, 6,},
           {2, 6, 7},
           {6, 9, 0}
            
           };
      
       /*System.out.println(grid[2][1]); //print 9 
       System.out.println(grid[0][2]); //print 6 */
       
       for(int row = 0; row <grid.length; row++){ //This works by row being 0 then going into the next for loop until all column is printed then jumps out of the loop to make row 1 and go back into the loop of columns
           
           for(int column = 0; column <grid[row].length; column++){
              System.out.print(grid[row][column] + "\t" ); //"\t" adds spacing
           
           }
           System.out.println();
       }

       }
      
      public static void mess(){
            int [][] grid =  new int [3][3];
              
            Scanner input = new Scanner(System.in); 
           
          
          for(int row = 0; row <grid.length; row++){ //This works by row being 0 then going into the next for loop until all column is printed then jumps out of the loop to make row 1 and go back into the loop of columns
        //    grid [][] = input.nextLine();
           for(int column = 0; column <grid[row].length; column++){
             // System.out.print(grid[row][column] + "\t" ); //"\t" adds spacing
           
           }
           //System.out.println();
       }    
      }
       
          public static int recursionFactorial(int value){
          System.out.println(value); // just to show you what number value is
          
          if(value == 1){
          return 1;
          }
              
           return recursionFactorial(value - 1) * value; //Recursion is a method that calls itself (loop)
          
          }

        

}


    


