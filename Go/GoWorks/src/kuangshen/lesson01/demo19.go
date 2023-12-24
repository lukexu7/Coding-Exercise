package main

import "fmt"

func main() {

	a := 7
	b := 19
	c := a + b
	d := a - b
	e := a * b
	f := b / a
	g := b //a
	fmt.Println(a, b, c, d, e, f, g)
	a++
	fmt.Println(a)
	a--

	fmt.Println(a)
}
