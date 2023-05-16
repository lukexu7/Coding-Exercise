package main

import "fmt"

// 全局变量和局部变量
var name = "bobby"
var age = 10
var ok bool

var ()

func main() {

	//1.先定义变量后使用
	//
	//var name string
	//
	//name = 1

	//name := "sab"

	//var age = 1

	//go 语言定义了变量不用是不行的

	sex := 1

	fmt.Println(sex)

	//2.多变量

	var user1, user2, user3 = "bobby", 1, "bobby3"
	fmt.Println(user1, user2, user3)

}
