package com.atguigu10._enum;

import javax.swing.*;

/**
 * ClassName: SeasonTest1
 * Package: com.atguigu10._enum
 * Description:
 *
 * @Author: XZY
 * @Create: 2023/8/2 - 18:22
 * @Version: v1.0
 */


public class SeasonTest1 {

    public static void main(String[] args) {
        System.out.println(Season1.spring.getClass());
        System.out.println(Season1.spring.getClass().getSuperclass());


        System.out.println(Season1.spring.name());

        System.out.println(Season1.values());


        String name = "spring";

        System.out.println(Season1.valueOf(name).getClass());

        System.out.println(Season1.winter.ordinal());
    }
}


enum Season1{

    spring("春天","春"),
    summer("夏天","夏"),
    autumn("秋天","秋"),
    winter("冬天","冬");


    //声明当前类的对象的实例变量
    private final String seasonName;
    private final String seasonDesc;
    private Season1(String seasonName, String seasonDesc) {

        this.seasonName = seasonName;
        this.seasonDesc = seasonDesc;
    }

    public String getSeasonName() {
        return seasonName;
    }

    public String getSeasonDesc() {
        return seasonDesc;
    }



//    @Override
//    public String toString() {
//        return "Season{" +
//                "seasonName='" + seasonName + '\'' +
//                ", seasonDesc='" + seasonDesc + '\'' +
//                '}';
//    }

}
