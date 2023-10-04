import java.util.Scanner;
import java.util.Random;

class Game {

    public int number;
    public int inputNumber;
    int noOfGusses = 5;
    int minnum = 1;
    int maxnum = 100;

    Game() {
        Random rand = new Random();
        this.number = rand.nextInt(maxnum - minnum + 1) + minnum;

    }

    void takeUserInput() {
        System.out.println("Welcome to the Number Gussing System");
        System.out.println("Gusses the number between 1 to 100....");
        System.out.println("You have 5 chances");

    }

    void isCorrectNumber() {
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <= noOfGusses; i++) {
            System.out.println("Attemp" + i + ":");
            inputNumber = sc.nextInt();
            if (inputNumber == number) {
                System.out.format("You gusses it right ,it was %d\n You gusesed it in %d attemps\n", number,
                        noOfGusses);
                        break;
            } else if (inputNumber > number) {
                System.out.println("Too high....");
            } else if (inputNumber < number) {
                System.out.println("Too low....");
            }
            if (i > 5) {
                System.out.println("Sorry you are run out of attemps");
            }
        }
    }

}

class NumberGussingSystem {
    public static void main(String args[]) {
 String s;
 String str="yes";
        Game g = new Game();
        Scanner obj=new Scanner (System.in);
        do{
        g.takeUserInput();
        g.isCorrectNumber();
        System.out.println("Do you want to play again yes or no");
        s=obj.next();
        }
        while(s.equals(str));
    }

}
