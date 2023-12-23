package main

import "fmt"

func main() {

	var b1 bool = true
	var b2 bool = false
	println(b1, ",", b2)
	fmt.Printf("%T,%t", b1, b1)

	var b3 bool
	println(b3)
}
