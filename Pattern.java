//Name: Daisuke Watanabe
//Date: 10/30/25
//Description: This 'Pattern Generator' create a tiangular structures made of numbers and stars.
public class Pattern{
    //precondtion
    //postcondition
    public static void main(String[] args){
        // stars(7);
        // triangle(9);
        // odds(9);
        eo(5);
        // pyramid(5);
    }
    public static void stars(int rows){
        // while loop
        int stars = 0;
        String output = "*";
        while (stars < rows){
        System.out.println(output);
        output = output+"**";
        stars++;
        }
    }
 
    public static void triangle(int rows){
        //while loop
        int counts = rows;
        int num = rows;
        for (int i = rows; i > 0; i--) {
            counts = num;
            if (i % 2 == 1) {
                do {
                    System.out.print(i);
                    counts--;
                } while (counts > 0);
                System.out.println("");
            }
            num--;
        }
    }
    public static void odds(int start){
        // for loop
        int ratio = start;
        int num = start;
        for (int i = start; i > 0; i--) {
            ratio = num;
            if (i % 2 == 1) {
                do {
                    System.out.print(i);
                    ratio--;
                } while (ratio > 0);
                System.out.println("");
            }
            num--;
        }
        
    }
    public static void eo(int maxE){
        //E
        //O
        //EE
        //O
        String letter = "E";
        if(maxE%2==0){
            letter = "O";
        }
        for(int i = 0; i < maxE; i++){
            //another loop here
            if (i%2 == 1){
                
            }
            System.out.println(letter);
            
            if(letter.equals("E")){
                letter = "O";
            }
            else{
                letter = "E";
            }
        }
    }
    public static void pyramid(int rows){
        // while loop
        int num = 1;
        int counts = rows * 2 - 1;
        while (rows > 0) {
            counts = rows * 2 - 1;
            int spaces = num-1;
            while(spaces > 0){
                System.out.print(" ");
                spaces--;
            }
            do {
                System.out.print(num);
                counts--;
            }while(counts > 0);
            System.out.println("");
            num++;
            rows--;
        } 
    }
}