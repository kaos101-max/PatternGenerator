//Name: Daisuke Watanabe
//Date: 10/30/25
//Description: This 'Pattern Generator' create a tiangular structures made of numbers and stars.
public class Pattern{
    //precondtion
    //postcondition
    public static void main(String[] args){
        stars(7);
        // triangle(9);
        odds(9);
    }
    public static void stars(int rows){
        //code goes here
        int stars = 0;
        String output = "*";
        while (stars < rows){
        System.out.println(output);
        output = output+"**";
        stars++;
        }
    }
 
    // public static void triangle(int rows){
    //     int trangle = 1;
    //     while (rows < 0){
    //     int output = num;
    //     do{
    //         System.out.println(num);
    //         output--;
    //     } while (output > 0);
    //     System.out.println("");
    //         num += 1;
    //     }
    // }
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
    // public static void eo(int maxE){

    // }
    // public static void pyramid(int rows){

    // }




    // public EO (int max E){
    // String letter = "E"
    // if (max E % 2 == 0)
    //{
        //letter = "o"
    //}}
}