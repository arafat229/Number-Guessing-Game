import java.util.Scanner;

public class Main {
    public static Scanner s = new Scanner(System.in);

public static int number;
    public static void main(String[]args)
    {
        starting();
    First:
        for (int i = 1; i<4 ;i++) {
            System.out.print("Minimum Value:");
            int min = s.nextInt();
            s.nextLine();
            System.out.print("Maximum Value:");
            int max = s.nextInt();
            s.nextLine();
            if (range(min,max)) {

                System.out.println("Enter the number of time you wish to play within 5 and 10 ");
                System.out.print("Number of times: ");
                int limit = s.nextInt();
                if (limit<=10 && limit>=5)
                {

                    number = guessedNumber(min, max);
                    for ( int j =1 ;j<=limit;j++)
                    {
                        System.out.println("Enter the correct number");
                        int userInput = s.nextInt();
                        if (number<userInput)
                        {
                            System.out.println("Too high");
                        }
                        else if (number>userInput)
                        {
                            System.out.println("Too low");
                        }

                        else
                        {
                            System.out.println(" !!!!!!!!!!!!!!!!!!!! Congratulation !!!!!!!!!!!!!!!! ");
                            System.out.println( "!!!!!!!!!!!!!!!!!!! you win !!!!!!!!!!!!!!!!!!! ");
                        break First;
                        }
                        System.out.println(limit - j + " test(s) remain");

                          if( j >= limit)
                    {
                        System.out.println("!!!You loose!!!");
                        break First;
                    }
                    }
                }

                System.out.println(" !!!Wrong input!!! ");
                System.out.println((3 - i) + " test(s) remain");



            } else {

                    System.out.println((3 - i) + " test(s) remain");
                    System.out.println(" ******* NB:Make sure the range between Min and Max value is 10 ******* ");
            }

        }
        System.out.println("The correct number is: "+number);
    }
public static boolean range(int min,int max)

{
    return ((max-min) >=10);

}
public static void starting ()
{
    System.out.println("Starting....");
    System.out.println("Guess the correct number");
    System.out.println(" ******* NB:Make sure the range between Min and Max value is not less than 10 ******* ");

}
public static int guessedNumber (int min ,int max )
{
int number = (((min/3)+(max/3))*3)/2;
   // System.out.println(number);
    return number;
}
}