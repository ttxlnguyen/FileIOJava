package Step4;

import com.sun.jdi.Value;

import java.io.PrintWriter;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class ReadFour
{
    /**
     * Yes, you can look at the other 
     * examples in this lab to build your solution here.
     */
    public static void main(String[] args) {
        try {
            Scanner fileIn = new Scanner(new File("Step4/input.txt"));
            System.out.println("Reading from file ... ");
            int sum = 0;
            while (fileIn.hasNext())
            {

                String lineIn = fileIn.nextLine();
                String[] input = lineIn.split("\n");

                for (int i = 0; i < input.length; i++) {
                    sum += Integer.parseInt(input[i]);
                }
            System.out.println(sum);
            }
            // Print out a running total of all the
            // values in the input file.
            }
            catch (IOException e){
            System.out.println("File not found");
        }
    }
}