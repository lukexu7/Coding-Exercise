package main

import "fmt"

func main() {

	var arr1 [5]int

	arr1[0] = 100
	arr1[1] = 200
	arr1[2] = 300
	arr1[3] = 400
	arr1[4] = 500

	fmt.Println(arr1)

	fmt.Println(arr1[1])

	fmt.Println(len(arr1))
	fmt.Println(cap(arr1))

}
