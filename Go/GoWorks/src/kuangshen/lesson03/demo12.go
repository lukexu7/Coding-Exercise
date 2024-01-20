package main

import "fmt"

func main() {

	f12()

	f2 := f12

	f2()

	func() {
		fmt.Println("匿名函数")
	}()

	f3 := func() {

		fmt.Println("我是一个匿名函数")
	}

	f3()

	//匿名函数添加参数返回值

	func(a, b int) {
		fmt.Println("a,b")
	}(1, 2)

	r1 := func(a, b int) int {
		return a + b
	}(1, 2)
	fmt.Println(r1)
}

func f12() {
	fmt.Println("f12")

}
