package main

import "fmt"

func main() {

	n := 10
	defer f2(n)

	n++
	fmt.Println(n)

}

func f2(n int) {

	fmt.Println("函数中n=", n)

}
