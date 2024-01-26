package main

import "fmt"

func main() {

	var arr1 = [5]int{1, 23, 3, 4, 5}
	fmt.Println(arr1[1])

	for i := 0; i < len(arr1); i++ {

		fmt.Println(arr1[i])

	}

	for i, v := range arr1 {
		fmt.Println(i, v)
	}

}
