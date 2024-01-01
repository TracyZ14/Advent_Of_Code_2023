import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Day2Runner
{
    public static void main(String[] args)
    {
        File f = null;
        try
        {
            f = new File("AdventOfCode2023Day2Input");
            Scanner s = new Scanner(f);
            while(s.hasNextLine())
            {
                String currentLine = s.nextLine();
                Day2 gameInformation = new Day2(currentLine);
                gameInformation.hasCorrectCubeConfiguration();
                gameInformation.findPower();
            }
            System.out.println("Part 1 answer: " + Day2.getSumOfIDs());
            System.out.println("Part 2 answer: " + Day2.getSumOfPowers());
        }
        catch(FileNotFoundException e)
        {
            System.out.println("File not found");
        }
    }
}