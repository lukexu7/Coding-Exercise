package main

import "fmt"

func main() {

	var num int = 1000
	fmt.Println(num)

	//打印内存地址
	fmt.Printf("%d,%p", num, &num)

}
