package main

import "fmt"

func main() {

	var str string = "hello world"
	fmt.Printf("%T,%s\n", str, str)

	v1 := 'A'
	v2 := "A"
	fmt.Printf("%T,%s\n", v1, v1)
	fmt.Printf("%T,%s\n", v2, v2)

}
