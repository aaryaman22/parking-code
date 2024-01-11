import java.util.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("Enter the number of levels in your parking lot");
        Scanner sc = new Scanner((System.in));
        int levels = sc.nextInt();
        ArrayList<Level> arr1 = new ArrayList<Level>(levels);
        for(int i = 0 ; i < levels ; i++)
        {
            System.out.println("enter the details of " + i + "th  floor");
            System.out.println("enter the bike spaces");
            int bikespot = sc.nextInt();
            System.out.println("enter the car spaces");
            int carstop = sc.nextInt();
            System.out.println("enter the bus spaces");
            int bustop = sc.nextInt();
            arr1.add(new Level(bikespot , carstop , bustop));
        }
        while(true)
        {
            OperationToDo op = new OperationToDo();
            op.doOperation(arr1 , levels);
        }
    }
}