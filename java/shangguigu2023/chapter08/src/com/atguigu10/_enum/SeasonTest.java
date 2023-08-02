package com.atguigu10._enum;

/**
 * ClassName: SeasonTest
 * Package: com.atguigu10._enum
 * Description:
 *
 * @Author: XZY
 * @Create: 2023/8/2 - 17:34
 * @Version: v1.0
 */


public class SeasonTest {

 public static void main(String[] args) {

  System.out.println(Season.Spring);


 }



}

class Season{

//声明当前类的对象的实例变量
 private final String seasonName;
 private final String seasonDesc;
private Season(String seasonName, String seasonDesc) {

 this.seasonName = seasonName;
 this.seasonDesc = seasonDesc;
}

 public String getSeasonName() {
  return seasonName;
 }

 public String getSeasonDesc() {
  return seasonDesc;
 }

 public static final Season Spring = new Season("春天","春");
 public static final Season summer = new Season("夏天","夏");
 public static final Season autumn = new Season("秋天","秋");
 public static final Season winter = new Season("冬天","冬");

 @Override
 public String toString() {
  return "Season{" +
          "seasonName='" + seasonName + '\'' +
          ", seasonDesc='" + seasonDesc + '\'' +
          '}';
 }
}
