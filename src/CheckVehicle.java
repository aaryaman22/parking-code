import java.util.HashMap;
import java.util.Scanner;

public class CheckVehicle {
    Scanner sc;
    public Details isThere(String vehicleNumber , HashMap<String, Details> vehicalDetails)
    {
        try {

            Details isVecicleThere =  vehicalDetails.get(vehicleNumber);// return a details obj
            int level = isVecicleThere.level;
            String number = isVecicleThere.type;
            return isVecicleThere;
        }
        catch (Exception e)
        {
            System.out.println("ofc veh not there");
        }
        return null;
    }
    public CheckVehicle()
    {
        sc = new Scanner(System.in);
    }
}
