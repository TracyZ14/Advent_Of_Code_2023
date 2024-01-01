public class Day1
{
    private static int sumOfCalibrationValues;
    private static int sumOfCalibrationValues2;

    public static void getCalibrationValue(String lineOfCode)
    {
        String firstDigit = "";
        String lastDigit = "";
        for(int i = 0; (i < lineOfCode.length()) && (firstDigit.equals("")); i++)
        {
            char character = lineOfCode.charAt(i);
            if(Character.isDigit(character))
            {
                firstDigit = String.valueOf(character);
            }
        }
        for(int i = lineOfCode.length() - 1; (i > -1) && (lastDigit.equals("")); i--)
        {
            char character = lineOfCode.charAt(i);
            if(Character.isDigit(character))
            {
                lastDigit = String.valueOf(character);
            }
        }
        int calibrationValue = Integer.parseInt(firstDigit + lastDigit);
        sumOfCalibrationValues = sumOfCalibrationValues + calibrationValue;
    }

    public static int getSumOfCalibrationValues()
    {
        return sumOfCalibrationValues;
    }

    public static void getCalibrationValue2(String lineOfCode)
    {
        String firstDigit = "";
        String lastDigit = "";
        for(int i = 0; (i < lineOfCode.length()) && (firstDigit.equals("")); i++)
        {
            char character = lineOfCode.charAt(i);
            if(Character.isDigit(character))
            {
                firstDigit = String.valueOf(character);
            }
            if(lineOfCode.indexOf("one") == i)
            {
                firstDigit = "1";
            }
            if(lineOfCode.indexOf("two") == i)
            {
                firstDigit = "2";
            }
            if(lineOfCode.indexOf("three") == i)
            {
                firstDigit = "3";
            }
            if(lineOfCode.indexOf("four") == i)
            {
                firstDigit = "4";
            }
            if(lineOfCode.indexOf("five") == i)
            {
                firstDigit = "5";
            }
            if(lineOfCode.indexOf("six") == i)
            {
                firstDigit = "6";
            }
            if(lineOfCode.indexOf("seven") == i)
            {
                firstDigit = "7";
            }
            if(lineOfCode.indexOf("eight") == i)
            {
                firstDigit = "8";
            }
            if(lineOfCode.indexOf("nine") == i)
            {
                firstDigit = "9";
            }
        }
        for(int i = lineOfCode.length() - 1; (i > -1) && (lastDigit.equals("")); i--)
        {
            char character = lineOfCode.charAt(i);
            if(Character.isDigit(character))
            {
                lastDigit = String.valueOf(character);
            }
            String lineOfCodeBackwards = lineOfCode.substring(i);
            if(lineOfCodeBackwards.contains("one"))
            {
                lastDigit = "1";
            }
            if(lineOfCodeBackwards.contains("two"))
            {
                lastDigit = "2";
            }
            if(lineOfCodeBackwards.contains("three"))
            {
                lastDigit = "3";
            }
            if(lineOfCodeBackwards.contains("four"))
            {
                lastDigit = "4";
            }
            if(lineOfCodeBackwards.contains("five"))
            {
                lastDigit = "5";
            }
            if(lineOfCodeBackwards.contains("six"))
            {
                lastDigit = "6";
            }
            if(lineOfCodeBackwards.contains("seven"))
            {
                lastDigit = "7";
            }
            if(lineOfCodeBackwards.contains("eight"))
            {
                lastDigit = "8";
            }
            if(lineOfCodeBackwards.contains("nine"))
            {
                lastDigit = "9";
            }
        }
        int calibrationValue = Integer.parseInt(firstDigit + lastDigit);
        sumOfCalibrationValues2 = sumOfCalibrationValues2 + calibrationValue;
    }

    public static int getSumOfCalibrationValues2()
    {
        return sumOfCalibrationValues2;
    }
}