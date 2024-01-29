package main

import "fmt"

func main() {

	arr1 := [4]int{1, 2, 3, 4}
	arr2 := arr1
	fmt.Println(arr1, arr2)
	arr1[0] = 100
	fmt.Println(arr1, arr2)

	s1 := []int{1, 2, 3, 4}
	s2 := s1
	fmt.Println(s1, s2)
	s1[0] = 100
	fmt.Println(s1, s2)

}
