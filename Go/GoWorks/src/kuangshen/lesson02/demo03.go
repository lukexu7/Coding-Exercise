package main

import "fmt"

func main() {

	var num1 int
	var num2 int
	fmt.Printf("请输入密码:\n")
	fmt.Scan(&num1)
	//fmt.Println(num1)

	if num1 == 123456 {
		fmt.Println("再次输入密码")
		fmt.Scan(&num2)
		if num2 == 123456 {
			print("登陆成功")
		} else {
			print("登陆失败")
		}
	} else {
		fmt.Println("登陆失败")
	}
}
