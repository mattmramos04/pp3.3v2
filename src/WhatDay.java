public class WhatDay
{
    public static void main (String[] args)
    {
        whatDay(12, "Tuesday");
        whatDay(18, "Wednesday");
        whatDay(10, "Saturday");
        whatDay(40, "Sunday");
    }

    public static void whatDay(int age, String weekDay)
    {
        if (age < 18)
        {
            if(weekDay == "Monday")
            {
                System.out.println("It's a school day");
            }
            else if(weekDay == "Tuesday")
            {
                System.out.println("It's a school day");
            }
            else if (weekDay == "Wednesday")
            {
                System.out.println("It's a school day buddy");
            }
            else if (weekDay == "Thursday")
            {
                System.out.println("It's a school day night go to sleep");
            }
            else if(weekDay == "Friday")
            {
                System.out.println("It's a school day buddy");
            }
            else
            {
                System.out.println("It's a weekend keep sleeping");
            }
        }//end of the age >18

        if (age >= 18)
        {
            if(weekDay == "Monday")
            {
                System.out.println("Go to work NOW");
            }
            else if(weekDay == "Tuesday")
            {
                System.out.println("Workday woohoo");
            }
            else if (weekDay == "Wednesday")
            {
                System.out.println("Go to work");
            }
            else if (weekDay == "Thursday")
            {
                System.out.println("GO TO WORK");
            }
            else if(weekDay == "Friday")
            {
                System.out.println("Surprise it's another work day");
            }
            else if (weekDay == "Saturday")
            {
                System.out.println("It's a weekend, CELEBRATE by sleeping");
            }
            else if(weekDay == "Sunday")
            {
                System.out.println("It's a weekend, CELEBRATE by sleeping");
            }
        }
    }
}