package BasicsOfJava;

import org.junit.Test;

public class AT06_createAnObjectAndUseIt02 {

    @Test
    public void test10(){
        //whichever class we are calling we have to create an object of that class
        AT02_LearnAboutMethod_JUnit obj = new AT02_LearnAboutMethod_JUnit();
        obj.test01();
        obj.test02();
    }
}
