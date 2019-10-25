import java.util.Scanner;

public class NumberGuess {
    public static void main(String[] args) {
        int Guess,number;
        String answer;
        Scanner Keyboard;
        Keyboard = new Scanner(System.in);

        do {

            number = generateGuess(1);
            System.out.println("guess a number between 1-100");

            do{

                Guess = Keyboard.nextInt();
                if(number<Guess){
                    System.out.println("Too high");
                }
                if (number>Guess) {
                    System.out.println("Too Low");
                }
            }while(!(Guess == number));

            System.out.println("Good Job. Do you want to play again?");
           answer = Keyboard.nextLine();

        }while(!(answer == "yes")) ;
    }
    public static int generateGuess(int number) {
        for(int i = 0; i<100; i++) {
            number = (int) (Math.random()*100)+1;

        }
return number;

    }
}







