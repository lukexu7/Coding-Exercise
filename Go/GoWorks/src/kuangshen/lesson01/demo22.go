package main

import "fmt"

func main() {

	var a int = 60
	var b int = 13

	fmt.Println(a & b)
	fmt.Println(a | b)
	fmt.Println(a ^ b)
	fmt.Println(a &^ b)
	fmt.Println(a << 3)
	fmt.Println(b >> 2)

}
