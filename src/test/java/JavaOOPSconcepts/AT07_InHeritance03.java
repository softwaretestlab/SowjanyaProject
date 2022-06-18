package JavaOOPSconcepts;

import org.junit.Test;



import org.junit.Test;

    public class AT07_InHeritance03 {

        // as this class AT06_InHeritance02, has inherited all the methods from parent AT05_InHeritance01,
        // now we can use all of these in another class

        @Test
        public void inhMethod05(){
            AT06_InHeritance02 obj = new AT06_InHeritance02();
            obj.inhMethod01();
            obj.inhMethod02();
            obj.inhMethod03();
            obj.inhMethod04();

        }



}


