import java.util.Scanner;

public class NumberGuess {
    public static void main(String[] args) {
        int Guess,number;
        String answer;
        Scanner Keyboard;
        Keyboard = new Scanner(System.in);
        number = 5;

            do{

                Guess = Keyboard.nextInt();
                if(number<Guess){
                    System.out.println("Too high");
                }
                if (number>Guess) {
                    System.out.println("Too Low");
                }
            }while(!(Guess == number));


    }
    public static int generateGuess(int number) {
        for(int i = 0; i<100; i++) {
            number = (int) (Math.random()*100)+1;

        }
return number;

    }
}







