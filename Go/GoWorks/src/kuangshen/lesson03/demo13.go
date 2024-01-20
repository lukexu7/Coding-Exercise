package main

import "fmt"

// 回调函数
func main() {

	r1 := add(1, 2)
	fmt.Println(r1)

	r2 := oper(1, 2, add)
	fmt.Println(r2)

	r3 := oper(1, 2, sub)
	fmt.Println(r3)

	//匿名函数
	r4 := oper(5, 2, func(a, b int) int {
		return a * b
	})
	fmt.Println(r4)

}

func oper(a, b int, fun func(int, int) int) int {

	r := fun(a, b)
	return r

}

func add(a, b int) int {

	return a + b

}

func sub(a, b int) int {
	return a - b
}
