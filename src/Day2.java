public class Day2
{
    private int gameID;
    private int[] redCubes = new int[10];
    private int[] greenCubes = new int[10];
    private int[] blueCubes = new int[10];
    private static int sumOfIDs;
    private static int sumOfPowers;

    public Day2(String gameRecord)
    {
        this.gameID = Integer.parseInt(gameRecord.substring(5, gameRecord.indexOf(":")));
        String findRed = gameRecord;
        for(int i = 0; (i < redCubes.length) && (findRed.contains("red")); i++)
        {
            int redIndex = findRed.indexOf("red");
            String numberOfRedCubes = "";
            char tensDigit = findRed.charAt(redIndex - 3);
            if(Character.isDigit(tensDigit))
            {
                numberOfRedCubes = String.valueOf(tensDigit);
            }
            char onesDigit = findRed.charAt(redIndex - 2);
            if(Character.isDigit(onesDigit))
            {
                numberOfRedCubes = numberOfRedCubes + String.valueOf(onesDigit);
            }
            redCubes[i] = Integer.parseInt(numberOfRedCubes);
            findRed = findRed.substring(redIndex + 2);
        }
        String findGreen = gameRecord;
        for(int i = 0; (i < greenCubes.length) && (findGreen.contains("green")); i++)
        {
            int greenIndex = findGreen.indexOf("green");
            String numberOfGreenCubes = "";
            char tensDigit = findGreen.charAt(greenIndex - 3);
            if(Character.isDigit(tensDigit))
            {
                numberOfGreenCubes = String.valueOf(tensDigit);
            }
            char onesDigit = findGreen.charAt(greenIndex - 2);
            if(Character.isDigit(onesDigit))
            {
                numberOfGreenCubes = numberOfGreenCubes + String.valueOf(onesDigit);
            }
            greenCubes[i] = Integer.parseInt(numberOfGreenCubes);
            findGreen = findGreen.substring(greenIndex + 4);
        }
        String findBlue = gameRecord;
        for(int i = 0; (i < blueCubes.length) && (findBlue.contains("blue")); i++)
        {
            int blueIndex = findBlue.indexOf("blue");
            String numberOfBlueCubes = "";
            char tensDigit = findBlue.charAt(blueIndex - 3);
            if(Character.isDigit(tensDigit))
            {
                numberOfBlueCubes = String.valueOf(tensDigit);
            }
            char onesDigit = findBlue.charAt(blueIndex - 2);
            if(Character.isDigit(onesDigit))
            {
                numberOfBlueCubes = numberOfBlueCubes + String.valueOf(onesDigit);
            }
            blueCubes[i] = Integer.parseInt(numberOfBlueCubes);
            findBlue = findBlue.substring(blueIndex + 3);
        }
    }

    public void hasCorrectCubeConfiguration()
    {
        boolean correctNumberOfRedCubes = true;
        boolean correctNumberOfGreenCubes = true;
        boolean correctNumberOfBlueCubes = true;
        for(int i = 0; i < redCubes.length; i++)
        {
            if(redCubes[i] > 12)
            {
                correctNumberOfRedCubes = false;
            }
        }
        for(int i = 0; i < greenCubes.length; i++)
        {
            if(greenCubes[i] > 13)
            {
                correctNumberOfGreenCubes = false;
            }
        }
        for(int i = 0; i < blueCubes.length; i++)
        {
            if(blueCubes[i] > 14)
            {
                correctNumberOfBlueCubes = false;
            }
        }
        if(correctNumberOfRedCubes && correctNumberOfGreenCubes && correctNumberOfBlueCubes)
        {
            sumOfIDs = sumOfIDs + gameID;
        }
    }

    public static int getSumOfIDs()
    {
        return sumOfIDs;
    }

    public void findPower()
    {
        int minimumRed = 0;
        int minimumGreen = 0;
        int minimumBlue = 0;
        for(int i = 0; i < redCubes.length; i++)
        {
            if(redCubes[i] > minimumRed)
            {
                minimumRed = redCubes[i];
            }
        }
        for(int i = 0; i < greenCubes.length; i++)
        {
            if(greenCubes[i] > minimumGreen)
            {
                minimumGreen = greenCubes[i];
            }
        }
        for(int i = 0; i < blueCubes.length; i++)
        {
            if(blueCubes[i] > minimumBlue)
            {
                minimumBlue = blueCubes[i];
            }
        }
        sumOfPowers = sumOfPowers + (minimumRed * minimumGreen * minimumBlue);
    }

    public static int getSumOfPowers()
    {
        return sumOfPowers;
    }
}