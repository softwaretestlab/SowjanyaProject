package LoopsNConditionalStatments;



    import org.junit.Test;

    public class AT05_ElseIf {
        @Test
        public void ElseIfLoopLearn(){

            String browser = "CHROMEs";
            if(browser.equalsIgnoreCase("chrome")){
                System.out.println("test case will execute on chrome");
            }else if(browser.equalsIgnoreCase("IE")){
                System.out.println("test case will execute on IE");
            }else if(browser.equalsIgnoreCase("FIREFOX")){
                System.out.println("test case will execute on FIREFOX");
            }else{
                System.out.println("Browser is not in the list ");
            }


        }
}
