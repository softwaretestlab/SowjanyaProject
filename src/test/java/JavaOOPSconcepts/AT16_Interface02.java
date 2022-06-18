package JavaOOPSconcepts;

public class AT16_Interface02 implements AT15_Interface01 {


    public void SumOfNum(){
        int y = 20+x;
        System.out.println("value of y is : "+y);
    }
    public void sub(){
        System.out.println("This is sub method");
    }
    public void div(){
        System.out.println("This is div method");
        // static value
        System.out.println(AT15_Interface01.x);
    }


}
