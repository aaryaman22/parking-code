import java.util.ArrayList;
import java.util.HashMap;

public class FindingSpot {
    public int findSpot(ArrayList<Level> arr1, int levels , Details obj  , HashMap<String, Details> parkingLog)
    {
        int spot;
        for(int i = 0 ; i < levels ; i++)
        {
            if(obj.type=="bus")spot = arr1.get(i).busSpot;
            else if(obj.type=="car")spot = arr1.get(i).carSpot;
            else spot = arr1.get(i).bikeSpot;
            if(spot>0)
            {
                parkingLog.put(obj.number , obj); // veh. number is key
                return i;
            }
        }
        return -1;
    }
}
