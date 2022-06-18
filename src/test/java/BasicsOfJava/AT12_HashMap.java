package BasicsOfJava;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;

public class AT12_HashMap {
    @Test
    public void test16() {
        // here we created an object of Hashmap and this hashmap takes Stringer and Integer as Key:Value
        HashMap<String, Integer> map = new HashMap();
        //at this point there is nothing inside map
        System.out.println(map);
        // lets add key values to map
        map.put("Ricky",11);
        map.put("Bianca",8);
        map.put("Sophy",13);
        System.out.println("print map on console : "+map);
    //size of hasmap
        int mapSize=map.size();
        System.out.println("hasmap size is : "+mapSize);
       // System.out.println(" Key value for "+" Sophy is "+map.get("Sophy"));
        int keyVals =map.get("Sophy");

       Assert.assertEquals(14,keyVals);

        if(map.containsKey("Sophy")){
           int keyVal =map.get("Sophy");
            System.out.println(" Key value for "+" Sophy is "+keyVal);

        }


    }

}
