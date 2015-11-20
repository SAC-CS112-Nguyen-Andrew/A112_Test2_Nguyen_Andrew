import java.util.Scanner;

public class MainProgram
{
    public static void main (String [] args)
    {
        Scanner input = new Scanner(System.in);
        HiLow randomDice = new HiLow(); //object of class type HiLow we create, this will call the methods we choose to call in class HiLow
        int userGuess; //used to compare with the random number generated and the values in the hi and low range
        
        System.out.println("How many dices do you want to play with?: ");
        int numberofDices = input.nextInt();
        
        randomDice.Throw(numberofDices); //passes the argument numberofDices to the Throw() method which does most of our calcuations.
        randomDice.Value(); //returns value
        randomDice.setLowRange();
        randomDice.setHiRange();
        randomDice.getLowBound1();
        randomDice.getLowBound2();
        randomDice.getHiBound1();
        randomDice.getHiBound2();
        
        System.out.printf("Please guess a number from %d to %d: %n", randomDice.getLowBound1(), randomDice.getHiBound2());
        userGuess = input.nextInt();
        if ( (userGuess < randomDice.getLowBound1() ) || (userGuess > randomDice.getHiBound2()) )
            {
                System.out.printf("You guessed %d! Sorry you have to guess a number from %d to %d.%n", userGuess, randomDice.getLowBound1(), randomDice.getHiBound2());
            }
        else
        {
        
        if ( (randomDice.Value() >= randomDice.getLowBound1() ) && (randomDice.Value() <= randomDice.getLowBound2() ) && (userGuess >= randomDice.getLowBound1() ) && (userGuess <= randomDice.getLowBound2() ) )
            {
                System.out.printf("You guessed %d! The computer generated %d!%n", userGuess, randomDice.Value());
                System.out.printf("You guessed it correct in the low range (%d-%d)!%n", randomDice.getLowBound1(), randomDice.getLowBound2());
                randomDice.winPoint();
            }
        
        else if ( (randomDice.Value() >= randomDice.getHiBound1() ) && (randomDice.Value() <= randomDice.getHiBound2() ) && (userGuess >= randomDice.getHiBound1() ) && (userGuess <= randomDice.getHiBound2() ) )
            {
                System.out.printf("You guessed %d! The computer generated %d!%n", userGuess, randomDice.Value());
                System.out.printf("You guessed it correct in the hi range (%d-%d)!%n", randomDice.getHiBound1(), randomDice.getHiBound2());
                randomDice.winPoint();
            }
            
        else if ( (randomDice.Value() >= randomDice.getLowBound1() ) && (randomDice.Value() <= randomDice.getLowBound2() ) && ( (userGuess >= randomDice.getHiBound1() ) && (userGuess <= randomDice.getHiBound2() ) ) ) 
            {
                System.out.printf("You guessed %d! The computer generated %d!%n", userGuess, randomDice.Value());
                System.out.printf("You guessed it incorrect. You guessed it in the hi range (%d-%d), the computer guess was in the low range (%d-%d).%n", randomDice.getHiBound1(), randomDice.getHiBound2(), randomDice.getLowBound1(), randomDice.getLowBound2());
                randomDice.losePoint();
            }
        
        else 
            {
                System.out.printf("You guessed %d! The computer generated %d!%n", userGuess, randomDice.Value());
                System.out.printf("You guessed it incorrect. You guessed it in the low range (%d-%d), the computer guess was in the high range (%d-%d).%n", randomDice.getLowBound1(), randomDice.getLowBound2(), randomDice.getHiBound1(), randomDice.getHiBound2());
                randomDice.losePoint();
            }
        }   
    }
}