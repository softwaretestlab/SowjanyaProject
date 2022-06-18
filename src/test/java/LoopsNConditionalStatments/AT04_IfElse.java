package LoopsNConditionalStatments;

import org.junit.Test;

public class AT04_IfElse {
    @Test
    public void IfElseLoopLearn(){

        String browser = "CHROMEs";
        // if condition true then we go into the loop
        if(browser.equalsIgnoreCase("chrome")){
            System.out.println("test case will be executed on chrome");

        }else{
            System.out.println("test case will be execute on IE");
        }
    }


}
