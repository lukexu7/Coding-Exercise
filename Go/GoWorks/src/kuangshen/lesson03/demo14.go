package main

import "fmt"

// 闭包变量生命周期
func main() {

	r1 := increment()
	fmt.Println(r1)

	v1 := r1()
	fmt.Println(v1)

	r2 := increment()
	v3 := r2()
	fmt.Println(v3)
	fmt.Println(r2())

}

func increment() func() int {

	i := 0
	fun := func() int {
		i++
		return i
	}
	return fun
}
