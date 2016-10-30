class average{
public static double average(double[] x){
    double total = 0;
    for(int i = 0; i<x.length;i++){
        total += x[i];
    }
    return (total/x.length+1);
    }
}
        

      