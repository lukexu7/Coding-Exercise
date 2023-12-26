package main

import "fmt"

func main() {

	a := false

	switch a {
	case false:
		fmt.Println(1)
		fallthrough
	case true:
		fmt.Println(2)
		fallthrough
	case false:
		fmt.Println(3)
		fallthrough
	case true:
		fmt.Println(4)
		fallthrough
	default:
		fmt.Println(10)

	}
}
