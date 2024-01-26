package main

import "fmt"

func main() {

	num := 10
	fmt.Println(num)

	num2 := num
	fmt.Println(num2)

	arr1 := [4]int{}
	arr2 := [5]string{"aa", "bb"}

	fmt.Println("%T\n", arr1)
	fmt.Println("%T\n", arr2)

	arr3 := arr1
	fmt.Println(arr1)
	fmt.Println(arr3)

	arr3[0] = 123
	fmt.Println(arr1)
	fmt.Println(arr3)

}
