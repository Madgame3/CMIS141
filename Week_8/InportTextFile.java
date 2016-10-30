import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public class InportTextFile
{
   public static void main(String[] args)
   {    
       int count=0;    

       File file=null;
       Scanner fileScanner=null;
       String fileName="inputDataFile.txt";
       try
       {
        
       
           file=new File(fileName);
       
           fileScanner=new Scanner(file);
                

           while (fileScanner.hasNext())
           {
               double value=fileScanner.nextInt();
               
               System.out.println(value);
               
               count++;
            
            
           }
     
           System.out.println(count+" data values are read");        
       }
   
       catch (FileNotFoundException e)
       {
           System.out.println("File Not Found");
       }


   }
}

