package com.atguigu05.map;


import org.junit.Test;

import javax.imageio.stream.FileImageInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * ClassName: PropertiesTest
 * Package: com.atguigu05.map
 * Description:
 *
 * @Author: XZY
 * @Create: 2023/12/13 - 22:28
 * @Version: v1.0
 */


public class PropertiesTest {

    @Test
    public void test() throws IOException {


        File file = new File("info.properties");
        System.out.println(file.getAbsoluteFile());
        FileInputStream fis = new FileInputStream(file);

        Properties pros = new Properties();
        pros.load(fis);

        System.out.println(pros.getProperty("name"));
        System.out.println(pros.getProperty("password"));

        fis.close();


    }
}
