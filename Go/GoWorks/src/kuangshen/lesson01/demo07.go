package main

import "fmt"

func main() {
	test()
	a, b := test()
	fmt.Println(a, b)
}

func test() (int, int) {

	return 100, 20
}
