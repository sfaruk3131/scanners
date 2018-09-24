import java.util.Scanner;

public class test3
{
    public static void main(String[]args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("What is your name");
        String res = input.next();
        System.out.println("Nice to meet you " + res);

        Scanner input2 = new Scanner(System.in);
        System.out.println("What is your age");
        int num = input2.nextInt();
        System.out.println(num);
    }

}
