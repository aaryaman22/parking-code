import java.util.Scanner;

public class Details
{
    int level;
    String number , type;
    Scanner sc;
    void takeDetails()
    {
        System.out.println("-----enter the vehicle details--------");
        System.out.println("enter the vehicle type");
        type = sc.nextLine();
        System.out.println("enter the vehicle number");
        number = sc.nextLine();
    }
    Details()
    {
        sc = new Scanner(System.in);
        this.level = -1;
    }
}
