package LoopsNConditionalStatments;
import org.junit.Test;

public class AT03_DoWhileLoop {
    @Test
    public void DoWhileLoopLearn(){

        int ticket=74;
        // first it will jump into do loop and at bottom we will have while condition which has to be satisfied
        // to continue the loop
        do{
            System.out.println("current ticket number is : "+ticket);
            ticket++;
        }while(ticket<80);


    }

}
