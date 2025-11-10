//Name: Daisuke Watanabe
//Date: 10/30/25
//Description: This 'Pattern Generator' create a tiangular structures made of numbers and stars.
public class Pattern{
    //precondtion
    //postcondition
    public static void main(String[] args){
        stars(7);
    }
    public static void stars(int rows){
        //code goes here
        int stars =0;
        String output = "*";
        while (stars < rows){
        System.out.println(output);
        output= output+"**";
        stars++;
        }
    }
    // public static void triangle(int rows){
    //     int num = 1;
    //     for (int 1 = rows
    // }
    // public static void odds(int start){
    //     int num1 = 9;
    //     for (int 1 = )
    // }
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