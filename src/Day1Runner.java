import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Day1Runner
{
    public static void main(String[] args)
    {
        File f = null;
        try
        {
            f = new File("AdventOfCode2023Day1Input");
            Scanner s = new Scanner(f);
            while (s.hasNextLine()) {
                String currentLine = s.nextLine();
                Day1.getCalibrationValue(currentLine);
                Day1.getCalibrationValue2(currentLine);
            }
            System.out.println("Part 1 answer: " + Day1.getSumOfCalibrationValues());
            System.out.println("Part 2 answer: " + Day1.getSumOfCalibrationValues2());
        }
        catch(FileNotFoundException e)
        {
            System.out.println("File not found");
        }
    }
}