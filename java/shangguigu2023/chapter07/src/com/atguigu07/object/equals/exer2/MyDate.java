package com.atguigu07.object.equals.exer2;

/**
 * ClassName: MyDate
 * Package: com.atguigu07.object.equals.exer2
 * Description:
 *
 * @Author: XZY
 * @Create: 2023/7/17 - 20:49
 * @Version: v1.0
 */


public class MyDate {

 private int day;
 private int month;
 private int year;

 public MyDate() {
 }

 public MyDate(int day, int month, int year) {
  this.day = day;
  this.month = month;
  this.year = year;
 }

 public int getDay() {
  return day;
 }

 public void setDay(int day) {
  this.day = day;
 }

 public int getMonth() {
  return month;
 }

 public void setMonth(int month) {
  this.month = month;
 }

 public int getYear() {
  return year;
 }

 public void setYear(int year) {
  this.year = year;
 }

 @Override
 public boolean equals(Object obj) {
  if(this == obj){
   return true;
  }
  
  if(obj instanceof MyDate){
   MyDate mydate = (MyDate)obj;
   return  this.day == mydate.day && this.month == mydate.month && this.year == mydate.year;
  }

  return false;

 }
}
