//Name: Daisuke Watanabe
//Date: 10/30/25
//Description: This 'Pattern Generator' create a tiangular structures made of numbers and stars.
public class Pattern{
    //precondtion
    //postcondition
    public static void main(String[] args){
        stars(7);
        triangle(9);
        odds(9);
        eo(5);
        pyramid(5);
    }
    public static void stars(int rows){
    //precon: It must have the output of the star
        int stars = 0;
        String output = "*";
        while (stars < rows){
        System.out.println(output);
        output = output+"**";
        stars++;
        }
    }
    //postcon: It results two more stars being added on each layer
    public static void triangle(int rows){
    //precon: It must start by a first number.
        int num = 1;
        while (rows > 0) {
            int counts = num;
            do {
                System.out.print(num);
                counts--;
            } while (counts > 0);
            rows--;
            System.out.println("");
            num += 1;
        }
    }
    //postcon: The lowest number gets higher and adds one more nummber each.
    public static void odds(int start){
    //precon: The must start by a highest odd number under 10
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
    //postcon: The highest odd numbers get lower and loses one number each
    public static void eo(int maxE){
    //E,O,EE,OO
    //precon: It creates layers of numbers if its 'E' or 'O' first.
        int transcribe = 1;
        int depot;
        String letter = "E";
        for (int i = maxE; i > 0; i--) {
            depot = transcribe;
            if (i % 2 == 1) {
                letter = "E";
            } else {
                letter = "O";
            }
            do {
                System.out.print(letter);
                depot--;
            } while (depot > 0);
            System.out.println("");
            transcribe += 1;
        }
        transcribe -= 2;
        maxE--;
        for (int i = maxE; i > 0; i--) {
            depot = transcribe;
            if (i % 2 == 1) {
                letter = "E";
            } else {
                letter = "O";
            }
            do {
                System.out.print(letter);
                depot--;
            } while (depot > 0);
            System.out.println("");
            transcribe -= 1;
        }
    }
    //postcon: it creates layers of letters. 'E' first, then 'O'
    public static void pyramid(int rows){
    //precon: It'll run to create and upside-down triangle
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
    //postcon: '1' had most digits than '5'
}