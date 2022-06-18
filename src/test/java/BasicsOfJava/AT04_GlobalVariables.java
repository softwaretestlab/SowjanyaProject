package BasicsOfJava;

import org.junit.Test;

public class AT04_GlobalVariables {
    //global variables can be used in any method
    int i =10;
    int j=20;
    String abc = "testlab";

    @Test
    public void test05(){
        //local variables, can be used in that particular method only
        int l=30;
        //
        int  k=l+i+j; // kvalue is 60
        System.out.println("Value of k is : " + k); //output 60
    }
    @Test
    public void test06(){
        String names = "Software";

        System.out.println("Full String Name : " + names + abc ); //output 60

    }
}
