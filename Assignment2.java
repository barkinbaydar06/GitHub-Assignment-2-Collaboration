import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

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
        System.out.print("1- Find the min\n2- Find the max\n3- Find the average\n4- Find the sum of odd index\n5- Find the sum of even index\n6- Exit\nWhat is your choice?: ");
    }
    public int minNum()
    {
        int out=this.ArrayOfNumbers[0];
        for(int i=1;i<this.ArrayOfNumbers.length;i++)
        {
             if(this.ArrayOfNumbers[i]<out)
             {
                 out=this.ArrayOfNumbers[i];
              }
                    
         }
        return out;
     }
    public int maxNum()
    {
        int out=this.ArrayOfNumbers[0];
        for(int i=1;i<this.ArrayOfNumbers.length;i++)
        {
            if(this.ArrayOfNumbers[i]>out)
             {
                 out=this.ArrayOfNumbers[i];
             }
                    
        }
        return out;
    }
    public int sumOfOddIndex()
    {
        int sum = 0;
        for(int i = 0; i < ArrayOfNumbers.length; i++)
        {
            if (i%2 != 0) 
            {
                sum = sum + ArrayOfNumbers[i];
            }
        }
        return sum;
    }    

    public int getSumOfEvenIndexes(){
        int sum = 0;
        for(int i = 0; i<ArrayOfNumbers.length; i+=2){
            sum += ArrayOfNumbers[i];
        }

        return sum;
    }
    public Integer[] findDifferenceAverage()
    {
        Integer[] DiffFromAve = new Integer[ArrayOfNumbers.length];
        int sum = 0;
        for (int i = 0; i < ArrayOfNumbers.length; i++) {
            sum += ArrayOfNumbers[i];
        }
        int average = sum/ArrayOfNumbers.length;
        for (int i = 0; i < ArrayOfNumbers.length; i++) {
            DiffFromAve[i] =  ArrayOfNumbers[i] - average;
        }
        return DiffFromAve;
    }
    public int findAverage()
    {
        int sum = 0;
        for (int i = 0; i < ArrayOfNumbers.length; i++) {
            sum += ArrayOfNumbers[i];
        }
         int average = sum/ArrayOfNumbers.length;
        return average;
    }
    public void printArray()
    {
        for(int i = 0; i<ArrayOfNumbers.length; i++)
        {
            System.out.print(ArrayOfNumbers[i]+ " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int size;
        boolean quit = false;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        size = in.nextInt();
        Assignment2 array = new Assignment2(size);
        array.printArray();
        do 
        {
        displayMenu();
        int choice = in.nextInt();
        if (choice == 1) 
        {
            int minNum = array.minNum();
            System.out.println("Minimum number in this array is: "+minNum);    
        }    
        if (choice == 2) 
        {
            int maxNum = array.maxNum();
            System.out.println("Maximum number in this array is: " + maxNum);    
        }
        if (choice == 3) 
        {
               int average = array.findAverage();
               Integer[] difference = array.findDifferenceAverage();
               System.out.println("Average of the array is: " + average);
               System.out.println("Differences of numbers in the array from the average are: "+ Arrays.toString(difference) ); 
        }
        if (choice == 4) 
        {
               int sumOfOddIndexes = array.sumOfOddIndex();
               System.out.println("Sum of the numbers with odd indexes in the array is: "+ sumOfOddIndexes);
        }
        if (choice == 5) 
        {
            int sumOfEvenIndex = array.getSumOfEvenIndexes();
            System.out.println("Sum of the numbers with even indexes in the array is: " + sumOfEvenIndex);
        }
        if (choice == 6) 
        {
            quit = true;    
        }
        } while (!quit);
    }
}