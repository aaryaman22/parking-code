import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
public class OperationToDo
{
    Scanner sc = new Scanner(System.in);
    HashMap<String, Details> parkingLog = new HashMap<String, Details>();
    //reflection creates overhead
    public void park(ArrayList<Level> arr1 , int levels)
    {
        Details ob = new Details();
        ob.takeDetails();
        CheckVehicle object = new CheckVehicle();
        Details chk = object.isThere(ob.number , parkingLog);
        if(chk!=null)
        {
            System.out.println("Cannot Park 2 vehicle of same number");
        }
        else {
            FindingSpot fs = new FindingSpot();
            int levelNo = fs.findSpot(arr1 , levels , ob , parkingLog);
            if(levelNo>-1) {
                switch (ob.type) {
                    case "bus":
                        arr1.get(levelNo).busSpot--;
                        break;
                    case "car":
                        arr1.get(levelNo).carSpot--;
                        break;
                    case "bike":
                        arr1.get(levelNo).bikeSpot--;
                        break;
                }
                System.out.println("vehicle parked");
            }else System.out.println("No space to park");
        }

    }

    public void retrive(ArrayList<Level> arr1)
    {
        CheckVehicle object = new CheckVehicle();
        System.out.println("enter your vehicle number");
        String number = sc.nextLine();
        Details chk = object.isThere(number , parkingLog);
        if(chk!=null)
        {
            String type = chk.type;
            switch (type)
            {
                case "bus":
                     arr1.get(chk.level).busSpot++;
                    break;
                case "car":
                    arr1.get(chk.level).carSpot++;
                    break;
                case "bike":
                    arr1.get(chk.level).bikeSpot++;
                    break;
            }
        }
    }

    public void doOperation(ArrayList<Level> arr1 , int levels)
    {
        System.out.println("if you want to take out vehicle type out else in");
        String currentOperation;
        currentOperation = sc.nextLine();

        switch(currentOperation)
        {
            case "out":
                retrive(arr1);
                break;
            case "in":
                park( arr1 , levels);
                break;
            default:

                System.out.println("Invalid Choice");
        }
    }
}