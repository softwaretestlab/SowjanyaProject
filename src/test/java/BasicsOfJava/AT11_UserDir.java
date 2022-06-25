package BasicsOfJava;

import org.junit.Test;

import java.io.File;

public class AT11_UserDir {

    @Test
    public void LearnPath(){
    File path = new File("C:\\Users\\etikalaj\\eclipse-workspace\\AmarProject\\src\\test\\java\\BasicsOfJava");
        System.out.println(System.getProperty("user.dir"));

        File path1 = new File(System.getProperty("user.dir")+"\\src\\test\\java\\BasicsOfJava");
        System.out.println(path1);

    }
}
