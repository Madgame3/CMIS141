
/*Filename: ReadingData
*Author: Stephen Harrington
*Date: October 16th 2016
*Purpose: Reading Data from a file and output a 
*/
import java.io.*;
public class ReadingData {

    public static void main(String[] args) throws IOException {
        
        BufferedReader br = null;
        String fileName = "data.txt";
        try {
            String line;
            int count = 0;
            br = new BufferedReader(new FileReader(fileName));
            while((line = br.readLine()) != null){
                System.out.println(line);
                count++;
            }
            System.out.println(count + " data values were read");
        }
        catch (IOException ex) {
            ex.printStackTrace();
        }
        
    }  
}
