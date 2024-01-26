package main

import "fmt"

func main() {

	arr := [4]int{1, 2, 4, 5}
	fmt.Println(arr)

	var s1 []int
	fmt.Println(s1)

	if s1 == nil {
		fmt.Println("切片是空的")
	}

	s2 := []int{1, 2, 3, 4}
	fmt.Println(s2)
	fmt.Printf("%T,%T\n", arr, s2)
	fmt.Println(s2[1])

}
