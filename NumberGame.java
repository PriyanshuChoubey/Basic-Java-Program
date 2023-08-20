import java.util.Scanner;

public class NumberGame {

    int level=1;
    int score=0;
    int flag=0;
    public void startGame(int realNum)
    {
        Scanner take = new Scanner(System.in);
        int attempt=5;

        System.out.print("|| LEVEL: "+level+" || SCORE: "+score+" ");
        while(attempt>0)
        {
            System.out.print("|| ATTEMPTS LEFT: "+attempt+" ||");
            System.out.println();
            int guessNum= take.nextInt();
            if(guessNum==realNum)
            {
                System.out.println("Congratulations!! You guessed correctly.");
                score+=10;
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
                if(attempt!=1)
                    System.out.println("Try again you are close!");
            }
            attempt--;
            flag=0;

        }

    }

    public static void main(String[] args) {
        int min=1;
        int max=10;
        Scanner take = new Scanner(System.in);
        NumberGame ng = new NumberGame();
        int realNum=(int)(Math.random()*(max-min+1)+min);
        System.out.println("On each level completion 10 points will be rewarded.");
        System.out.println("Guess the number between "+min+" and "+max);
        ng.startGame(realNum);
        while (ng.flag==1) {
            ng.startGame((int) (Math.random() * (max - min + 1) + min));
        }
        System.out.println();
        System.out.println("|| Score="+ng.score+" || Level Completed:"+(ng.level-1)+" ||");
        System.out.println("THANK YOU :)");
        System.out.println();
        System.out.println("** GAME OVER **");
    }
}
