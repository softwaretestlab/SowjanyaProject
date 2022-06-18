package JavaOOPSconcepts;

import org.junit.Test;

public class AT04_Encapsulation02 {

    @Test
    public void envMethod03(){

        AT03_Encapsulation01 obj = new AT03_Encapsulation01();
        obj.envMethod01(100,100);
        obj.envMethod01(20,30);

        int p=obj.envMethod02(90,90);
        System.out.println("returned value is : "+p);

        int u = (p+30);
        System.out.println("u value is : "+u);
    }
}
