package main

import "fmt"

func main() {
	a := 5.9
	b := int(a)

	fmt.Printf("%T,%.1f", a, a)
	fmt.Printf("%T,%d", b, b)

	t := 9

	fmt.Printf("%T,%d", t, t)
	fmt.Printf("%T,%d")

}
