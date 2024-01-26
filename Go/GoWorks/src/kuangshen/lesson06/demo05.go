package main

import "fmt"

func main() {

	numbers := []int{1, 2, 3}
	fmt.Printf("len=%d,cap=%d,slice=%v\n", len(numbers), cap(numbers), numbers)

	numbers2 := make([]int, len(numbers), cap(numbers)*2)

	copy(numbers2, numbers)
	fmt.Printf("len=%d,cap=%d,slice=%v\n", len(numbers2), cap(numbers2), numbers2)

}
