class question {  
// Define constant array size
static final int random1 = 5;
static final int random2 = 10;

    public static void main(String args[]){

     // Create array of doubles 2 D
      int[][] array2D = new int[random1][random2];
	// Assign random values 
       for (int i=0; i<random1; i++) {
          for (int j=0; j<random2; j++) {
	      array2D[i][j] = (int) (Math.random() * 10)+1;    
          }     
       }
      // Print the results for each cell in a table
      // Switching the printing order to display months in columns
      for (int j=0; j<random1; j++) {
          for (int i=0; i<random2; i++) {
	      System.out.print(array2D[j][i] + " "); 
          }
	    System.out.println("\t");     
       }

    }
}