package main

import "fmt"

func main() {

	//数组

	arr1 := [4]int{1, 2, 3, 4}
	fmt.Println(arr1)
	update(arr1)
	fmt.Println("xxxxarr1", arr1)
}

func update(arr2 [4]int) {

	fmt.Println(arr2)

	arr2[0] = 100
	fmt.Println("xxxxarr2", arr2)

}
