import java.util.Random;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Random rnd = new Random();
        Scanner in = new Scanner(System.in);
        int[] dataPoints = new int[100];

        for (int i = 0; i < dataPoints.length; i++)
        {
            dataPoints[i] = rnd.nextInt(100) + 1;
        }

        System.out.println("The values in dataPoints are:");
        for (int i = 0; i < dataPoints.length; i++)
        {
            System.out.print(dataPoints[i] + " | ");
        }
        System.out.println();
        System.out.println();

        int sum = 0;
        for (int i = 0; i < dataPoints.length; i++)
        {
            sum += dataPoints[i];
        }
        double average = (double) sum / dataPoints.length;
        System.out.println("The sum of the random array dataPoints is: " + sum);
        System.out.println("The average of the random array dataPoints is: " + average);
        System.out.println();

        int target = SafeInput.getRangedInt(in, "Enter a value to search for", 1, 100);
        int count = 0;
        for (int i = 0; i < dataPoints.length; i++)
        {
            if (dataPoints[i] == target)
            {
                count++;
            }
        }
        System.out.println("The value " + target + " was found " + count + " time(s) in the array.");
        System.out.println();

        int target2 = SafeInput.getRangedInt(in, "Enter another value to search for", 1, 100);
        boolean found = false;
        int position = -1;
        for (int i = 0; i < dataPoints.length; i++)
        {
            if (dataPoints[i] == target2)
            {
                found = true;
                position = i;
                break;
            }
        }
        if (found)
        {
            System.out.println("The value " + target2 + " was found at array index " + position);
        }
        else
        {
            System.out.println("The value " + target2 + " was not found in the array.");
        }
        System.out.println();

        int min = dataPoints[0];
        int max = dataPoints[0];
        for (int i = 1; i < dataPoints.length; i++)
        {
            if (dataPoints[i] < min)
            {
                min = dataPoints[i];
            }
            if (dataPoints[i] > max)
            {
                max = dataPoints[i];
            }
        }
        System.out.println("The minimum value in dataPoints is: " + min);
        System.out.println("The maximum value in dataPoints is: " + max);
        System.out.println();

        // Task 9
        System.out.println("Average of dataPoints is: " + getAverage(dataPoints));
    }

    public static double getAverage(int[] values)
    {
        int sum = 0;
        for (int i = 0; i < values.length; i++)
        {
            sum += values[i];
        }
        return (double) sum / values.length;
    }
}