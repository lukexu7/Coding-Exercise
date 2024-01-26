package main

import "fmt"

func main() {
	var arr1 = [5]int{1, 2, 3, 4, 5}
	fmt.Println(arr1)

	arr2 := [5]int{1, 2, 3, 4, 5}
	fmt.Println(arr2)

	var arr3 = [...]int{1, 2, 3, 4, 5, 6, 7}
	fmt.Println(arr3)
	fmt.Println(len(arr3))

	var arr4 [10]int
	arr4 = [10]int{1: 100, 5: 200}
	fmt.Println(arr4)

}
