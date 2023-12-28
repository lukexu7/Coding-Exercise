package main

import "fmt"

func main() {

	fmt.Println(getSum(5))

}

func getSum(a int) int {

	if a == 1 {
		return 1
	}

	return getSum(a-1) + a

}

func fib(n) int {

}
