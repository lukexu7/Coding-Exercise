package main

import "fmt"

const (
	a = 5
	b = 3
	c = iota
	d
)

func main() {
	fmt.Println(a, b, c, d)
}
func test() {

	const (
		a = iota
		b = iota
		c = iota
		d = 0
		e = iota
		f
		g
		h = iota
	)

	const (
		i = iota
		j = 0
		k = iota
	)

	fmt.Println(a, b, c, d, e, f, g, h)
	fmt.Println(i, j, k)
}
