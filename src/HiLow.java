public class HiLow
{
    private int roll; //stores the random number generated from the Throw()
    //a 6-sided dice has a maximum value of 6 and a minimum value of 1
    private int maxSide = 6; // intialize the max value to 6
    private int minSide = 1; // intialize the min value to 1
    //to find both our ranges we make variables for each range. 
    //Each range consist of two variables, a variable for the lowest bound
    //and a variable for the highest bound of the range.
    private int lowBound1; //stores smallest number in the low range
    private int lowBound2; //stores highest number in the low range
    private int hiBound1; //stores smallest number in the hi range
    private int hiBound2; //stores highest number in the hi range
    private int pointCount; //stores the points won/lose, starts at 0
    
    public void Throw (int dices) //the # of dice(s) a user choices to play with
    //gets pass to the parameter
    {   
        //the value of int dices than gets passed into an equation for both maxSide and minSide
        //to figure out what the max value and min value for the # of dice(s) played with
        maxSide = maxSide * dices;
        minSide = minSide * dices;
        roll = minSide + (int)(Math.random()* maxSide);
        //System.out.println("This is the roll: " + roll); //debugger, shows the number generated from roll
    }
    
    public int Value () //method returns the value of roll variable in throw method
    {
        return roll; 
    }
    
    public void setLowRange() //method to set the values in our low range variables
    {
        lowBound1 = minSide;
        lowBound2 = maxSide / 2;
        //System.out.println("This is the lowest bound: " + lowBound1); //debugger
        //System.out.println("This is the highest low bound: " + lowBound2); //debugger
    }
    
    public void setHiRange() //method to set the values in our hi range variables
    {
        hiBound1 = lowBound2 + 1;
        hiBound2 = maxSide;
        //System.out.println("This is the lowest hi bound: " + hiBound1); //debugger
        //System.out.println("This is the hi bound: " + hiBound2); //debugger
    }
    
    public int getLowBound1() //self explainatory returns the value of lowBound1 when called on
    {
        return lowBound1;
    }
    
    public int getLowBound2()
    {
        return lowBound2;
    }
    
    public int getHiBound1()
    {
        return hiBound1;
    }
    
    public int getHiBound2()
    {
        return hiBound2;
    }
    
    public void winPoint() //Increment the points in the game and prompts the score so far
    {
        pointCount++;
        System.out.printf("You won %d game(s)%n", pointCount);
    }
    
    public void losePoint() //Decrement the points in the game and prompts the score so far
    {
        pointCount--;
        System.out.printf("Your score is %d%n", pointCount);
    }
}