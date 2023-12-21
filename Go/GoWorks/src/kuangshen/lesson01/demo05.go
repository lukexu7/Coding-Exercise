package main

import "fmt"

func main() {

	var a int = 100
	var b int = 200
	a, b = b, a
	fmt.Println(a)
	fmt.Println(b)

	c := "haha"
	d := "hihi"
	c, d = d, c
	fmt.Println(d, c)

}
