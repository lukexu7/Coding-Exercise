package main

import "fmt"

func main() {

	//fmt.Println(fb(10))

	fmt.Println(fb2(50))

}

func fb(n int16) int {

	if n == 1 || n == 2 {
		return 1
	}

	return fb(n-1) + fb(n-2)
}

func fb2(n int) int {

	if n <= 2 {
		return 1
	}
	a, b := 1, 1
	for i := 1; i < n-1; i++ {

		a, b = b, a+b
	}

	return b

}
