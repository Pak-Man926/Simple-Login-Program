import java.util.Scanner;

public class Login
{
    public static void main(String[] args)
    {
        System.out.println("==========================================================");
        System.out.println("==========================================================");

        System.out.println(" \t \t Dynasty Login System \t \t");

        System.out.println("==========================================================");
        System.out.println("==========================================================");

        System.out.println("1. Login");

        System.out.println("2.Exit");

        System.out.println("==========================================================");
        System.out.println("==========================================================");

        int selection;
        String name;
        String password;

        Scanner obj = new Scanner(System.in);

        selection = obj.nextInt();

        if (selection == 1)
        {
            Scanner jdk = new Scanner (System.in);

            System.out.println("Enter your name:");

            name = jdk.nextLine();

            System.out.println("Enter your password");

            password = jdk.nextLine();

            System.out.println("==========================================================");

            System.out.println("Login Successful!");

            System.out.println("==========================================================");

        }
        else
        {
            System.exit(0);
        }



    }
}