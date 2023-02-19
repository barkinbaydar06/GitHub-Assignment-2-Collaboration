/**
 * Assignment2
 */
public class Assignment2 {
    private Integer[] ArrayOfNumbers;
    private int randomNumber;
    private Random rd;
    private Assignment2(int ArraySize)
    {
        ArrayOfNumbers = new String[ArraySize];
        rd = new Random();
        for(int i = 0; i<ArraySize; i++)
        {
            randomNumber = rd.nextInt(0, 100);
            ArrayOfNumbers[i] = randomNumber;
        }
    }
    
}