package javaapplication4;

/*Filename: Crime
*Author: Stephen Harrington
*Date: October 16th 2016
*Purpose: 
*/
import .*;
import java.io.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CrimeData_old {
    //private vailables
    private List CrimeData = new ArrayList();
    //other variables
       
public void setCrimeData(BufferedReader file){
    BufferedReader CSVFile = file;
    try {
        String dataRow = CSVFile.readLine(); //skip first line
        dataRow = CSVFile.readLine();
        while(dataRow != null){
            String[] dataArray = dataRow.split(",");
            CrimeObject CrimeObject = new CrimeObject(
                (Short.valueOf(dataArray[0])),//year
                (Integer.valueOf(dataArray[1])),//population
                (Integer.valueOf(dataArray[2])),//violentcrime
                (Double.valueOf(dataArray[3])),//violentrate
                (Integer.valueOf(dataArray[4])),//murder
                (Double.valueOf(dataArray[5])),//murder rate
                (Integer.valueOf(dataArray[6])),//rape
                (Double.valueOf(dataArray[7])),//rape rate
                (Integer.valueOf(dataArray[8])),//robbery
                (Double.valueOf(dataArray[9])),//robery rate
                (Integer.valueOf(dataArray[10])),//Assault
                (Double.valueOf(dataArray[11])),//Assault rate
                (Integer.valueOf(dataArray[12])),//property crime
                (Double.valueOf(dataArray[13])),//property crime rate
                (Integer.valueOf(dataArray[14])),//Burglary
                (Double.valueOf(dataArray[15])),//burglary rate
                (Integer.valueOf(dataArray[16])),//larceny
                (Double.valueOf(dataArray[17])),//larceny rate
                (Integer.valueOf(dataArray[18])),//vehicle
                (Double.valueOf(dataArray[19]))//vehicle rate
            );

            CrimeData.add(CrimeObject);//adding current object to Array
            dataRow = CSVFile.readLine();//move to the next line
        }
    }
    catch (IOException ex) {
        ex.printStackTrace();
    }
}

public int getLength(){
        return CrimeData.size();
    }

public void getPopulationGrowth(){
    int i = 0;
    while(i > CrimeData.size()){ 
        CrimeData.get(i);
            
        i++;
    }
}
}

    
        
     
