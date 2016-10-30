//Author: Stephen Harrington
//Date: 25 September 2016
//Purpose: Demonstrating Arrays


class alphabet {
    public static void main (String[] args){
        //Decalare Array
        char[] alphabet = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
        
        for(int i=0; i<alphabet.length;i++){
            //printing the array in a loop, much easier
            System.out.println("" + alphabet[i]);
            try {
                //this is adds a delay in between each print statement
                Thread.sleep(750);
            } catch (InterruptedException e) {
                return;
            }
        } 
        //teaching my daughter the alphabet, so I get to sing this all the time!
        System.out.println("Now I know my ABC's next time won't you sing with me!!!");
    }
}