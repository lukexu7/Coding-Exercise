package main

import "fmt"

func main() {

	m := max(34234, 234234)
	fmt.Println(m)

}

func f1() {

}

func max(num1 int, num2 int) int {

	var result int

	if num2 > num1 {
		result = num2
	} else {
		result = num1
	}

	return result

}
