import java.util.Random;

public class Assignment2 {
    private Integer[] ArrayOfNumbers;
    private int randomNumber;
    private Random rd;
    private Assignment2(int ArraySize)
    {
        ArrayOfNumbers = new Integer[ArraySize];
        rd = new Random();
        for(int i = 0; i<ArraySize; i++)
        {
            randomNumber = rd.nextInt(0, 100);
            ArrayOfNumbers[i] = randomNumber;
        }
    }
    public static void displayMenu()
    {
        System.out.println("1- Find the min\n2- Find the max\n3- Find the average\n4- Find the sum of odd index\n5- Find the sum of even index\n6- Exit\nWhat is your choice?:\n");
    }   
}
