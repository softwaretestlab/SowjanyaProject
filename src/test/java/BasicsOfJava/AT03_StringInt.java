package BasicsOfJava;

import org.junit.Test;

public class AT03_StringInt {

    @Test
    public void test03() {
    //Here we declares local variables, these variables can be used only in this method
        int i=10;
        int j=20;
        int k =i+j;
        //print on console
        System.out.println("Value of k is : " + k); //output Value of k is : 30
        //to add i and j we have to take them in brackets
        System.out.println("Value of k is : " + (i+j)); //output Value of k is : 30

    }

    @Test
    public void test04() {
        //lets declare some strings
        String test01= "Software";
        String test02= "TestLab";
        String test03= test01+test02;
        System.out.println("Value of Test01 is :"+test03 );


    }
}
