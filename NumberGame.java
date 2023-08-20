import java.util.Scanner;

public class NumberGame {
    public int min=1;
    public int max=10;
    int level=0;
    int score=0;
    int flag=0;
    public void startGame(int realNum)
    {
        Scanner take = new Scanner(System.in);
        System.out.println("NOTE: You have only 3 attempts!");
        int attempt=3;
        while(attempt>0)
        {
            System.out.println("Guess the number between "+min+" and "+max);

            int guessNum= take.nextInt();
            if(guessNum==realNum)
            {
                System.out.println("Congratulations!! You guessed correctly.");
                score++;
                level++;
                flag=1;
                break;
            } else if (guessNum>realNum+3) {
                System.out.println("Too High!");
            }
            else if(guessNum<realNum-3){
                System.out.println("Too Low!");
            }
            else {
                System.out.println("Wrong guess!");
            }
            attempt--;
            flag=0;

        }

    }

    public static void main(String[] args) {
        Scanner take = new Scanner(System.in);
        NumberGame ng = new NumberGame();
        int realNum=(int)(Math.random()*(ng.max-ng.min+1)+ng.min);
        ng.startGame(realNum);
        while (ng.flag==1) {
            ng.startGame((int) (Math.random() * (ng.max - ng.min + 1) + ng.min));
        }
        System.out.println("GAME OVER!");
        System.out.println("Score="+ng.score);
        System.out.println("Level="+ng.level);
        System.out.println("THANK YOU :)");
    }
}
